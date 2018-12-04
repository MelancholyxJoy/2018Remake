package frc.team5115.Commands.Intaker;

import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.robot.*;

public class Intaking extends Command {

    public Intaking() { requires(Robot.intake); }
    protected void execute() { Robot.intake.takein(Constants.IntakeOnSpeed); }
    protected boolean isFinished() {
        return false;
    }
}
