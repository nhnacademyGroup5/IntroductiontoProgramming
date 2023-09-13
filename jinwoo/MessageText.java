package jinwoo;
// Exercise 3.3. We want to realize a system for composing messages to send via a cell phone. Each message corresponds to a code. For example, to the code "ily" corresponds the complete message "I love you, darling.". Define the class MessageText to handle messages. The class must have:

public class MessageText {
    private String code;
    private String message;

    public String getCode() {
        return code;
    }


    public String getMessage() {
        return message;
    }

    public MessageText(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String convert(String input){
        if(input.equals(this.message)){
            return this.getCode();
        } else if(input.equals(this.code)){
            return this.getMessage();
        } else {
            return "There is no equivalent message or code.";
        }
    }

    @Override
    public String toString() {
        return "MessageText [code=" + code + ", message=" + message + "]";
    }
}
