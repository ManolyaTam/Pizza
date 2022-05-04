package pizza;

import java.util.ArrayList;

public class Pan implements MyInfo{
    
    
//   panSize and panType have multiple choices, each choice is represented with an integer starting from 1
//   panSize(small: 1, medium: 2, large: 3) , panType(pan 1, deepDish 2)

/********************************************************************/
/************************** Two Array lists , One for all Ingredients , the other for just used toppings at the dough******************************************/    
    private ArrayList<Ingredient> allIngredients = new ArrayList();
    private ArrayList<Ingredient> usedIngredients = new ArrayList();
     
/******************************************************************/
/* Initializing the variables for total weight and total calories */
    private double weight;
    private double calories;
/******************************************************************/
/*********** Initializing the major object Pizza ******************/
    
    private Ingredient Pizza = new Ingredient("Pizza", this.weight, this.calories);
/******************************************************************/   
    /*************Initializing some related variables**************/
    private int NumberOfToppings = 0;
    private int panSize;
    private int panType;
    
    private Mixer dough = new Mixer(this.panSize, this.panType);//prepare the dough 
    
    {
        // this is the initializing of the toppings
    Ingredient mozzarellaCheese = new Ingredient("Mozzarella Cheese", 170 * panSize, 476 * panSize); // index : 1
    Ingredient tomatoes = new Ingredient("Tomatoes", 120 * panSize, 22 * panSize);
    Ingredient garlic = new Ingredient("Garlic", 7 * panSize, 4 * panSize);
    Ingredient onion = new Ingredient("Onion", 115 * panSize, 44 * panSize);
    Ingredient pizzaSauce = new Ingredient("Pizza Sauce", 56 * panSize, 28 * panSize);
    Ingredient oregano = new Ingredient("Oregano ", 10 * panSize, 31 * panSize);
    Ingredient olives = new Ingredient("Olives ", 10 * panSize, 31 * panSize);
    Ingredient redPeppers = new Ingredient("Red peppers", 10 * panSize, 31 * panSize);
    }
    
    /*********************************************************************************/
    /****************** Constructor and Pour dough function **************************/
    public Pan(int panSize, int panType) { 
        
        this.panSize = panSize;
        this.panType = panType;
        pourDough();//TO DO
        setAllIngredients();

    }
    
    private void pourDough(){ //TO DO:
        
        allIngredients.add(dough.getDough());
        usedIngredients.add(dough.getDough());
        this.weight += dough.getDough().getWeight();
        this.calories += dough.getDough().getCalories();
    }
/************************************************************/
    
    public double getTotalWeight() {
        return weight;
    }

    public double getTotalCalories() {
        return calories;
    }

/**************************************/
    public int getNumberOfToppings() {
        return NumberOfToppings;
    }
///////---------There is no need to this function currently---------///////
//    public void setNumberOfToppings(int NumberOfToppings) {
//        this.NumberOfToppings = NumberOfToppings;
//    }
/***************************************/
    public String getPanSize() {
        String size = "";
        if (panSize == 1 )
            size = "Small";
        else if (panSize == 2)
            size = "Medium";
        else 
            size = "Large";
        return size;
    }

    public void setPanSize(int panSize) {
        this.panSize = panSize;
    }
/********************************************/
    public String getPanType() {
        String type = "";
        if (panType == 1 )
            type = "Pan";
        else if (panType == 2)
            type = "Deep dish";
        return type;
    }

    public void setPanType(int panType) {
        this.panType = panType;
    }
/********************************************/
    /*There is no need to htis function now*/
//    public Mixer getDough() {
//        return dough;
//    }
//
//    public void setDough(Mixer dough) {
//        this.dough = dough;
//    }
/********************************************/
    
    // This function to return the array which has all ingredient  
    public ArrayList<Ingredient> getAllIngredients() {
        return allIngredients;
    }
    
    // This function to add all ingredient to the array - AllIngredient -
    public void setAllIngredients()
    {
        allIngredients.add(new Ingredient("Mozzarella Cheese", 170 * panSize, 476 * panSize)); // index : 1
        allIngredients.add(new Ingredient("Tomatoes", 120 * panSize, 22 * panSize));
        allIngredients.add(new Ingredient("Garlic", 7 * panSize, 4 * panSize));
        allIngredients.add(new Ingredient("Onion", 115 * panSize, 44 * panSize));
        allIngredients.add(new Ingredient("Pizza Sauce", 56 * panSize, 28 * panSize));
        allIngredients.add(new Ingredient("Oregano ", 10 * panSize, 31 * panSize));
        allIngredients.add(new Ingredient("Olives ", 10 * panSize, 31 * panSize));
        allIngredients.add(new Ingredient("Red peppers", 10 * panSize, 31 * panSize)); 
    }
    
    /**************** This function to add just used ingredient  ****************/
    public void setOneIngredients(Ingredient ing)
    {
        // Here we have try and catch and we have an exeption ...... 
        if (this.weight < 800 && this.weight > 100)
        {
        usedIngredients.add(ing);
        this.weight += ing.getWeight();
        this.calories += ing.getCalories();
        this.NumberOfToppings ++;
        }
       // else 
            // throw an exeption 
    }
    
    /************* - this function get info to return an Information about the Pizza - ***************/
    @Override
    public String getInfo() {
        String tmp = "";
        for(Ingredient i : allIngredients){
            if(i.getWeight() != 0)
                tmp += i.getInfo();
        }
        tmp += "\n" + getPanSize() + "\n" + getPanType() ;
        return tmp;
    }

    
}




/*
        
        if (ing.getName().equals(ing.getName()))
        
        
        switch (ing.getName()) {
            
                case "Mozzarella Cheese":
                
                    this.weight += ing.getWeight();
                    this.calories += ing.getCalories();
                    break;
                    
                case "Tomatoes":
                    this.weight += ing.getWeight();
                    this.calories += ing.getCalories();
                    
                    break;
                    
                case "Garlic":
                    this.weight += ing.getWeight();
                    this.calories += ing.getCalories();
                
                    break;
                    
                case "Onion":
                    this.weight += ing.getWeight();
                    this.calories += ing.getCalories();
                    break;
                    
                case "Pizza Sauce":
                    this.weight += ing.getWeight();
                    this.calories += ing.getCalories();
                    break;
                    
                case "Oregano":
                    this.weight += ing.getWeight();
                    this.calories += ing.getCalories();
                    break;
                    
                case "Olives":
                    this.weight += ing.getWeight();
                    this.calories += ing.getCalories();
                    break;
                
                case "Red peppers":
                    this.weight += ing.getWeight();
                    this.calories += ing.getCalories();
                    break;
                
            default:
                throw new AssertionError();
        }

*/