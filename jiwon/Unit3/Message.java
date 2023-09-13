package Unit3;

public class Message {
    private String numberCall;
    private String numberSender;
    private MessageText messageText;

    public String getNumberCall() {
        return numberCall;
    }

    public void setNumberCall(String numberCall) {
        this.numberCall = numberCall;
    }

    public String getNumberSender() {
        return numberSender;
    }

    public void setNumberSender(String numberSender) {
        this.numberSender = numberSender;
    }

    public MessageText getMessageText() {
        return messageText;
    }

    public void setMessageText(MessageText messageText) {
        this.messageText = messageText;
    }

    public Message(String numberCall, String numberSender) {
        this.messageText = new MessageText();
        this.numberCall = numberCall;
        this.numberSender = numberSender;

    }

    public Message(String numberSender) {
        this.messageText = new MessageText();
        this.numberSender = numberSender;
    }

    public Message() {
        this.messageText = new MessageText();
    }

    public void newMessage(String phoneNumber) {
        this.numberCall = phoneNumber;
    }

    public void printMessage() {
        System.out.println(numberCall);
        System.out.println(numberSender);
        System.out.println(messageText.getText());
    }

    public static void main(String[] args) {

        Message message1 = new Message("1234", "5678");

        message1.printMessage();
    }


}
