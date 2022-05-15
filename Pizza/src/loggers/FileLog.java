package loggers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLog implements Logger{
    
    public void log(String str){
   
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        
        FileWriter fw;
        try {
            fw = new FileWriter(new File("log.txt"), true);
            fw.write(dateFormat.format(currentDate) + " at " + timeFormat.format(currentDate) + "\t" +  str + "\n");
            fw.close();
        } catch (IOException ex) {

            System.out.println("I/O Exeption");
        }
            

    }
}
