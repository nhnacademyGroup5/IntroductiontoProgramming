package ch6;

public class MessagesTest {
    public static void main(String[] args) {
        Messages m1 = new Messages("me", "you", "  abced tset     ");

        System.out.println(m1.getMessage());
        m1.eliminationSpace();
        System.out.println(m1.getMessage());
        m1.eliminationvowel();
        System.out.println(m1.getMessage());

        Messages m2 = new Messages("me", "you", "  abced tset     ");
        System.out.println(m2.getMessage());
        m2.eliminationAll();
        System.out.println(m2.getMessage());

    }
}
