package frc.team5115.Systems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team5115.Commands.BallWheel.Sorting;
import frc.team5115.robot.Constants;

public class Sorter extends Subsystem {
    public boolean Ours;
    public boolean Theirs;

    public static Spark ballSifter;
    public static DigitalInput limitSwitch;

    public Sorter() {
        ballSifter = new Spark(Constants.BallSifterID);
        limitSwitch = new DigitalInput(Constants.LimitSwitchID);
    }
    protected void initDefaultCommand() { setDefaultCommand(new Sorting()); }
    public void Turn(double angle, double speed) {
            ballSifter.set(speed);
    }
}
