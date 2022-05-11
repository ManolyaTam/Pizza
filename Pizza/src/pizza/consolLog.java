package pizza;

import java.text.SimpleDateFormat;
import java.util.Date;

public class consolLog implements Logger{
    
    @Override
    public void log(String str) {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println( dateFormat.format(currentDate) + " at " + timeFormat.format(currentDate) + "\t" +  str);
    }
}
