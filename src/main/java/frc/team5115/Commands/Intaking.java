package frc.team5115.Commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.robot.*;

public class Intaking extends Command {

    public Intaking() { requires(Robot.intake); }
    protected void initialize() {
        Robot.intake.Intaking();
    }
    protected boolean isFinished() {
        return true;
    }
    protected void end() {
        Robot.intake.IntakeOff();
    }
    protected void interrupted() {
        end();
    }
}
