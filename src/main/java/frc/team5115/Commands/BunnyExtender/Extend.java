package frc.team5115.Commands.BunnyExtender;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.robot.Robot;

public class Extend extends Command {

    public Extend() { requires(Robot.bunnyExtender);}
    protected void execute() { Robot.bunnyExtender.extender.set(DoubleSolenoid.Value.kForward);}
    protected boolean isFinished() {
        return false;
    }

}
