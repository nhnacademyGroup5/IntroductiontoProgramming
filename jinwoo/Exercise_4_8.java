package jinwoo;
// Ex 4.8.

class Account {
    public int bal;
    public Account(int x) {
        bal = x; 
    }
}
public class Exercise_4_8 {
    public static void method(int a, Account b) {
        a *= 2;
        b.bal *= 2;
    }
    public static void main(String[] args) {
        int c = 100;
        Account r = new Account(100);
        method(c,r);
        System.out.println(c + " " + r.bal);
    }
}
