package frc.team5115.Subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DriverStation.*;
import frc.team5115.RobotMap;

public class Flap extends Subsystem {

    @Override
    protected void initDefaultCommand() {
    }
    public void OurColorFlap() {
        RobotMap.director.set(DoubleSolenoid.Value.kForward);
    }
    public void OpposingColorFlap() {
        RobotMap.director.set(DoubleSolenoid.Value.kReverse);
    }
}
