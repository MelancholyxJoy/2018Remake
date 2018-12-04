package frc.team5115.Commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.robot.Controls;
import frc.team5115.robot.Robot;

public class Drive extends Command {

    double xaxis;
    double yaxis;
    double throt;

    protected void execute() {
        xaxis = Controls.XValue();
        yaxis = Controls.YValue();
        throt = Controls.Throttle();
        Robot.driveTrain.Drive( xaxis, yaxis, throt);
    }

    protected boolean isFinished() {
        return false;
    }
    protected void end() { Robot.driveTrain.Drive(0,0,0);}

}
