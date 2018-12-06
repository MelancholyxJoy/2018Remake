package frc.team5115.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team5115.Autonomus.AutonomusCommand;
import frc.team5115.Logger.Log;
import frc.team5115.Systems.BunnyExtender;
import frc.team5115.Systems.DriveTrain;
import frc.team5115.Systems.Intaker;
import frc.team5115.Systems.Outtaker;

public class Robot extends TimedRobot {

    //Key Files
    public static Controls controls;
    public static SmartDebug smartDebug;
    public static Log log;

    //Subsystems
    public static BunnyExtender bunnyExtender;
    public static DriveTrain driveTrain;
    public static Intaker intake;
    public static Outtaker outtake;

    //Auto
    public static AutonomusCommand autonomousCommand;

    public void robotInit() {
        log = new Log();
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

    public void testPeriodic () {
        log.log("file" , "C:\\Users\\YEABSIRA\\Downloads\\BunnyBots\\java\\src\\main\\java\\frc\\team5115\\robot");
    }
}
