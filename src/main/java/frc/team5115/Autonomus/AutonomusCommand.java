package frc.team5115.Autonomus;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.team5115.Commands.Auto.FullDump;
import frc.team5115.Commands.Auto.ToCenter;
import frc.team5115.Commands.Auto.Turn;

public class AutonomusCommand extends CommandGroup {
    public AutonomusCommand() {
        addSequential(new FullDump());
        addSequential(new Turn());
        addSequential(new ToCenter());
    }
}
