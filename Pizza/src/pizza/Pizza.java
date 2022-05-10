package pizza;

import java.util.ArrayList;

public class Pizza implements MyInfo{
    int panSize;
    int panType;
    Pan pan;
    // dough weight + topping weight in one double variable
    // dough calories + toppings calories in one double variable

    public Pizza(int panSize, int panType) {
        this.panSize = panSize;
        this.panType = panType;
        pan = new Pan(panSize, panType);
    }

    @Override
    public String getInfo() {
        return pan.getInfo();
    }

    public Pan getPan() {
        return pan;
    }
    
    
}
