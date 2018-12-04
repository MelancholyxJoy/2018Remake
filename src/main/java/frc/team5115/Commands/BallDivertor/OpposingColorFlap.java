package frc.team5115.Commands.BallDivertor;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.Systems.BallDiverter;
import frc.team5115.robot.Robot;

public class OpposingColorFlap extends Command {

    public OpposingColorFlap() { requires(Robot.flap);}
    protected void execute() { BallDiverter.director.set(DoubleSolenoid.Value.kReverse); }
    protected boolean isFinished() { return false; }
}
