package Unit3;

import java.util.Scanner;

public class MessageText {

    private String code;
    private String message;


    public MessageText() {
        Scanner scanner = new Scanner(System.in);

        this.code = scanner.nextLine();
        this.message = scanner.nextLine();

        scanner.close();
    }


    public String getCode() {
        return code;
    }


    public String getText() {
        return message;
    }

    public static void main(String[] args) {
        MessageText message = new MessageText();

        System.out.println("Code: " + message.getCode());
        System.out.println("Message: " + message.getText());
    }

}
