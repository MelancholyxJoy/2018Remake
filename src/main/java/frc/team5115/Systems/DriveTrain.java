package frc.team5115.Systems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team5115.Commands.Drive;
import frc.team5115.PID;
import frc.team5115.robot.Constants;

public class DriveTrain extends Subsystem {

    public static TalonSRX frontLeft;
    public static TalonSRX frontRight;
    public static TalonSRX backLeft;
    public static TalonSRX backRight;

    public static AHRS navx;

    public boolean line = false;
    public boolean done = false;
    public double targetDistance;
    public double targetAngle;

    public double distanceTraveledRight = backRight.getSelectedSensorPosition(0) / 1440 * 6 * Math.PI / 12;
    public double distanceTraveledLeft = backLeft.getSelectedSensorPosition(0) / 1440 * 6 * Math.PI / 12;
    //public double averageDistance = (distanceTraveledLeft + distanceTraveledRight) / 2;
    public double leftSpeed = ((backLeft.getSelectedSensorVelocity(0) * 6 * Math.PI * 10)  / (1440 * 12));
    public double rightSpeed = ((backRight.getSelectedSensorVelocity(0) * 6 * Math.PI * 10)  / (1440 * 12));
    public double averageSpeed = (leftSpeed + rightSpeed) / 2;
    public double turnVelocity = navx.getRate();
    public double yaw = navx.getYaw();

    PID forwardController;
    PID turnController;

    public DriveTrain(){
        frontLeft = new TalonSRX(Constants.FrontLeftTalonID);
        frontRight = new TalonSRX(Constants.FrontRightTalonID);
        backLeft = new TalonSRX(Constants.BackLeftTalonID);
        backRight = new TalonSRX(Constants.BackRightTalonID);

        frontLeft.set(ControlMode.Follower, Constants.BackLeftTalonID);
        frontRight.set(ControlMode.Follower, Constants.BackRightTalonID);

        backRight.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 5);
        backLeft.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 5);

        navx = new AHRS(SPI.Port.kMXP);
    }
    @Override
    protected void initDefaultCommand() { new Drive();}

    public void Drive(double xaxis, double  yaxis, double throt) {
        double leftspeed = (xaxis + yaxis) * throt;
        double rightspeed = (yaxis - xaxis) * throt;

        backLeft.set(ControlMode.PercentOutput, leftspeed);
        backRight.set(ControlMode.PercentOutput, rightspeed);
    }
    public void StartLine(double distance, double speed) {
        line = true;
        targetDistance = distanceTraveledRight + distance;
        targetAngle = yaw;

        forwardController = new PID(Constants.AutoForwardKP, Constants.AutoForwardKI, Constants.AutoForwardKD, speed);
        turnController = new PID(Constants.AutoTurnKP, Constants.AutoTurnKI,Constants.AutoTurnKD);
    }
    public void StartTurn(double angle, double speed) {
        line = false;
        targetDistance = distanceTraveledRight;
        targetAngle = yaw + angle;

        forwardController = new PID(Constants.AutoForwardKP, Constants.AutoForwardKI, Constants.AutoForwardKD);
        turnController = new PID(Constants.TurnKP, Constants.TurnKI,Constants.TurnKD, speed);
    }
    public void Auto() {
        double clearYaw = clearSteer(yaw, targetAngle);
        double Forward = forwardController.getPID(targetDistance, distanceTraveledRight, averageSpeed);
        double Turn = turnController.getPID(targetAngle, clearYaw, turnVelocity);

        if (!line && Math.abs(turnController.getError()) > 4 * Constants.TurnTolerance) {
            Turn += 0.15 * Math.signum(Turn);
        }
        StartLine(Forward, Constants.AutoForwardSpeed);
        StartTurn(Turn, Constants.AutoTurnSpeed);

        if (forwardController.isFinished(Constants.ForwardTolerance, Constants.ForwardDTolerance) && turnController.isFinished(Constants.TurnTolerance, Constants.TurnDTolerance)) {
            StartLine(0,0);
            StartTurn(0,0);
            done = true;
        }
        if (done == true) {
            StartLine(0,0);
            StartTurn(0,0);

            forwardController = null;
            turnController = null;
        }
    }
    public double clearSteer(double yaw, double target) {
        if (Math.abs(target - yaw) > 180) {
            if (target < 180) {
                yaw -= 360;
            } else {
                yaw += 360;
            }
        }
        return yaw;
    }
}
