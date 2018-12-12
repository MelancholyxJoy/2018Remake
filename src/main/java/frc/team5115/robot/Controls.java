package frc.team5115.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.team5115.Commands.BunnyLauncher.LaunchBunnyOne;
import frc.team5115.Commands.BunnyLauncher.LaunchBunnyThree;
import frc.team5115.Commands.BunnyLauncher.LaunchBunnyTwo;
import frc.team5115.Commands.Intaker.Intaking;
import frc.team5115.Commands.Outtaker.Outtaking;

public class Controls {
    public static Joystick joystick = new Joystick(0);

    public static double getY() {
        return joystick.getY();
    }
    public static double getX() {
        return joystick.getX();
    }
    public static double getT() {
        return (1 - joystick.getThrottle()) / 2;
    }

    JoystickButton Intake = new JoystickButton(joystick, Constants.Intake);
    JoystickButton Outtake = new JoystickButton(joystick, Constants.Outtake);
    JoystickButton LaunchBunnyOne = new JoystickButton(joystick, Constants.LaunchBunnyOne);
    JoystickButton LaunchBunnyTwo = new JoystickButton(joystick, Constants.LaunchBunnyTwo);
    JoystickButton LaunchBunnyThree = new JoystickButton(joystick, Constants.LaunchBunnyThree);

    public Controls() {
        Intake.toggleWhenPressed( new Intaking());
        Outtake.whileHeld( new Outtaking());
        LaunchBunnyOne.whenPressed( new LaunchBunnyOne());
        LaunchBunnyTwo.whenPressed( new LaunchBunnyTwo());
        LaunchBunnyThree.whenPressed( new LaunchBunnyThree());
    }
}
