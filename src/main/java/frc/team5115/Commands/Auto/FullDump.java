package frc.team5115.Commands.Auto;

import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.robot.Constants;
import frc.team5115.robot.Robot;

public class FullDump extends Command {
    public FullDump() { requires(Robot.outtake);}
    protected void execute() { Robot.outtake.takeout(Constants.FullDump);}
    protected boolean isFinished() { return false; }
}
