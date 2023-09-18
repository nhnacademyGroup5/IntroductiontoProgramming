package Unit6;

public class Exercise6_15 {
    public static void main(String[] args) {
        Message message = new Message("jiwon", "kim", " Kim  ji won");
        System.out.println(message);

        message.replacement();
        System.out.println(message);

        message.elimination();
        System.out.println(message);
    }
}
