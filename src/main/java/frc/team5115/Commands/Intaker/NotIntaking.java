package frc.team5115.Commands.Intaker;

import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.robot.Robot;

public class NotIntaking extends Command {

    public NotIntaking() { requires(Robot.intake);}
    protected void execute() { Robot.intake.takein(0);}
    protected boolean isFinished() { return false; }
}
