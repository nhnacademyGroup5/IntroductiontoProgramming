package Unit6;

public class Message {
    private String sender;
    private String receiver;
    private String textMessage;

    public Message(String sender, String receiver, String textMessage) {
        this.sender = sender;
        this.receiver = receiver;
        this.textMessage = textMessage;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public void swap() {
        String tmp = sender;
        sender = receiver;
        receiver = tmp;
    }

    public void elimination() {
        textMessage = textMessage.trim();
    }

    public void replacement() {
        textMessage = textMessage.replace("  ", " ");
    }

    public void replaceVowels() {
        textMessage = textMessage.replaceAll("[a,e,i,o,u]", "");

    }

    public String toString() {
        return sender + " " + receiver + " " + textMessage;
    }
}
