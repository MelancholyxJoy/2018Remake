package frc.team5115.Logger;

import com.opencsv.CSVWriter;
import frc.team5115.RobotMap;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void write(String filePath) {
        File auto = new File(filePath);
        try {
            FileWriter outputfile = new FileWriter(auto);
            CSVWriter writer  = new CSVWriter(outputfile);

            String[] header = {"XValue","YValue","Throttle"};
            writer.writeNext(header);

            String[] AUTO = {Double.toString(RobotMap.XValue()), Double.toString(RobotMap.YValue()),Double.toString(RobotMap.Throttle())};
            writer.writeNext(AUTO);

            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
