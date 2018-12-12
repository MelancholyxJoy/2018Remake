package frc.team5115.Commands.BallWheel;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.robot.Constants;
import frc.team5115.robot.Robot;

public class Sorting extends Command {

    public Sorting() { requires(Robot.sorter);}
    protected void initialize() {}
    protected void execute() {
        if (Robot.sorter.homePosition.get()) {
           if (Robot.sorter.OurColor) {
               Robot.sorter.Turn(Constants.SorterTurnSpeed);
               if(Robot.sorter.ourPosition.get()) {
                   Robot.sorter.Turn(0);
                   Timer.delay(Constants.SorterDelay);
                   Robot.sorter.Turn(-Constants.SorterTurnSpeed);
                   if (Robot.sorter.homePosition.get()){
                       Robot.sorter.Turn(0);
                   }
               }
           }
           else if (Robot.sorter.TheirColor) {
               Robot.sorter.Turn(-Constants.SorterTurnSpeed);
               if(Robot.sorter.theirPosition.get()) {
                   Robot.sorter.Turn(0);
                   Timer.delay(Constants.SorterDelay);
                   Robot.sorter.Turn(-Constants.SorterTurnSpeed);
                   if (Robot.sorter.homePosition.get()){
                       Robot.sorter.Turn(0);
                   }
               }
           }
        }
        else if (!Robot.sorter.homePosition.get()) {
            Robot.sorter.Turn(Constants.SorterTurnSpeed);
            if (Robot.sorter.homePosition.get()) {
                Robot.sorter.Turn(0);
            }
        }
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() { Robot.sorter.Turn(0);}
}
