package frc.team5115.Systems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team5115.Commands.Controller;
import frc.team5115.robot.Constants;

public class ControlCentral extends Subsystem {

    private TalonSRX backLeft;
    private TalonSRX backRight;
    private TalonSRX frontLeft;
    private TalonSRX frontRight;
    private TalonSRX intake;

    public DoubleSolenoid launchBunny;

    private Spark outtake;

    public Spark ballSorter;
    public Spark ballSifter;
    public DigitalInput homePosition;
    public DigitalInput ourPosition;
    public DigitalInput theirPosition;

    public ControlCentral(){
        backLeft = new TalonSRX(Constants.BackLeftTalonID);
        backRight = new TalonSRX(Constants.BackRightTalonID);
        frontLeft = new TalonSRX(Constants.FrontLeftTalonID);
        frontRight= new TalonSRX(Constants.FrontRightTalonID);

        frontLeft.set(ControlMode.Follower, Constants.BackLeftTalonID);
        frontRight.set(ControlMode.Follower, Constants.BackRightTalonID);

        backRight.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 5);
        backLeft.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 5);

        intake = new TalonSRX(Constants.IntakeTalon);
        intake.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 5);

        outtake = new Spark(Constants.OuttakeSparkID);

        launchBunny = new DoubleSolenoid(Constants.PCMIDBunny, Constants.BunnyForward, Constants.BunnyReverse);

        ballSorter = new Spark(Constants.BallSorterID);
        ballSifter = new Spark(Constants.BallSifterID);

        homePosition = new DigitalInput(Constants.HomePositionLimitSwitchID);
        ourPosition = new DigitalInput(Constants.OurPositionLimitSwitchID);
        theirPosition = new DigitalInput(Constants.TheirPositionLimitSwitchID);
    }
    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new Controller());
    }

    public void Drive(double xaxis, double  yaxis, double throttle) {
        double leftspeed = (yaxis + (xaxis * Constants.XSensitivity)) * throttle;
        double rightspeed = (yaxis - (xaxis * Constants.XSensitivity)) * throttle;

        backLeft.set(ControlMode.PercentOutput, leftspeed);
        backRight.set(ControlMode.PercentOutput, rightspeed);
    }
    public void takein(double IntakeSpeed) {
        intake.set(ControlMode.PercentOutput, IntakeSpeed);
    }
    public void takeout(double OuttakeSpeed) {
        outtake.set(-OuttakeSpeed);
    }
    public void launch() {
        launchBunny.set(DoubleSolenoid.Value.kForward);
    }
    public void retract() {
        launchBunny.set(DoubleSolenoid.Value.kReverse);
    }
    public void nolaunch() {
        launchBunny.set(DoubleSolenoid.Value.kOff);
    }
    public void TurnSorter(double speed) {
        ballSorter.set(speed);
    }
    public void TurnSifter(double speed) {
        ballSifter.set(speed);
    }
}

