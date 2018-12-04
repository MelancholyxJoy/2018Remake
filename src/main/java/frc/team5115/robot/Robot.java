package frc.team5115.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team5115.Systems.*;

public class Robot extends TimedRobot {

    //Key Files
    public static Controls controls;
    public static SmartDebug smartDebug;

    //Subsystems
    public static BunnyExtender bunnyExtender;
    public static DriveTrain driveTrain;
    public static BallDiverter flap;
    public static Intaker intake;
    public static Outtaker outtake;

    //Auto

    @Override
    public void robotInit() {
        controls = new Controls();
        smartDebug = new SmartDebug();

        bunnyExtender = new BunnyExtender();
        driveTrain = new DriveTrain();
        flap = new BallDiverter();
        intake = new Intaker();
        outtake = new Outtaker();
    }

    @Override
    public void testInit () { }

    public void disabledPeriodic () { }

    public void autonomousPeriodic () {

    }

    public void teleopPeriodic () {
        Scheduler.getInstance().run();
        smartDebug.SmartDebug();
    }

    public void testPeriodic () { }
}
