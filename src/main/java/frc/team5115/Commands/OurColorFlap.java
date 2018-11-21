package frc.team5115.Commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.robot.Robot;

public class OurColorFlap extends Command {

    public OurColorFlap() { requires(Robot.flap);}
    protected void initialize() { Robot.flap.OurColorFlap(); }
    protected boolean isFinished() { return true; }
    protected void end() { Robot.flap.OpposingColorFlap(); }
    protected void interrupted() { end(); }
}
