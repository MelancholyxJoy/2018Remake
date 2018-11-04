package frc.team0000.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.Joystick;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.SPI;

public class RobotMap {
    //Robot Attributes
    //public static final int EncoderTicks = 1440;
    //public static final int WheelDiameter = 6;

    //Joystick Buttons
    //public static final int PlaceHolderButton = 1;

    //Talons IDS
    public static final int FrontLeftTalonID = 1;
    public static final int FrontRightTalonID = 2;
    public static final int BackLeftTalonID = 3;
    public static final int BackRightTalonID = 4;

    public RobotMap() {
    }

    public static Joystick joystick = new Joystick(0);

    public static double YMotion = joystick.getY();
    public static double XMotion = joystick.getX();
    public static double Throttle = joystick.getThrottle();
}
