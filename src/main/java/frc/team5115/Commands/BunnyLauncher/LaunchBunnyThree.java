package frc.team5115.Commands.BunnyLauncher;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.robot.Robot;

public class LaunchBunnyThree extends Command {

    public LaunchBunnyThree() { requires(Robot.bunnyLauncher);}
    protected void initialize() {}
    protected void execute() { Robot.bunnyLauncher.launchBunnyThree.set(DoubleSolenoid.Value.kForward);}
    protected boolean isFinished() {
        return false;
    }
    protected void end() { Robot.bunnyLauncher.launchBunnyThree.set(DoubleSolenoid.Value.kOff);}

}
