package frc.team5115.Commands.Auto;

import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.robot.Constants;
import frc.team5115.robot.Robot;

import static edu.wpi.first.wpilibj.Timer.getFPGATimestamp;

public class FullDump extends Command {
    public FullDump() { requires(Robot.outtake);}
    protected void initialize() {}
    protected void execute() {
        double time = getFPGATimestamp();
        if (time < 3) {
            Robot.outtake.takeout(Constants.FullDump);
        } else if (time > 3 && time < 15) {
            Robot.outtake.takeout(0);
        }
    }
    protected boolean isFinished() { return false; }
    protected void end() { Robot.outtake.takeout(0);}
}
