package frc.team5115.Systems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team5115.Commands.BunnyLauncher.NotLaunching;
import frc.team5115.robot.Constants;

public class BunnyLauncher extends Subsystem {

    public DoubleSolenoid launchBunnyOne;
    public DoubleSolenoid launchBunnyTwo;
    public DoubleSolenoid launchBunnyThree;

    public BunnyLauncher() {
        launchBunnyOne = new DoubleSolenoid(Constants.PCMIDBunnyOne, Constants.BunnyOneForward, Constants.BunnyOneReverse);
        launchBunnyTwo = new DoubleSolenoid(Constants.PCMIDBunnyTwo, Constants.BunnyTwoForward, Constants.BunnyTwoReverse);
        launchBunnyThree = new DoubleSolenoid(Constants.PCMIDBunnyThree, Constants.BunnyThreeForward, Constants.BunnyThreeReverse);
    }
    protected void initDefaultCommand() { setDefaultCommand(new NotLaunching());}
}
