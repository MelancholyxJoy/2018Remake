package frc.team5115.Logger;

import com.opencsv.CSVReader;
import edu.wpi.first.wpilibj.DriverStation;

import java.io.FileReader;
import java.io.IOException;

import static edu.wpi.first.wpilibj.Timer.getFPGATimestamp;

public class Reader {
    public static double xvalue;
    public static double yvalue;
    public static double throttle;

    public static double FPGATime = getFPGATimestamp();

    public static void reader(String file) {
        try {
            FileReader fileReader = new FileReader(file);
            CSVReader csvReader = new CSVReader(fileReader);
            csvReader.skip(1);
            String[] nextRecord;
            while (DriverStation.getInstance().isAutonomous()) {
                for (int count = 0; count<15000;count++)
                    while ((nextRecord = csvReader.readNext()) != null) {
                        xvalue = Double.parseDouble(nextRecord[0]);
                        yvalue = Double.parseDouble(nextRecord[1]);
                        throttle = Double.parseDouble(nextRecord[2]);
                        count += 1;
                    }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
