package ch3;


public class MessageText {

    private String text;
    private String code;

    MessageText(String text, String code){
        this.text = text;
        this.code = code;
    }

    public String getmessaeCode(){
        return code;
    }

    public String getMessage(){
        return text;
    }
}
