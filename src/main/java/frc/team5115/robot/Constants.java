package frc.team5115.robot;

public class Constants {

    //PID values
    public static final double Delay = 0.005;
    public static final double AutoForwardKP = 0.4;
    public static final double AutoForwardKI = 0;
    public static final double AutoForwardKD = 0.1;
    public static final double AutoTurnKP = 0.06;
    public static final double AutoTurnKI = 0;
    public static final double AutoTurnKD = 0.05;
    public static final double TurnKD = 0.05;
    public static final double TurnKP = 0.3;
    public static final double TurnKI = 0.15;

    //Tolerances
    public static final double ForwardTolerance = 0.25;
    public static final double ForwardDTolerance = 0.05;
    public static final double TurnTolerance = 5;
    public static final double TurnDTolerance = 15;

    //ID's
    public static int FrontLeftTalonID = 3;
    public static int FrontRightTalonID = 4;
    public static int BackLeftTalonID = 1;
    public static int BackRightTalonID = 2;
    public static int OuttakeTalonID = 5;

    public static int IntakeSpark = 1;

    //Solenoid
    public static int ExtenderForward = 1;
    public static int ExtenderReverse = 2;

    //PCM ID's
    public static int PCMIDExtender = 1;

    //Speeds
    public static double IntakeOnSpeed = 1;
    public static double OuttakeOnSpeed = .75;
    public static double FullDump = 1;

    public static double AutoTurnSpeed = 1;
    public static double AutoForwardSpeed = 1;

    //Button ID's
    public static final int Intake = 5;
    public static final int Outtake = 6;
    public static final int Extend = 7;
}
