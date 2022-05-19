package exceptions;

public class PanOverflowException extends Exception{
    public PanOverflowException(String toppingName) {
        super("pan cannot fit " + toppingName + ", please select less toppings");
    }

    public PanOverflowException() {
        super("pan is full, plz select less toppings");
    }
    
}
