package frc.team5115.Autonomus;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.DriverStation;

import frc.team5115.Logger.Reader;
import frc.team5115.RobotMap;

public class AutoDrive {
    public AutoDrive() {
        if (DriverStation.getInstance().isAutonomous() == true) {
            double leftspeed = (Reader.yvalue + Reader.xvalue) * Reader.throttle;
            double rightspeed = -(Reader.yvalue - Reader.xvalue) * Reader.throttle;

            RobotMap.backLeft.set(ControlMode.PercentOutput, leftspeed);
            RobotMap.backRight.set(ControlMode.PercentOutput, rightspeed);
        }
    }
}
