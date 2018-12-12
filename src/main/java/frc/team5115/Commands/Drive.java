package frc.team5115.Commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.robot.Controls;
import frc.team5115.robot.Robot;

public class Drive extends Command {

    public Drive() { requires(Robot.driveTrain); }
    protected void initialize() {}
    protected void execute() {
        Robot.driveTrain.Drive(Controls.getY(), -Controls.getX(), Controls.getT());
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() { Robot.driveTrain.Drive(0,0,0);}
}
