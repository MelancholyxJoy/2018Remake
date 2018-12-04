package frc.team5115.Systems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team5115.Commands.BallDivertor.OpposingColorFlap;
import frc.team5115.robot.Constants;

public class BallDiverter extends Subsystem {

    public static DoubleSolenoid director;

    public BallDiverter() { director = new DoubleSolenoid(Constants.PCMIDDirector, Constants.DirectorForward, Constants.DirectorReverse); }

    protected void initDefaultCommand() { new OpposingColorFlap();}
//hi
}
