package frc.team5115.Commands.Outtaker;

import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.robot.Robot;

public class NotOuttaking extends Command {

    public NotOuttaking(){ requires(Robot.outtake);}
    protected void execute() { Robot.outtake.takeout(0);}
    protected boolean isFinished() { return false; }
}
