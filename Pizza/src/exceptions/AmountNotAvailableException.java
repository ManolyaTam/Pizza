package exceptions;


public class AmountNotAvailableException extends Exception{

    public AmountNotAvailableException() {
        super("amount not available, please refill");
    }
    
    public AmountNotAvailableException(String ingredientName){
        super("there is no enough amount of " + ingredientName +", please refill");
    }   
}
