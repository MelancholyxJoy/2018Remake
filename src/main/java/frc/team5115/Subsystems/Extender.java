package frc.team5115.Subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team5115.RobotMap;

public class Extender extends Subsystem {
    @Override
    protected void initDefaultCommand() { }
    public void Extend() {
        RobotMap.extender.set(DoubleSolenoid.Value.kForward);
    }
}
