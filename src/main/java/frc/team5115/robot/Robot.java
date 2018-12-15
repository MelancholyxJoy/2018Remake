package frc.team5115.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team5115.Auto.ToCenter;
import frc.team5115.Systems.ControlCentral;

public class Robot extends TimedRobot {

    public static ControlCentral controlCentral;

    public void robotInit() {
        controlCentral = new ControlCentral();
    }
    public void autonomousPeriodic () {
        if(Timer.getFPGATimestamp() > 2){
            ToCenter.update(1);
        } else {
            ToCenter.update(0);
        }
    }
    public void teleopPeriodic () {
        Scheduler.getInstance().run();
    }

}
