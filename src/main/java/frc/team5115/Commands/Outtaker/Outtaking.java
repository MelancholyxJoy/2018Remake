package frc.team5115.Commands.Outtaker;

import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.robot.Constants;
import frc.team5115.robot.Robot;

public class Outtaking extends Command {

    public Outtaking() { requires(Robot.outtake);}
    protected void execute() { Robot.outtake.takeout(Constants.OuttakeOnSpeed);}
    protected boolean isFinished() { return false; }
}
