package frc.team5115.robot;

public class Constants {
    public static final int AXIS_X = 2;
    public static final int AXIS_Y = 1;
    public static final int AXIS_THROTTLE = 3;

    public static final double JOYSTICK_DEADBAND = 0.025;
    public static final int JOYSTICK_EXPO = 2;

    public static final double XSensetivity = .8;

    //Throttle
    public static double InitialThrottle = .5;

    //Sorter Delay
    public static double SorterDelay = 1;

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
    public static final double SorterTurnKP = 0;
    public static final double SorterTurnKI = 0;
    public static final double SorterTurnKD = 0;

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
    public static int OuttakeSparkID = 5;
    public static int BallSifterID = 6;

    public static int IntakeSpark = 1;

    public static int HomePositionLimitSwitchID;
    public static int OurPositionLimitSwitchID;
    public static int TheirPositionLimitSwitchID;

    //Solenoid
    public static int BunnyForward = 1;
    public static int BunnyReverse = 2;

    //PCM ID's
    public static int PCMIDBunny = 1;

    //Speeds
    public static double IntakeOnSpeed = 1;
    public static double OuttakeOnSpeed = .75;
    public static double FullDump = 1;

    public static double AutoTurnSpeed = .5;
    public static double AutoForwardSpeed = .5;

    public static double SorterTurnSpeed = .75;

    //Button ID's
    public static final int Intake = 1;
    public static final int Outtake = 2;
    public static final int DecreaseThrottle = 5;
    public static final int IncreaseThrottle = 6;
    public static final int LaunchBunny = 7;
}
