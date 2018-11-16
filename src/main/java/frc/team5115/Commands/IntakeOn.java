package frc.team5115.Commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.robot.*;

public class IntakeOn extends Command {

    public IntakeOn() {
        requires(Robot.intake);
    }
    protected void initialize() {
        Robot.intake.IntakeOn();
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() {
        Robot.intake.IntakeOff();
    }
    protected void interrupted() {
        end();
    }
}
