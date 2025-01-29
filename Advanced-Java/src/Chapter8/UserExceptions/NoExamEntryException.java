package Chapter8.UserExceptions;

public class NoExamEntryException extends Exception{
    public NoExamEntryException(String message) {
        super(message);
    }
}
