package frc.team5115.Logger;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import edu.wpi.first.wpilibj.DriverStation;
import frc.team5115.robot.Controls;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static edu.wpi.first.wpilibj.Timer.getFPGATimestamp;

public class Log {
    public static double xvalue;
    public static double yvalue;
    public static double throttle;
    public static double time = getFPGATimestamp();

    public static void log(String file, String filePath) {
        try {
            File auto = new File(filePath);
            FileReader fileReader = new FileReader(file);
            FileWriter outputfile = new FileWriter(auto);

            CSVReader csvReader = new CSVReader(fileReader);
            CSVWriter writer = new CSVWriter(outputfile);

            csvReader.skip(1);

            String[] header = {"XValue", "YValue", "Throttle"};
            writer.writeNext(header);
            String[] nextRecord;
            while (DriverStation.getInstance().isAutonomous()) {
                for (int count = 0; count <= 15000; count++) {
                    String[] AUTO = {Double.toString(Controls.XValue()), Double.toString(Controls.YValue()), Double.toString(Controls.Throttle())};
                    writer.writeNext(AUTO);
                    count += 1;
                    if (count == 15000 || time > 15) {
                        writer.close();
                    }
                    while ((nextRecord = csvReader.readNext()) != null) {
                        xvalue = Double.parseDouble(nextRecord[0]);
                        yvalue = Double.parseDouble(nextRecord[1]);
                        throttle = Double.parseDouble(nextRecord[2]);
                    }
                }
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
/*
    public static void reader(String file) {
        try {
            FileReader fileReader = new FileReader(file);
            CSVReader csvReader = new CSVReader(fileReader);
            csvReader.skip(1);
            String[] nextRecord;
            while (DriverStation.getInstance().isAutonomous()) {
                for (int count = 0; count < 15000; count++) {
                    while ((nextRecord = csvReader.readNext()) != null) {
                        xvalue = Double.parseDouble(nextRecord[0]);
                        yvalue = Double.parseDouble(nextRecord[1]);
                        throttle = Double.parseDouble(nextRecord[2]);
                        count += 1;
                    }
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void write(String filePath) {
        File auto = new File(filePath);
        try {
            FileWriter outputfile = new FileWriter(auto);
            CSVWriter writer = new CSVWriter(outputfile);

            String[] header = {"XValue", "YValue", "Throttle"};
            writer.writeNext(header);

            while (DriverStation.getInstance().isAutonomous()) {
                for (int count = 0; count < 15000; count++) {
                    String[] AUTO = {Double.toString(Controls.XValue()), Double.toString(Controls.YValue()), Double.toString(Controls.Throttle())};
                    writer.writeNext(AUTO);
                    count += 1;
                    if (count == 15000) {
                        writer.close();
                    }
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    */
}
