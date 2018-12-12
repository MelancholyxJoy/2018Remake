package frc.team5115.Commands.BunnyLauncher;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.robot.Robot;

public class NotLaunching extends Command {
    public NotLaunching() { requires(Robot.bunnyLauncher);}
    protected void initialize() { }
    protected void execute() {
        Robot.bunnyLauncher.launchBunny.set(DoubleSolenoid.Value.kOff);
    }
    protected boolean isFinished() { return false; }
    protected void end() {
        Robot.bunnyLauncher.launchBunny.set(DoubleSolenoid.Value.kOff);
    }
}
