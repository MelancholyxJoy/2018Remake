package frc.team5115.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team5115.Systems.DriveTrain;

public class SmartDebug {
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

        public static DriveTrain driveTrain;

    public void SmartDebug() {
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

        SmartDashboard.putNumber("Left Side Encoder Values", driveTrain.distanceTraveledLeft());
        SmartDashboard.putNumber("Right Side Encoder Values", driveTrain.distanceTraveledRight());
    }
}
