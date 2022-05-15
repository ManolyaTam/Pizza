package classes;

public class Ingredient implements MyInfo{
    private final String name;
    private double weight;
    private double calories;

    public Ingredient(String name, double weight, double calories){
        this.name = name;
        this.weight = weight;
        this.calories = calories;
    }
    
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {// keep this, you'll need to set weight to zero in "Pan" Class
        this.weight = weight;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }  

    public String getName() {
        return name;
    }
    
    @Override
    public String getInfo() {
        return this.name + ", Weight: " + this.weight + " ,Calories: " + this.calories + "\n";
    }
    
}
