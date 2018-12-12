package frc.team5115.Systems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team5115.Commands.Intaker.NotIntaking;
import frc.team5115.robot.Constants;

public class Intaker extends Subsystem {

    public static TalonSRX intake;

    public Intaker() {
        intake = new TalonSRX(Constants.IntakeSpark);
    }

    @Override
    protected void initDefaultCommand() { setDefaultCommand(new NotIntaking());}

    public void takein(double IntakeSpeed) {
        intake.set(ControlMode.PercentOutput, IntakeSpeed);
    }
}
