package frc.team5115.Commands.BunnyExtender;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.Systems.BunnyExtender;
import frc.team5115.robot.Robot;

public class NotExtending extends Command {
    public NotExtending() { requires(Robot.bunnyExtender);}
    protected void execute() { BunnyExtender.extender.set(DoubleSolenoid.Value.kOff); }
    protected boolean isFinished() { return false; }
}
