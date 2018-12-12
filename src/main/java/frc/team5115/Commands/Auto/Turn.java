package frc.team5115.Commands.Auto;

import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.robot.Constants;
import frc.team5115.robot.Robot;

public class Turn extends Command {
    public Turn() { requires( Robot.driveTrain);}
    protected void initialize() { }
    protected void execute() { Robot.driveTrain.StartTurn(90, Constants.AutoTurnSpeed); }
    protected boolean isFinished() { return false; }
    protected void end() { Robot.driveTrain.StartTurn(0,0);}
}
