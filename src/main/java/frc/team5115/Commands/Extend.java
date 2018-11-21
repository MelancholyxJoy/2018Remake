package frc.team5115.Commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.robot.Robot;

public class Extend extends Command {

    public Extend() { requires(Robot.extender);}
    protected void initialize() { Robot.extender.Extend();}
    protected boolean isFinished() {
        return true;
    }
    protected void end() { }
    protected void interrupted() { }

}
