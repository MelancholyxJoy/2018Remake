package frc.team5115.Auto;

import frc.team5115.robot.Robot;

public class ToCenter {

    public static void update(int state){
        switch(state){
            case 0:
                Robot.controlCentral.Drive(1, 0, 0.5);
            case 1:
                Robot.controlCentral.Drive(0, 1, 0.5);
        }

    }
}
