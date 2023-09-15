package jinwoo.unit6;

public class MessageTest {
    public static void main(String[] args) {       
        Message message = new Message("jinwoo", "you", "hi i'm Jinwoo haha");        
        System.out.println(message);
        message.swap();
        System.out.println(message);
    }
}
