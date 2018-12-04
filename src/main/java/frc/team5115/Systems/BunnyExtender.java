package frc.team5115.Systems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team5115.Commands.BunnyExtender.NotExtending;
import frc.team5115.robot.Constants;

public class BunnyExtender extends Subsystem {

    public static DoubleSolenoid extender;

    public BunnyExtender() {
        extender = new DoubleSolenoid(Constants.PCMIDExtender, Constants.ExtenderForward, Constants.ExtenderReverse);
    }
    protected void initDefaultCommand() { new NotExtending();}
}
