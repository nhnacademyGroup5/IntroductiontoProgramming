package Unit9;

public class ExceptionLineTooLong extends Exception {
    public ExceptionLineTooLong(int s) {
        super(String.valueOf(s));
    }

}
