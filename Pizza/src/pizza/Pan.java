package pizza;

import java.util.ArrayList;

public class Pan implements MyInfo{   
//   panSize and panType have multiple choices, each choice is represented with an integer starting from 1
//   panSize(small: 1, medium: 2, large: 3) , panType(pan 1, deepDish 2)

    private ArrayList<Ingredient> toppings = new ArrayList(); // NOT USED // name it toppings?
     
    private double weight;
    private double calories;
    private int panSize;
    private int panType;
    private String type;
    private String size;
   
    private Mixer dough;//prepare the dough 

    public Pan(int panSize, int panType) {
        this.panSize = panSize;
        this.panType = panType;
        dough = new Mixer(this.panSize, this.panType);
    }

    public double getWeight() {
        return weight;
    }

    public double getCalories() {
        return calories;
    }
    
    private void pourDough(){
        weight += dough.getWeight();
        calories += dough.getCalories();
    }

    public void addTopping(Ingredient ing){
        toppings.add(ing);
        weight += ing.getWeight();
        calories += ing.getCalories();
    }
    
    @Override
    public String getInfo() { // TODO
        translate();
        return "Pan Type: " + type + "\n" + "Pan Size = " + size + "\nToppings:\n" +  toppingsInfo();
    }
    
    private void translate(){  // translates int values given to panSize and panType to String values
        switch (panSize) {
            case 0:
                size = "Small";
                break;
            case 1:
                size = "Medium";
                break;
            case 2:
                size = "Large";
                break;
        }
        
        switch (panType) {
            case 0:
                type = "Pan";
                break;
            case 1:
                type = "Deep Dish";
                break;
        }
    }
    
    private String toppingsInfo(){
        String str = "";
        for(Ingredient i : toppings){
            str += i.getInfo();  
        }
        return str;
    }
    
}
