package frc.team5115.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.command.Subsystem;

import static frc.team5115.RobotMap.*;
import frc.team5115.RobotMap;

public class Drive extends Subsystem {
    @Override
    protected void initDefaultCommand() { }

    public void Drive() {
        double leftspeed = (YValue() + XValue()) * Throttle();
        double rightspeed = (-YValue() - XValue()) * Throttle();


        RobotMap.backLeft.set(ControlMode.PercentOutput, leftspeed);
        RobotMap.backRight.set(ControlMode.PercentOutput, rightspeed);
    }
}
