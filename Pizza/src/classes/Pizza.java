package classes;

import loggers.Logger;
import java.util.ArrayList;

public class Pizza implements MyInfo{
    int panSize;
    int panType;
    Pan pan;
    Logger logger;
    private static int count = 0;

    public Pizza(int panSize, int panType, Logger logger) {
        this.panSize = panSize;
        this.panType = panType;
        this.logger = logger;
        count++;
        logger.log("Pizza #" + count + " was ordered\nDetails:\n");//ch 3
        pan = new Pan(panSize, panType, logger);
    }
    
    public Pan getPan(){
        return this.pan;
    }

    @Override
    public String getInfo() {
        return pan.getInfo();
    }
    
    
}
