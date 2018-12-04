package frc.team5115.Systems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team5115.Commands.Intaker.NotIntaking;
import frc.team5115.robot.Constants;

public class Intaker extends Subsystem {

    public static Spark intake;

    public Intaker() {
        intake = new Spark(Constants.IntakeSpark);
    }

    @Override
    protected void initDefaultCommand() { new NotIntaking();}

    public void takein(double IntakeSpeed) {
        intake.set(IntakeSpeed);
    }
}