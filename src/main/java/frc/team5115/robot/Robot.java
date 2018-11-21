package frc.team5115.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import frc.team5115.RobotMap;
import frc.team5115.SmartDebug;
import frc.team5115.Subsystems.*;


public class Robot extends IterativeRobot {
    //Key Files
    public static RobotMap robotMap;
    public static SmartDebug smartDebug;

    //Subsystems
    public static Extender extender;
    public static Drive drive;
    public static Flap flap;
    public static Intake intake;

    @Override
    public void robotInit() {
        robotMap = new RobotMap();
        smartDebug = new SmartDebug();

        extender = new Extender();
        drive = new Drive();
        flap = new Flap();
        intake = new Intake();
    }

    @Override
    public void disabledInit() { }

    @Override
    public void autonomousInit() { }


    public void teleopInit() {
    }

    @Override
    public void testInit() { }


    @Override
    public void disabledPeriodic() { }
    
    @Override
    public void autonomousPeriodic() { }

    @Override
    public void teleopPeriodic() {
        drive.Drive();
        smartDebug.SmartDebug();
    }

    @Override
    public void testPeriodic() { }
}