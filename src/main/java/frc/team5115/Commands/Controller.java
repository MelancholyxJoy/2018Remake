package frc.team5115.Commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import frc.team5115.robot.Constants;
import frc.team5115.robot.Controls;
import frc.team5115.robot.Robot;

public class Controller extends Command {

    double Throt = .5;

    public Controller() { requires(Robot.controlCentral); }
    protected void initialize() {}
    protected void execute() {

        //Sorter
        Robot.controlCentral.TurnSorter(Constants.SorterTurnSpeed);

        //Intake
        if (Controls.intakinggrr()) {
            Robot.controlCentral.takein(Constants.IntakeON);
        }
        else {
            Robot.controlCentral.takein(Constants.IntakeON);
        }

        //Outtake
        if (Controls.outtake()) {
            Robot.controlCentral.takeout(Constants.OuttakeOnSpeed);
            Robot.controlCentral.TurnSifter(Constants.SifterTurnSpeed);
        }
        else {
            Robot.controlCentral.takeout(0);
            Robot.controlCentral.TurnSifter(0);
        }

        //Bunny Launcher
        if (Controls.launchbunny()) {
            Robot.controlCentral.launch();
        }
        else if (Controls.retractbunny()) {
            Robot.controlCentral.retract();
        }
        else {
            Robot.controlCentral.nolaunch();
        }
        /*
        if (!Robot.controlCentral.homePosition.get()) {
            if (Controls.ToOuttake()) {
                Robot.controlCentral.TurnSorter(Constants.SorterTurnSpeed);
                if(Robot.controlCentral.ourPosition.get()) {
                    Robot.controlCentral.TurnSorter(0);
                    Robot.controlCentral.TurnSifter(Constants.SifterTurnSpeed);
                    Timer.delay(Constants.OurColorSorterDelay);
                    Robot.controlCentral.TurnSifter(0);
                    Robot.controlCentral.TurnSorter(-Constants.SorterTurnSpeed);
                    if (!Robot.controlCentral.homePosition.get()){
                        Robot.controlCentral.TurnSorter(0);
                    }
                }
            }
            else if (Controls.ThrowOut()) {
                Robot.controlCentral.TurnSorter(-Constants.SorterTurnSpeed);
                if(Robot.controlCentral.theirPosition.get()) {
                    Robot.controlCentral.TurnSorter(0);
                    Timer.delay(Constants.TheirSideSorterDelay);
                    Robot.controlCentral.TurnSorter(-Constants.SorterTurnSpeed);
                    if (!Robot.controlCentral.homePosition.get()){
                        Robot.controlCentral.TurnSorter(0);
                    }
                }
            }
        }
        else if (!Robot.controlCentral.homePosition.get()) {
            Robot.controlCentral.TurnSorter(Constants.SorterTurnSpeed);
            if (!Robot.controlCentral.homePosition.get()) {
                Robot.controlCentral.TurnSorter(0);
            }
        }
        */

        //Drive
        if (Controls.increaseThrottle()){ // Right button increases throttle
            Timer.delay(0.1);
            Throt += 0.02;
            System.out.println(Throt);
        } else if (Controls.decreaseThrottle()){ // Left button decreased throttle
            Timer.delay(0.1);
            Throt -= 0.02;
            System.out.println(Throt);
        }
        if(Throt > 1) {
            Throt = Math.signum(Throt);
        }
        if (Throt <= 0) {
            Throt = 0;
        }
        Robot.controlCentral.Drive(-Controls.getY(), Controls.getX(), Throt);
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() { Robot.controlCentral.Drive(0,0, 0);}
}
