package frc.team5115.Systems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team5115.Commands.Outtaker.NotOuttaking;
import frc.team5115.robot.Constants;

public class Outtaker extends Subsystem {

    public static TalonSRX outtake;

    public Outtaker() {
        outtake = new TalonSRX(Constants.OuttakeTalonID);
    }

    protected void initDefaultCommand() { new NotOuttaking(); }

    public void takeout(double OuttakeSpeed) { outtake.set(ControlMode.PercentOutput, OuttakeSpeed); }
}
