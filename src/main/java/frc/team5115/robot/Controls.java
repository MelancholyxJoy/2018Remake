package frc.team5115.robot;

import edu.wpi.first.wpilibj.Joystick;

public class Controls {
    public static Joystick joystick = new Joystick(0);

    public static double getY() {
        return joystick.getRawAxis(Constants.AXIS_Y);
    }
    public static double getX() {
        return joystick.getRawAxis(Constants.AXIS_X);
    }

    public static boolean decreaseThrottle() { return joystick.getRawButton(Constants.DecreaseThrottle);}
    public static boolean increaseThrottle() { return joystick.getRawButton(Constants.IncreaseThrottle);}

    public static boolean intakinggrr() { return joystick.getRawButton(Constants.Intake);}
    public static boolean outtake() { return joystick.getRawButton(Constants.Outtake);}
    public static boolean launchbunny() { return joystick.getRawButton(Constants.Launch);}
    public static boolean retractbunny() { return joystick.getRawButton(Constants.Retract);}
    public static boolean sift() { return joystick.getRawButton(Constants.Sift);}

    public static boolean ToOuttake() { return joystick.getRawButton(Constants.ToOuttake);}
    public static boolean ThrowOut() { return joystick.getRawButton(Constants.ThrowOut);}

    public Controls() {
        System.out.println(intakinggrr());
    }
}
