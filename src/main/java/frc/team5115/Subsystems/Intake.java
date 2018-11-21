package frc.team5115.Subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team5115.RobotMap;

public class Intake extends Subsystem {
    @Override
    protected void initDefaultCommand() { }

    public void Intaking() {
        RobotMap.leftIntake.set(RobotMap.IntakeOnSpeed);
        RobotMap.rightIntake.set(-RobotMap.IntakeOnSpeed);
    }
    public void IntakeOff() {
        RobotMap.leftIntake.set(0);
        RobotMap.rightIntake.set(0);
    }
}
