package frc.team5115.Commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.robot.Controls;
import frc.team5115.robot.Robot;

public class Drive extends Command {

    double Throt = .5;

    public Drive() { requires(Robot.driveTrain); }
    protected void initialize() {}
    protected void execute() {
        if (Controls.increaseThrottle()){ // Right button increases throttle
            Timer.delay(0.1);
            Throt += 0.02;
            System.out.println(Throt);
        } else if (Controls.decreaseThrottle()){ // Left button decreased throttle
            Timer.delay(0.1);
            Throt -= 0.02;
            System.out.println(Throt);
        }
        if(Throt > 1) {
            Throt = Math.signum(Throt);
        }
        if (Throt <= 0) {
            Throt = 0;
        }
        Robot.driveTrain.Drive(Controls.getY(), -Controls.getX(), Throt);
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() { Robot.driveTrain.Drive(0,0, 0);}
}
