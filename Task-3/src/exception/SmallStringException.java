package exception;

public class SmallStringException extends Exception{
    public SmallStringException(){
        super("The given String is small in length for this operation");
    }
}
