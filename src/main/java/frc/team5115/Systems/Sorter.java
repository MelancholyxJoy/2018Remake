package frc.team5115.Systems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team5115.Commands.BallWheel.Sorting;
import frc.team5115.robot.Constants;

public class Sorter extends Subsystem {
    public boolean OurColor;
    public boolean TheirColor;

    public Spark ballSifter;
    public DigitalInput homePosition;
    public DigitalInput ourPosition;
    public DigitalInput theirPosition;

    public Sorter() {
        ballSifter = new Spark(Constants.BallSifterID);
        homePosition = new DigitalInput(Constants.HomePositionLimitSwitchID);
        ourPosition = new DigitalInput(Constants.OurPositionLimitSwitchID);
        theirPosition = new DigitalInput(Constants.TheirPositionLimitSwitchID);
    }
    protected void initDefaultCommand() { setDefaultCommand(new Sorting()); }
    public void Turn(double speed) {
        ballSifter.set(speed);
    }
}
