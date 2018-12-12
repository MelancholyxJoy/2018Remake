package frc.team5115.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.team5115.Commands.BunnyLauncher.LaunchBunny;
import frc.team5115.Commands.Intaker.Intaking;
import frc.team5115.Commands.Outtaker.Outtaking;

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

    JoystickButton Intake = new JoystickButton(joystick, Constants.Intake);
    JoystickButton Outtake = new JoystickButton(joystick, Constants.Outtake);
    JoystickButton LaunchBunny = new JoystickButton(joystick, Constants.LaunchBunny);

    public Controls() {
        Intake.toggleWhenPressed( new Intaking());
        Outtake.whileHeld( new Outtaking());
        LaunchBunny.whenPressed( new LaunchBunny());
    }
}
