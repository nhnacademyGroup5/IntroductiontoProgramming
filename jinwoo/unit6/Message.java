package jinwoo.unit6;

// Ex 3.4.
public class Message {
    private String receiver;
    private String sender;
    private String text;

    public Message(String receiver, String sender, String text) {
        this.receiver = receiver;
        this.sender = sender;
        this.text = text;
    }

    public String getReceiver() {
        return receiver;
    }
    public String getSender() {
        return sender;
    }
    public String getText() {
        return text;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
    public void setText(String text) {
        this.text = text;
    }
    
    public void swap(){
        String tmpReceiver = this.receiver;
        String tmpSender = this.sender;
        String tmpText = this.text;
        String[] vowels = new String[]{"a", "e", "i", "o", "u"};
        setSender(tmpReceiver);
        setReceiver(tmpSender);
        tmpText.replaceAll("h", "  ");
        for (int i = 0; i < vowels.length; i++) {
            tmpText.replaceAll(vowels[i], "");
        }
        setText(tmpText);
    }

    @Override
    public String toString() {
        return "Message [To " + receiver + ", text : " + text + ", From " + sender + "]";
    }
    

    
}
