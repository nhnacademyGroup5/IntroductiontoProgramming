package jinwoo;

// Ex 3.4.
public class Message {
    private String receiver = "010-1234-5678";
    private String sender = "010-1234-5678";
    private MessageText text;
    
    public String getRecieverNum() {
        return receiver;
    }

    public void setRecieverNum(String receiver) {
        this.receiver = receiver;
    }

    public String getSender() {
        return sender;
    }


    public MessageText getText() {
        return text;
    }

    public Message(String receiver, String sender, String code, String message){
        this.receiver = receiver;
        this.sender = sender;
        this.text = new MessageText(code, message);
    }

    public Message(String receiver, String code, String message){
        this.receiver = receiver;
        this.text = new MessageText(code, message);
    }

    public Message(String message, String code){
        this.text = new MessageText(code, message);
    }

    public void sendMessage(String input){
        if(input.contains(text.getCode())){
            input = input.replace(text.getCode(), text.convert(text.getCode()));
        } else if(input.contains(text.getMessage())){
            input = input.replace(text.getMessage(), text.convert(text.getMessage()));
        }
        System.out.println("To : " + receiver);
        System.out.println(input);
        System.out.println("From : " + sender);
    }

    

    
}
