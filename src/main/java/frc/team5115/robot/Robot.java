package frc.team5115.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team5115.Autonomus.AutonomusCommand;
import frc.team5115.Systems.*;

public class Robot extends TimedRobot {

    //Key Files
    public static Controls controls;
    public static SmartDebug smartDebug;

    //Subsystems
    public static BunnyExtender bunnyExtender;
    public static DriveTrain driveTrain;
    public static Intaker intake;
    public static Outtaker outtake;

    //Auto
    public static AutonomusCommand autonomousCommand;

    public void robotInit() {
        controls = new Controls();
        smartDebug = new SmartDebug();

        bunnyExtender = new BunnyExtender();
        driveTrain = new DriveTrain();
        intake = new Intaker();
        outtake = new Outtaker();

        autonomousCommand = new AutonomusCommand();
    }

    public void testInit () { }

    public void disabledPeriodic () { }

    public void autonomousInit() {
        autonomousCommand.start();
    }

    public void autonomousPeriodic () {
        Scheduler.getInstance().run();
    }

    public void teleopPeriodic () {
        Scheduler.getInstance().run();
        smartDebug.SmartDebug();
    }

    public void testPeriodic () { }
}
