package pizza;

import java.util.ArrayList;

public class Mixer implements MyInfo{
    private Ingredient dough = new Ingredient("Dough", 0, 0);
    private ArrayList<Ingredient> ing = new ArrayList();
    private final int panType;
    private final int panSize;
    private float weight = 0;
    private float calories = 0;
    
    // TO DO : sum of weights and calories
    
    // TO DO : sth here has to do with the data base (recording all resources used)
    public Mixer(int panSize, int panType) {                                             // recipe depends on pan Size and pan type specified by user
        this.panSize = panSize;
        this.panType = panType;
        addIngredients();
        mix();
    }
    private void addIngredients(){
        ing.add(new Ingredient("Flour", 300 * panSize, 1092 * panSize));
        ing.add(new Ingredient("Oil", 108 * panSize, 955 * panSize));
        ing.add(new Ingredient("Sugar", 4.25 * panSize, 16 * panSize));
        ing.add(new Ingredient("Salt", 6 * panSize, 0));
        ing.add(new Ingredient("Yeast", 3.1 * (panSize + panType/2), 3 * (panSize + panType/2)));       //increasing the height of dough means increasing yeast
        ing.add(new Ingredient("Milk", 240 * panSize, 101 * panSize));
        //Note : Ingredients weights and calories are based on a real recipe(well, almost...)
        //weights are calculated in "grams", and calories in "calories"
    }
    
    private void mix(){
        for(Ingredient i : ing){
            weight += i.getWeight();
            calories += i.getCalories();
        }
        dough.setWeight(weight);
        dough.setCalories(calories);
    }

    public Ingredient getDough() {
        return dough;
    }

  public ArrayList<Ingredient> getIng() {
        return ing;
    }
    
    @Override
    public String getInfo() {
        String tmp = "";
        for(Ingredient i : ing){
            tmp += i.getInfo();
        }
        System.out.println(tmp);
        return tmp;
    }  
}
