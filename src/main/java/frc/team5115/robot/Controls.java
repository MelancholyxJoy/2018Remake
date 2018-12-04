package frc.team5115.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.team5115.Commands.BunnyExtender.Extend;
import frc.team5115.Commands.Intaker.Intaking;
import frc.team5115.Commands.Outtaker.Outtaking;

public class Controls {
    //Joystick
    static Joystick joystick = new Joystick(0);
    Button Intake = new JoystickButton(joystick, Constants.Intake);
    Button Outtake = new JoystickButton(joystick, Constants.Outtake);
    Button Extend = new JoystickButton(joystick, Constants.Extend);

    public Controls() {
        //Joystick Buttons
        Intake.toggleWhenPressed(new Intaking());
        Outtake.toggleWhenPressed(new Outtaking());
        Extend.whenPressed(new Extend());
    }
    //Joystick Axis
    public static double XValue() { return joystick.getX();}
    public static double YValue() { return joystick.getY();}
    public static double Throttle() { return ((-joystick.getThrottle() + 1) / 2);}
}
