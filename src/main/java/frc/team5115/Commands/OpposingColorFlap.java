package frc.team5115.Commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.robot.Robot;

public class OpposingColorFlap extends Command {
    public OpposingColorFlap() { requires(Robot.flap);}
    protected void initialize() { Robot.flap.OpposingColorFlap(); }
    protected boolean isFinished() { return true; }
    protected void end() { Robot.flap.OpposingColorFlap(); }
    protected void interrupted() { end(); }
}
