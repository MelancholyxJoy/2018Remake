package frc.team5115.robot;

import edu.wpi.first.wpilibj.*;
import frc.team5115.Subsystems.*;
import frc.team5115.RobotMap;


import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.*;
import edu.wpi.first.wpilibj.can.*;


public class Robot extends IterativeRobot {
    public static RobotMap robotMap;

    //Subsystems
    public static BunnyDropper bunnyDropper;
    public static BunnyExtender bunnyExtender;
    public static Drive drive;
    public static Flap flap;
    public static Intake intake;

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


    @Override
    public void robotInit() {
        robotMap = new RobotMap();

        bunnyDropper = new BunnyDropper();
        bunnyExtender = new BunnyExtender();
        drive = new Drive();
        flap = new Flap();
        intake = new Intake();

        PDP = new PowerDistributionPanel();

        //10 PWM channels
        PWMChannel0 = new PWM(0);
        PWMChannel1 = new PWM(1);
        PWMChannel2 = new PWM(2);
        PWMChannel3 = new PWM(3);
        PWMChannel4 = new PWM(4);
        PWMChannel5 = new PWM(5);
        PWMChannel6 = new PWM(6);
        PWMChannel7 = new PWM(7);
        PWMChannel8 = new PWM(8);
        PWMChannel9 = new PWM(9);

        //16 DIO channels
        DIOChannel0 = new DigitalInput(0);
        DIOChannel1 = new DigitalInput(1);
        DIOChannel2 = new DigitalInput(2);
        DIOChannel3 = new DigitalInput(3);
        DIOChannel4 = new DigitalInput(4);
        DIOChannel5 = new DigitalInput(5);
        DIOChannel6 = new DigitalInput(6);
        DIOChannel7 = new DigitalInput(7);
        DIOChannel8 = new DigitalInput(8);
        DIOChannel9 = new DigitalInput(9);
        DIOChannel10 = new DigitalInput(10);
        DIOChannel11 = new DigitalInput(11);
        DIOChannel12 = new DigitalInput(12);
        DIOChannel13 = new DigitalInput(13);
        DIOChannel14 = new DigitalInput(14);
        DIOChannel15 = new DigitalInput(15);

        //4 Analog Inputs
        AnalogInput0 = new AnalogInput(0);
        AnalogInput1 = new AnalogInput(1);
        AnalogInput2 = new AnalogInput(2);
        AnalogInput3 = new AnalogInput(3);

        //4 Relay Channels
        RelayChannel0 = new Relay(0);
        RelayChannel1 = new Relay(1);
        RelayChannel2 = new Relay(2);
        RelayChannel3 = new Relay(3);

        DriverStation = DriverStation.getInstance();

        //Displaying data on shuffleboard
        SmartDashboard.putNumber("Battery Voltage", PDP.getVoltage());

        SmartDashboard.putNumber("Port 1 Current", PDP.getCurrent(1));
        SmartDashboard.putNumber("Port 2 Current", PDP.getCurrent(2));
        SmartDashboard.putNumber("Port 3 Current", PDP.getCurrent(3));
        SmartDashboard.putNumber("Port 4 Current", PDP.getCurrent(4));
        SmartDashboard.putNumber("Port 5 Current", PDP.getCurrent(5));
        SmartDashboard.putNumber("Port 6 Current", PDP.getCurrent(6));
        SmartDashboard.putNumber("Port 7 Current", PDP.getCurrent(7));
        SmartDashboard.putNumber("Port 8 Current", PDP.getCurrent(8));
        SmartDashboard.putNumber("Port 9 Current", PDP.getCurrent(9));
        SmartDashboard.putNumber("Port 10 Current", PDP.getCurrent(10));
        SmartDashboard.putNumber("Port 11 Current", PDP.getCurrent(11));
        SmartDashboard.putNumber("Port 12 Current", PDP.getCurrent(12));

        SmartDashboard.putNumber("PWN Channel 0 Raw Values", PWMChannel0.getRaw());
        SmartDashboard.putNumber("PWN Channel 1 Raw Values", PWMChannel1.getRaw());
        SmartDashboard.putNumber("PWN Channel 2 Raw Values", PWMChannel2.getRaw());
        SmartDashboard.putNumber("PWN Channel 3 Raw Values", PWMChannel3.getRaw());
        SmartDashboard.putNumber("PWN Channel 4 Raw Values", PWMChannel4.getRaw());
        SmartDashboard.putNumber("PWN Channel 5 Raw Values", PWMChannel5.getRaw());
        SmartDashboard.putNumber("PWN Channel 6 Raw Values", PWMChannel6.getRaw());
        SmartDashboard.putNumber("PWN Channel 7 Raw Values", PWMChannel7.getRaw());
        SmartDashboard.putNumber("PWN Channel 8 Raw Values", PWMChannel8.getRaw());
        SmartDashboard.putNumber("PWN Channel 9 Raw Values", PWMChannel9.getRaw());

        SmartDashboard.putBoolean("DIO Channel 0", DIOChannel0.get());
        SmartDashboard.putBoolean("DIO Channel 1", DIOChannel1.get());
        SmartDashboard.putBoolean("DIO Channel 2", DIOChannel2.get());
        SmartDashboard.putBoolean("DIO Channel 3", DIOChannel3.get());
        SmartDashboard.putBoolean("DIO Channel 4", DIOChannel4.get());
        SmartDashboard.putBoolean("DIO Channel 5", DIOChannel5.get());
        SmartDashboard.putBoolean("DIO Channel 6", DIOChannel6.get());
        SmartDashboard.putBoolean("DIO Channel 7", DIOChannel7.get());
        SmartDashboard.putBoolean("DIO Channel 8", DIOChannel8.get());
        SmartDashboard.putBoolean("DIO Channel 9", DIOChannel9.get());
        SmartDashboard.putBoolean("DIO Channel 10", DIOChannel10.get());
        SmartDashboard.putBoolean("DIO Channel 11", DIOChannel11.get());
        SmartDashboard.putBoolean("DIO Channel 12", DIOChannel12.get());
        SmartDashboard.putBoolean("DIO Channel 13", DIOChannel13.get());
        SmartDashboard.putBoolean("DIO Channel 14", DIOChannel14.get());
        SmartDashboard.putBoolean("DIO Channel 15", DIOChannel15.get());

        SmartDashboard.putNumber("Analog Input Channel 0 Values", AnalogInput0.getValue());
        SmartDashboard.putNumber("Analog Input Channel 1 Values", AnalogInput1.getValue());
        SmartDashboard.putNumber("Analog Input Channel 2 Values", AnalogInput2.getValue());
        SmartDashboard.putNumber("Analog Input Channel 3 Values", AnalogInput3.getValue());

        SmartDashboard.putBoolean("Relay Channel 0 Values", RelayChannel0.isAlive());
        SmartDashboard.putBoolean("Relay Channel 1 Values", RelayChannel1.isAlive());
        SmartDashboard.putBoolean("Relay Channel 2 Values", RelayChannel2.isAlive());
        SmartDashboard.putBoolean("Relay Channel 3 Values", RelayChannel3.isAlive());


    }

    @Override
    public void disabledInit() { }

    @Override
    public void autonomousInit() { }


    public void teleopInit() {
    }

    @Override
    public void testInit() { }


    @Override
    public void disabledPeriodic() { }
    
    @Override
    public void autonomousPeriodic() { }

    @Override
    public void teleopPeriodic() {
        drive.Drive();
    }

    @Override
    public void testPeriodic() { }
}