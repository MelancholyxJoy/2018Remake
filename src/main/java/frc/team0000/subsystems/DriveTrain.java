package frc.team0000.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.SPI;
import frc.team0000.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.kauailabs.navx.frc.AHRS;

public class DriveTrain {
    public boolean used;

    static TalonSRX frontLeft;
    static TalonSRX frontRight;
    static TalonSRX backLeft;
    static TalonSRX backRight;

    public DriveTrain() {
        TalonSRX frontLeft = new TalonSRX(RobotMap.FrontLeftTalonID);
        TalonSRX frontRight = new TalonSRX(RobotMap.FrontRightTalonID);
        TalonSRX backLeft = new TalonSRX(RobotMap.BackLeftTalonID);
        TalonSRX backRight = new TalonSRX(RobotMap.BackRightTalonID);

        AHRS navx = new AHRS(SPI.Port.kMXP);

        frontLeft.set(ControlMode.Follower, RobotMap.BackLeftTalonID);
        frontRight.set(ControlMode.Follower, RobotMap.BackRightTalonID);
    }

    public static void drive(double leftspeed, double rightspeed) {
        backLeft.set(ControlMode.Velocity, leftspeed);
        backRight.set(ControlMode.Velocity, rightspeed);
    }
}

