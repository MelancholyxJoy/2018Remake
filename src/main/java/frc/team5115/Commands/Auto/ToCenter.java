package frc.team5115.Commands.Auto;

import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.robot.Constants;
import frc.team5115.robot.Robot;

public class ToCenter extends Command {
    public ToCenter() { requires(Robot.driveTrain);}
    protected void execute() { Robot.driveTrain.StartLine(22, Constants.AutoForwardSpeed);}
    protected boolean isFinished() { return false; }
}
