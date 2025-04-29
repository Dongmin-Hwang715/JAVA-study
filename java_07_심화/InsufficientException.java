package java_07_심화;

public class InsufficientException extends RuntimeException{
    public InsufficientException(){}

    public InsufficientException(String message){
        super(message);
    }
}
