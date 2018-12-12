package frc.team5115.Systems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team5115.Commands.Outtaker.NotOuttaking;
import frc.team5115.robot.Constants;

public class Outtaker extends Subsystem {

    public static Spark outtake;

    public Outtaker() {
        outtake = new Spark(Constants.OuttakeSparkID);
    }
    protected void initDefaultCommand() { setDefaultCommand(new NotOuttaking()); }
    public void takeout(double OuttakeSpeed) { outtake.set(-OuttakeSpeed); }
}
