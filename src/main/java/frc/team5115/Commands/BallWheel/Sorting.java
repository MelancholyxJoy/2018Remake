package frc.team5115.Commands.BallWheel;

import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.robot.Constants;
import frc.team5115.robot.Robot;

public class Sorting extends Command {

    public Sorting() { requires(Robot.sorter);}
    protected void initialize() {}
    protected void execute() {
        if (Robot.sorter.Ours) {
            Robot.sorter.Turn(Constants.OurPoint, Constants.SorterTurnSpeed);
            Robot.sorter.Turn(Constants.OurPoint, -Constants.SorterTurnSpeed);
        }
        else if (Robot.sorter.Theirs) {
            Robot.sorter.Turn(Constants.TheirPoint, Constants.SorterTurnSpeed);
            Robot.sorter.Turn(Constants.TheirPoint, -Constants.SorterTurnSpeed);
        }
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() { Robot.sorter.Turn(0,0);}
}
