package frc.team0000.robot;

import frc.team0000.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.IterativeRobot;
import frc.team0000.subsystems.DriveTrain;
import frc.team0000.systems.*;

public class Robot extends IterativeRobot {

    public static Drive drive;

    @Override
    public void robotInit() {
        drive = new Drive();
    }

    @Override
    public void disabledInit() { }

    @Override
    public void autonomousInit() { }


    public void teleopInit() {
        DriveTrain.drive(0,0);
        drive.setState(Drive.DRIVING);
    }

    @Override
    public void testInit() { }


    @Override
    public void disabledPeriodic() { }
    
    @Override
    public void autonomousPeriodic() { }

    @Override
    public void teleopPeriodic() {
        drive.update();
    }

    @Override
    public void testPeriodic() { }
}