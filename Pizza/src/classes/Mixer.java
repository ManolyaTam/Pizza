package classes;

import loggers.Logger;
import java.util.ArrayList;

public class Mixer implements MyInfo{
//    private Ingredient dough = new Ingredient("Dough", 0, 0);
    private ArrayList<Ingredient> dough = new ArrayList(); // do not share with other classes (top secret)
    private int panType;
    private int panSize;
    private float weight = 0;
    private float calories = 0;
    private Logger logger;
    
    // TO DO : sth here has to do with the data base (recording all resources used)
    public Mixer(int panSize, int panType, Logger logger) {                                             // recipe depends on pan Size and pan type specified by user
        this.panSize = panSize;
        this.panType = panType;
        this.logger = logger;
        addIngredients();
        mix();
    }
    private void addIngredients(){
        dough.add(new Ingredient("Flour", 300 * panSize, 1092 * panSize));// totalFlour -=  300 * panSize
        dough.add(new Ingredient("Oil", 108 * panSize, 955 * panSize));
        dough.add(new Ingredient("Sugar", 4.25 * panSize, 16 * panSize));
        dough.add(new Ingredient("Salt", 6 * panSize, 0));
        dough.add(new Ingredient("Yeast", 3.1 * (panSize + panType/2), 3 * (panSize + panType/2)));       //increasing the height of dough means increasing yeast
        dough.add(new Ingredient("Milk", 240 * panSize, 101 * panSize));
        //weights are calculated in "grams", and calories in "calories"
        
        calculate(dough); // sum of weights & calories in dough
    }
    
    private void mix(){
        logger.log("mixing dough\n");//ch 4
        for(Ingredient i : dough){
            weight += i.getWeight();
            calories += i.getCalories();
        }
    }

    public float getCalories() {
        return calories;
    }

    public float getWeight() {
        return weight;
    }
    
    @Override
    public String getInfo() {
        String tmp = "";
        for(Ingredient i : dough){
            tmp += i.getInfo();
        }
        return tmp;
    }  

    private void calculate(ArrayList<Ingredient> dough) {
        for(Ingredient i : dough){
            weight += i.getWeight();
            calories += i.getCalories();
        }
    }
}
