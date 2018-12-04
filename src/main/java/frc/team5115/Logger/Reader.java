package frc.team5115.Logger;

import com.opencsv.CSVReader;
import edu.wpi.first.wpilibj.DriverStation;

import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static double xvalue;
    public static double yvalue;
    public static double throttle;

    public static void reader(String file) {
        try {
            FileReader fileReader = new FileReader(file);
            CSVReader csvReader = new CSVReader(fileReader);
            csvReader.skip(1);
            String[] nextRecord;
            while (DriverStation.getInstance().isAutonomous()) {
                while ((nextRecord = csvReader.readNext()) != null) {
                    xvalue = Double.parseDouble(nextRecord[0]);
                    yvalue = Double.parseDouble(nextRecord[1]);
                    throttle = Double.parseDouble(nextRecord[2]);
                }
            }


        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
