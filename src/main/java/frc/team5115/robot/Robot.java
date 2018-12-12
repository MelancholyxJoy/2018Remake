package frc.team5115.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team5115.Autonomus.AutonomusCommand;
import frc.team5115.Systems.*;

public class Robot extends TimedRobot {

    //Subsystems
    public static DriveTrain driveTrain;
    public static Intaker intake;
    public static Outtaker outtake;
    public static Sorter sorter;
    public static BunnyLauncher bunnyLauncher;

    private CommandGroup autonomusCommand;

    public void robotInit() {
        driveTrain = new DriveTrain();
        intake = new Intaker();
        outtake = new Outtaker();
        sorter = new Sorter();
        bunnyLauncher = new BunnyLauncher();

        autonomusCommand = new AutonomusCommand();
    }

    public void testInit () { }

    public void disabledPeriodic () { }

    public void autonomousInit() {
        if (autonomusCommand != null) {
            autonomusCommand.start();
        }
    }

    public void autonomousPeriodic () {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        autonomusCommand.cancel();
    }

    public void teleopPeriodic () {
        Scheduler.getInstance().run();
    }

    public void testPeriodic () {
    }
}
