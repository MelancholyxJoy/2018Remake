package frc.team5115.Systems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.Joystick;
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
    public double targetDistance;
    public double targetAngle;

    public double distanceTraveled = backRight.getSelectedSensorPosition(0);
    public double yaw = navx.getYaw();

    PID forwardController;
    PID turnController;

    public static Joystick joystick = new Joystick(0);


    public DriveTrain(){
        frontLeft = new TalonSRX(Constants.FrontLeftTalonID);
        frontRight = new TalonSRX(Constants.FrontRightTalonID);
        backLeft = new TalonSRX(Constants.BackLeftTalonID);
        backRight = new TalonSRX(Constants.BackRightTalonID);

        frontLeft.set(ControlMode.Follower, Constants.BackLeftTalonID);
        frontRight.set(ControlMode.Follower, Constants.BackRightTalonID);

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
        targetDistance = distanceTraveled + distance;
        targetAngle = yaw;

        forwardController = new PID(Constants.AUTO_FORWARD_KP, Constants.AUTO_FORWARD_KI, Constants.AUTO_FORWARD_KD , speed);
        turnController = new PID(Constants.AUTO_TURN_KP, Constants.AUTO_TURN_KI ,Constants.AUTO_TURN_KD);
    }
    public void StartTurn(double angle, double speed) {
        line = false;
        targetDistance = distanceTraveled;
        targetAngle = yaw + angle;

        forwardController = new PID(Constants.AUTO_FORWARD_KP, Constants.AUTO_FORWARD_KI, Constants.AUTO_FORWARD_KD);
        turnController = new PID(Constants.TURN_KP, Constants.TURN_KI ,Constants.TURN_KD, speed);
    }
}
