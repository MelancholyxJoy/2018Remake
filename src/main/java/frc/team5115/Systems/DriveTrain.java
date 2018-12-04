package frc.team5115.Systems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team5115.Commands.Drive;
import frc.team5115.robot.Constants;

public class DriveTrain extends Subsystem {

    public static TalonSRX frontLeft;
    public static TalonSRX frontRight;
    public static TalonSRX backLeft;
    public static TalonSRX backRight;

    public static AHRS navx;

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
    public void AutoDrive(double speed, double turn) {
        double autoleftspeed = speed + turn;
        double autorightspeed = speed - turn;

        backLeft.set(ControlMode.PercentOutput, autoleftspeed);
        backRight.set(ControlMode.PercentOutput, autorightspeed);
    }
}
