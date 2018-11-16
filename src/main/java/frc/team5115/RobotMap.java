package frc.team5115;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.team5115.Commands.IntakeOn;
import frc.team5115.robot.Robot;


public class RobotMap {
    //For testing purposes
    public static PowerDistributionPanel PDP;

    public static PWM PWMChannel0;
    public static PWM PWMChannel1;
    public static PWM PWMChannel2;
    public static PWM PWMChannel3;
    public static PWM PWMChannel4;
    public static PWM PWMChannel5;
    public static PWM PWMChannel6;
    public static PWM PWMChannel7;
    public static PWM PWMChannel8;
    public static PWM PWMChannel9;

    public static DigitalInput DIOChannel0;
    public static DigitalInput DIOChannel1;
    public static DigitalInput DIOChannel2;
    public static DigitalInput DIOChannel3;
    public static DigitalInput DIOChannel4;
    public static DigitalInput DIOChannel5;
    public static DigitalInput DIOChannel6;
    public static DigitalInput DIOChannel7;
    public static DigitalInput DIOChannel8;
    public static DigitalInput DIOChannel9;
    public static DigitalInput DIOChannel10;
    public static DigitalInput DIOChannel11;
    public static DigitalInput DIOChannel12;
    public static DigitalInput DIOChannel13;
    public static DigitalInput DIOChannel14;
    public static DigitalInput DIOChannel15;

    public static AnalogInput AnalogInput0;
    public static AnalogInput AnalogInput1;
    public static AnalogInput AnalogInput2;
    public static AnalogInput AnalogInput3;

    public static Relay RelayChannel0;
    public static Relay RelayChannel1;
    public static Relay RelayChannel2;
    public static Relay RelayChannel3;


    public static DriverStation DriverStation;

    //Component instantiation
    public static TalonSRX backLeft;
    public static TalonSRX backRight;
    public static TalonSRX frontLeft;
    public static TalonSRX frontRight;

    public static AHRS navx;

    public static DoubleSolenoid director;

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

    public RobotMap() {
        JoystickButton Intake = new JoystickButton(joystick, RobotMap.Intake);
        Intake.toggleWhenPressed(new IntakeOn());

        RobotMap.PDP = new PowerDistributionPanel();

        //10 PWM channels
        RobotMap.PWMChannel0 = new PWM(0);
        RobotMap.PWMChannel1 = new PWM(1);
        RobotMap.PWMChannel2 = new PWM(2);
        RobotMap.PWMChannel3 = new PWM(3);
        RobotMap.PWMChannel4 = new PWM(4);
        RobotMap.PWMChannel5 = new PWM(5);
        RobotMap.PWMChannel6 = new PWM(6);
        RobotMap.PWMChannel7 = new PWM(7);
        RobotMap.PWMChannel8 = new PWM(8);
        RobotMap.PWMChannel9 = new PWM(9);

        //16 DIO channels
        RobotMap.DIOChannel0 = new DigitalInput(0);
        RobotMap.DIOChannel1 = new DigitalInput(1);
        RobotMap.DIOChannel2 = new DigitalInput(2);
        RobotMap.DIOChannel3 = new DigitalInput(3);
        RobotMap.DIOChannel4 = new DigitalInput(4);
        RobotMap.DIOChannel5 = new DigitalInput(5);
        RobotMap.DIOChannel6 = new DigitalInput(6);
        RobotMap.DIOChannel7 = new DigitalInput(7);
        RobotMap.DIOChannel8 = new DigitalInput(8);
        RobotMap.DIOChannel9 = new DigitalInput(9);
        RobotMap.DIOChannel10 = new DigitalInput(10);
        RobotMap.DIOChannel11 = new DigitalInput(11);
        RobotMap.DIOChannel12 = new DigitalInput(12);
        RobotMap.DIOChannel13 = new DigitalInput(13);
        RobotMap.DIOChannel14 = new DigitalInput(14);
        RobotMap.DIOChannel15 = new DigitalInput(15);

        //4 Analog Inputs
        RobotMap.AnalogInput0 = new AnalogInput(0);
        RobotMap.AnalogInput1 = new AnalogInput(1);
        RobotMap.AnalogInput2 = new AnalogInput(2);
        RobotMap.AnalogInput3 = new AnalogInput(3);

        //4 Relay Channels
        RobotMap.RelayChannel0 = new Relay(0);
        RobotMap.RelayChannel1 = new Relay(1);
        RobotMap.RelayChannel2 = new Relay(2);
        RobotMap.RelayChannel3 = new Relay(3);

        RobotMap.DriverStation = DriverStation.getInstance();

        //Talons and Driving
        RobotMap.frontLeft = new TalonSRX(FrontLeftTalonID);
        RobotMap.frontRight = new TalonSRX(FrontRightTalonID);
        RobotMap.backLeft = new TalonSRX(BackLeftTalonID);
        RobotMap.backRight = new TalonSRX(BackRightTalonID);

        RobotMap.frontLeft.set(ControlMode.Follower, BackLeftTalonID);
        RobotMap.frontRight.set(ControlMode.Follower, BackRightTalonID);

        //Navx
        RobotMap.navx = new AHRS(SPI.Port.kMXP);

        //Solenoid
        RobotMap.director = new DoubleSolenoid(PCMID, IntakeForward, IntakeReverse);

        //Spark(maybe)
        RobotMap.leftIntake = new Spark(LeftIntakeSpark);
        RobotMap.rightIntake = new Spark(RightIntakeSpark);
    }
}
