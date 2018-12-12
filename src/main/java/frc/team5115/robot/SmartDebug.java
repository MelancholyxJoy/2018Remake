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

        AnalogInput0 = new AnalogInput(0);
        AnalogInput1 = new AnalogInput(1);
        AnalogInput2 = new AnalogInput(2);
        AnalogInput3 = new AnalogInput(3);

        RelayChannel0 = new Relay(0);
        RelayChannel1 = new Relay(1);
        RelayChannel2 = new Relay(2);
        RelayChannel3 = new Relay(3);

        //Displaying data on shuffleboard
        if (PDP != null) {
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
        }

        if (PWMChannel0 != null) SmartDashboard.putNumber("PWN Channel 0 Raw Values", PWMChannel0.getRaw());
        if (PWMChannel1 != null) SmartDashboard.putNumber("PWN Channel 1 Raw Values", PWMChannel1.getRaw());
        if (PWMChannel2 != null) SmartDashboard.putNumber("PWN Channel 2 Raw Values", PWMChannel2.getRaw());
        if (PWMChannel3 != null) SmartDashboard.putNumber("PWN Channel 3 Raw Values", PWMChannel3.getRaw());
        if (PWMChannel4 != null) SmartDashboard.putNumber("PWN Channel 4 Raw Values", PWMChannel4.getRaw());
        if (PWMChannel5 != null) SmartDashboard.putNumber("PWN Channel 5 Raw Values", PWMChannel5.getRaw());
        if (PWMChannel6 != null) SmartDashboard.putNumber("PWN Channel 6 Raw Values", PWMChannel6.getRaw());
        if (PWMChannel7 != null) SmartDashboard.putNumber("PWN Channel 7 Raw Values", PWMChannel7.getRaw());
        if (PWMChannel8 != null) SmartDashboard.putNumber("PWN Channel 8 Raw Values", PWMChannel8.getRaw());
        if (PWMChannel9 != null) SmartDashboard.putNumber("PWN Channel 9 Raw Values", PWMChannel9.getRaw());

        if (DIOChannel0 != null) SmartDashboard.putBoolean("DIO Channel 0", DIOChannel0.get());
        if (DIOChannel1 != null) SmartDashboard.putBoolean("DIO Channel 1", DIOChannel1.get());
        if (DIOChannel2 != null) SmartDashboard.putBoolean("DIO Channel 2", DIOChannel2.get());
        if (DIOChannel3 != null) SmartDashboard.putBoolean("DIO Channel 3", DIOChannel3.get());
        if (DIOChannel4 != null) SmartDashboard.putBoolean("DIO Channel 4", DIOChannel4.get());
        if (DIOChannel5 != null) SmartDashboard.putBoolean("DIO Channel 5", DIOChannel5.get());
        if (DIOChannel6 != null) SmartDashboard.putBoolean("DIO Channel 6", DIOChannel6.get());
        if (DIOChannel7 != null) SmartDashboard.putBoolean("DIO Channel 7", DIOChannel7.get());
        if (DIOChannel8 != null) SmartDashboard.putBoolean("DIO Channel 8", DIOChannel8.get());
        if (DIOChannel9 != null) SmartDashboard.putBoolean("DIO Channel 9", DIOChannel9.get());
        if (DIOChannel10 != null) SmartDashboard.putBoolean("DIO Channel 10", DIOChannel10.get());
        if (DIOChannel11 != null) SmartDashboard.putBoolean("DIO Channel 11", DIOChannel11.get());
        if (DIOChannel12 != null) SmartDashboard.putBoolean("DIO Channel 12", DIOChannel12.get());
        if (DIOChannel13 != null) SmartDashboard.putBoolean("DIO Channel 13", DIOChannel13.get());
        if (DIOChannel14 != null) SmartDashboard.putBoolean("DIO Channel 14", DIOChannel14.get());
        if (DIOChannel15 != null) SmartDashboard.putBoolean("DIO Channel 15", DIOChannel15.get());

        if (AnalogInput0 != null) SmartDashboard.putNumber("Analog Input Channel 0 Values", AnalogInput0.getValue());
        if (AnalogInput1 != null) SmartDashboard.putNumber("Analog Input Channel 1 Values", AnalogInput1.getValue());
        if (AnalogInput2 != null) SmartDashboard.putNumber("Analog Input Channel 2 Values", AnalogInput2.getValue());
        if (AnalogInput3 != null) SmartDashboard.putNumber("Analog Input Channel 3 Values", AnalogInput3.getValue());

        if (RelayChannel0 != null) SmartDashboard.putBoolean("Relay Channel 0 Values", RelayChannel0.isAlive());
        if (RelayChannel1 != null) SmartDashboard.putBoolean("Relay Channel 1 Values", RelayChannel1.isAlive());
        if (RelayChannel2 != null) SmartDashboard.putBoolean("Relay Channel 2 Values", RelayChannel2.isAlive());
        if (RelayChannel3 != null) SmartDashboard.putBoolean("Relay Channel 3 Values", RelayChannel3.isAlive());

        SmartDashboard.putNumber("Left Side Encoder Values", driveTrain.distanceTraveledLeft());
        SmartDashboard.putNumber("Right Side Encoder Values", driveTrain.distanceTraveledRight());
    }
}
