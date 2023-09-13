package jinwoo;

import java.util.Scanner;

// Ex 3.5.
public class MessageEx {
    public static void main(String[] args) {
        Message message = new Message("010-5678-1234", "OMG", "Oh My God");
        message.sendMessage("OMG Hello");
        System.out.println(message.getRecieverNum());
        System.out.println(message.getSender());
        System.out.println(message.getText());

        // Ex 3.6.
        Scanner sc = new Scanner(System.in);
        String receiver = sc.next();
        String code = sc.next();
        String text = sc.next();
        sc.close();
        Message newMessage = new Message(receiver, code, text);
        newMessage.sendMessage(code);
    }
}
