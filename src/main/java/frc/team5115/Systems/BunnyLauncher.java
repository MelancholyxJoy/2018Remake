package frc.team5115.Systems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team5115.Commands.BunnyLauncher.NotLaunching;
import frc.team5115.robot.Constants;

public class BunnyLauncher extends Subsystem {

    public DoubleSolenoid launchBunny;

    public BunnyLauncher() {
        launchBunny = new DoubleSolenoid(Constants.PCMIDBunny, Constants.BunnyForward, Constants.BunnyReverse);
    }
    protected void initDefaultCommand() { setDefaultCommand(new NotLaunching());}
}
