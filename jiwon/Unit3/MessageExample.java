package Unit3;

public class MessageExample {
    public static void main(String[] args) {

        Message message = new Message("0101234", "0105678");
       
        System.out.println(message.getNumberCall());
        System.out.println(message.getNumberSender());

//        Scanner sc = new Scanner(System.in);
//        String numberSend = "";
//        String code = sc.nextLine();
//        String message = sc.nextLine();
//        String numberCall = sc.nextLine();
//
//        Message newMessage = new Message(numberCall);
//        newMessage.printMessage();
    }
}
