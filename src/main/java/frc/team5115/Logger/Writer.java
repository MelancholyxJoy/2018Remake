package frc.team5115.Logger;

import com.opencsv.CSVWriter;
import edu.wpi.first.wpilibj.Joystick;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Writer {

    public static Joystick joystick = new Joystick(0);

    public static double XValue() { return joystick.getX();}
    public static double YValue() { return joystick.getY();}
    public static double Throttle() { return ((-joystick.getThrottle() + 1) / 2);}

    public static void write(String filePath) {
        File auto = new File(filePath);
        try {
            FileWriter outputfile = new FileWriter(auto);
            CSVWriter writer  = new CSVWriter(outputfile);

            String[] header = {"XValue","YValue","Throttle"};
            writer.writeNext(header);

            String[] AUTO = {Double.toString(XValue()), Double.toString(YValue()),Double.toString(Throttle())};
            writer.writeNext(AUTO);

            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
