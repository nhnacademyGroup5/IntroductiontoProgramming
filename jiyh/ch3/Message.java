package ch3;

public class Message{
    
    
    private String receiver;
    private String sender;
    private MessageText messageText;


    Message(MessageText messageText, String receiver, String sender){
        this.messageText = messageText;
        this.receiver = receiver;
        this.sender = sender;
    }

    public Message of(MessageText messageText, String receiver, String sender){
        return new Message(messageText, receiver, sender);
    }

    public Message of(MessageText messageText, String receiver){
        return new Message(messageText, receiver, null);
    }

    public Message of(MessageText messageText){
        return new Message(messageText, null, null);
    }

    public void setPhone(String receiver){
        this.receiver = receiver;
    }

    public void print(){
        System.out.println(this.sender + ", " + this.receiver);
        System.out.println(messageText.getMessage() + ", " + messageText.getmessaeCode());
    }
}
