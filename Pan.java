package pizza;

import java.util.ArrayList;

public class Pan implements MyInfo{
    
    private ArrayList<Ingredient> allIngredients = new ArrayList();
    private double weight = 0;
    private double calories = 0;
    private int NumberOfToppings;
    private int panSize;
    private int panType;

//   panSize and panType have multiple choices, each choice is represented with an integer starting from 1
//   panSize(small: 1, medium: 2, large: 3) , panType(pan 1, deepDish 2) 
    public Pan(boolean[] toppingsAdjList, int PanSize, int PanType) { //toppingsAdjList : boolean array indecating the presence of a topping
        this.panSize = panSize;
        this.panType = panType;
        pourDough();//TO DO
        NumberOfToppings = allIngredients.size() - 1;
        initializeToppings();
        addToppings(toppingsAdjList);
    }
    
    private void initializeToppings(){
        allIngredients.add(new Ingredient("Mozzarella Cheese", 170 * panSize, 476 * panSize)); // index : 1
        allIngredients.add(new Ingredient("Tomatoes", 120 * panSize, 22 * panSize));
        allIngredients.add(new Ingredient("Garlic", 7 * panSize, 4 * panSize));
        allIngredients.add(new Ingredient("Onion", 115 * panSize, 44 * panSize));
        allIngredients.add(new Ingredient("Pizza Sauce", 56 * panSize, 28 * panSize));
        allIngredients.add(new Ingredient("Oregano ", 10 * panSize, 31 * panSize));
    }
    
    private void pourDough(){ //TO DO:
        //try .. catch
        Mixer mixer = new Mixer(panSize, panType);
        allIngredients.add(mixer.getDough());
        weight += mixer.getDough().getWeight();
        calories += mixer.getDough().getCalories();
    }
    
    private void addToppings(boolean[] toppingsAdjList){
        // CHECK : how do I know whether a customer wants a certian topping or not?????
        // TRY .. CATCH
        for(int i = 1; i <= NumberOfToppings; i++){
            if(!toppingsAdjList[i]){
                System.out.println("no");
                allIngredients.get(i).setWeight(0);
                allIngredients.get(i).setCalories(0);
            }
            else{
                System.out.println("yes");
                weight += allIngredients.get(i).getWeight();
                calories += allIngredients.get(i).getCalories();
            }
        }
    }

    public ArrayList<Ingredient> getAllIngredients() {
        return allIngredients;
    }

    public double getWeight() {
        return weight;
    }

    public double getCalories() {
        return calories;
    }

    @Override
    public String getInfo() {
        String tmp = "";
        for(Ingredient i : allIngredients){
            if(i.getWeight() != 0)
                tmp += i.getInfo();
        }
        return tmp;
    }

    
}
