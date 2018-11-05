package frc.team0000.systems;

import frc.team0000.robot.RobotMap;
import frc.team0000.subsystems.DriveTrain;

public class Drive extends StateMachine{
    public static final int STOP = 0;
    public static final int INIT = 1;
    public static final int DRIVING = 2;

    public void update() {
        switch(state) {
            case INIT:
                DriveTrain.drive(0, 0);
                break;
            case DRIVING:
                if (RobotMap.XMotion > 0) {
                    double leftspeed = ((1 - RobotMap.XMotion) + (RobotMap.YMotion)) * RobotMap.Throttle;
                    double rightspeed = ((RobotMap.XMotion) + (RobotMap.YMotion)) * RobotMap.Throttle;
                    DriveTrain.drive(leftspeed, rightspeed);
                }
                if (RobotMap.XMotion < 0) {
                    double leftspeed = ((RobotMap.XMotion) + (RobotMap.YMotion)) * RobotMap.Throttle;
                    double rightspeed = ((1 - RobotMap.XMotion) + (RobotMap.YMotion)) * RobotMap.Throttle;
                    DriveTrain.drive(leftspeed, rightspeed);
                }
                if (RobotMap.XMotion == 0) {
                    double leftspeed = RobotMap.YMotion * RobotMap.Throttle;
                    double rightspeed = RobotMap.YMotion * RobotMap.Throttle;
                    DriveTrain.drive(leftspeed, rightspeed);
                }
        }
    }


}
