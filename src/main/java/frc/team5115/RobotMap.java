package frc.team5115;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Spark;
import frc.team5115.Commands.IntakeOn;


public class RobotMap {
    //Component instantiation
    public static TalonSRX backLeft;
    public static TalonSRX backRight;
    public static TalonSRX frontLeft;
    public static TalonSRX frontRight;

    public static AHRS navx;

    public static DoubleSolenoid flap;

    public static Spark leftIntake;
    public static Spark rightIntake;

    //Component ID's
    public static final int FrontLeftTalonID = 3;
    public static final int FrontRightTalonID = 4;
    public static final int BackLeftTalonID = 1;
    public static final int BackRightTalonID = 2;

    public static final int LeftIntakeSpark = 1;
    public static final int RightIntakeSpark = 2;

    public static final int PCMID = 1;

    public static final int IntakeForward = 1;
    public static final int IntakeReverse = 2;

    //Button ID's
    public static final int Intake = 5;
    //public static final int Flap = 6;
    public static final int ExtendBunnyArm = 7;
    public static final int RetractBunnyArm = 8;
    public static final int DropBunny = 9;

    //Robot Attributes
    public static final int IntakeOnSpeed = 1;

    //Joystick
    public static Joystick joystick = new Joystick(0);

    //Button Commands
    public static double XValue() { return joystick.getX();}
    public static double YValue() { return joystick.getY();}
    public static double Throttle() { return ((-joystick.getThrottle() + 1) / 2);}
    public static boolean Intake() { return joystick.getRawButton(Intake);}
    //public static boolean Flap() {return joystick.getRawButton(Flap);}

    public RobotMap() {
        JoystickButton Intake = new JoystickButton(joystick, RobotMap.Intake);
        Intake.toggleWhenPressed(new IntakeOn());

        //Talons and Driving
        frontLeft = new TalonSRX(FrontLeftTalonID);
        frontRight = new TalonSRX(FrontRightTalonID);
        backLeft = new TalonSRX(BackLeftTalonID);
        backRight = new TalonSRX(BackRightTalonID);

        frontLeft.set(ControlMode.Follower, BackLeftTalonID);
        frontRight.set(ControlMode.Follower, BackRightTalonID);

        //Navx
        navx = new AHRS(SPI.Port.kMXP);

        //Solenoid
        flap = new DoubleSolenoid(PCMID, IntakeForward, IntakeReverse);

        //Spark(maybe)
        leftIntake = new Spark(LeftIntakeSpark);
        rightIntake = new Spark(RightIntakeSpark);
    }
}
