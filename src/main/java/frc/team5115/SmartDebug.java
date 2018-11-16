package frc.team5115;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team5115.robot.Robot;


public class SmartDebug {
    public void SmartDebug() {
        //Displaying data on shuffleboard
        SmartDashboard.putNumber("Battery Voltage", RobotMap.PDP.getVoltage());

        SmartDashboard.putNumber("Port 1 Current", RobotMap.PDP.getCurrent(1));
        SmartDashboard.putNumber("Port 2 Current", RobotMap.PDP.getCurrent(2));
        SmartDashboard.putNumber("Port 3 Current", RobotMap.PDP.getCurrent(3));
        SmartDashboard.putNumber("Port 4 Current", RobotMap.PDP.getCurrent(4));
        SmartDashboard.putNumber("Port 5 Current", RobotMap.PDP.getCurrent(5));
        SmartDashboard.putNumber("Port 6 Current", RobotMap.PDP.getCurrent(6));
        SmartDashboard.putNumber("Port 7 Current", RobotMap.PDP.getCurrent(7));
        SmartDashboard.putNumber("Port 8 Current", RobotMap.PDP.getCurrent(8));
        SmartDashboard.putNumber("Port 9 Current", RobotMap.PDP.getCurrent(9));
        SmartDashboard.putNumber("Port 10 Current", RobotMap.PDP.getCurrent(10));
        SmartDashboard.putNumber("Port 11 Current", RobotMap.PDP.getCurrent(11));
        SmartDashboard.putNumber("Port 12 Current", RobotMap.PDP.getCurrent(12));

        SmartDashboard.putNumber("PWN Channel 0 Raw Values", RobotMap.PWMChannel0.getRaw());
        SmartDashboard.putNumber("PWN Channel 1 Raw Values", RobotMap.PWMChannel1.getRaw());
        SmartDashboard.putNumber("PWN Channel 2 Raw Values", RobotMap.PWMChannel2.getRaw());
        SmartDashboard.putNumber("PWN Channel 3 Raw Values", RobotMap.PWMChannel3.getRaw());
        SmartDashboard.putNumber("PWN Channel 4 Raw Values", RobotMap.PWMChannel4.getRaw());
        SmartDashboard.putNumber("PWN Channel 5 Raw Values", RobotMap.PWMChannel5.getRaw());
        SmartDashboard.putNumber("PWN Channel 6 Raw Values", RobotMap.PWMChannel6.getRaw());
        SmartDashboard.putNumber("PWN Channel 7 Raw Values", RobotMap.PWMChannel7.getRaw());
        SmartDashboard.putNumber("PWN Channel 8 Raw Values", RobotMap.PWMChannel8.getRaw());
        SmartDashboard.putNumber("PWN Channel 9 Raw Values", RobotMap.PWMChannel9.getRaw());

        SmartDashboard.putBoolean("DIO Channel 0", RobotMap.DIOChannel0.get());
        SmartDashboard.putBoolean("DIO Channel 1", RobotMap.DIOChannel1.get());
        SmartDashboard.putBoolean("DIO Channel 2", RobotMap.DIOChannel2.get());
        SmartDashboard.putBoolean("DIO Channel 3", RobotMap.DIOChannel3.get());
        SmartDashboard.putBoolean("DIO Channel 4", RobotMap.DIOChannel4.get());
        SmartDashboard.putBoolean("DIO Channel 5", RobotMap.DIOChannel5.get());
        SmartDashboard.putBoolean("DIO Channel 6", RobotMap.DIOChannel6.get());
        SmartDashboard.putBoolean("DIO Channel 7", RobotMap.DIOChannel7.get());
        SmartDashboard.putBoolean("DIO Channel 8", RobotMap.DIOChannel8.get());
        SmartDashboard.putBoolean("DIO Channel 9", RobotMap.DIOChannel9.get());
        SmartDashboard.putBoolean("DIO Channel 10", RobotMap.DIOChannel10.get());
        SmartDashboard.putBoolean("DIO Channel 11", RobotMap.DIOChannel11.get());
        SmartDashboard.putBoolean("DIO Channel 12", RobotMap.DIOChannel12.get());
        SmartDashboard.putBoolean("DIO Channel 13", RobotMap.DIOChannel13.get());
        SmartDashboard.putBoolean("DIO Channel 14", RobotMap.DIOChannel14.get());
        SmartDashboard.putBoolean("DIO Channel 15", RobotMap.DIOChannel15.get());

        SmartDashboard.putNumber("Analog Input Channel 0 Values", RobotMap.AnalogInput0.getValue());
        SmartDashboard.putNumber("Analog Input Channel 1 Values", RobotMap.AnalogInput1.getValue());
        SmartDashboard.putNumber("Analog Input Channel 2 Values", RobotMap.AnalogInput2.getValue());
        SmartDashboard.putNumber("Analog Input Channel 3 Values", RobotMap.AnalogInput3.getValue());

        SmartDashboard.putBoolean("Relay Channel 0 Values", RobotMap.RelayChannel0.isAlive());
        SmartDashboard.putBoolean("Relay Channel 1 Values", RobotMap.RelayChannel1.isAlive());
        SmartDashboard.putBoolean("Relay Channel 2 Values", RobotMap.RelayChannel2.isAlive());
        SmartDashboard.putBoolean("Relay Channel 3 Values", RobotMap.RelayChannel3.isAlive());

        SmartDashboard.putNumber("Left Side Encoder Values", RobotMap.backLeft.getSelectedSensorPosition(0));
        SmartDashboard.putNumber("Right Side Encoder Values", RobotMap.backRight.getSelectedSensorPosition(0));
    }
}
