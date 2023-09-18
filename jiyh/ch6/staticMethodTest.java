package ch6;

public class staticMethodTest {
    
    public static void main(String[] args) {
        
        staticMethod.evenNumber(13);

        System.out.println(staticMethod.factorial(4));

        System.out.println(staticMethod.pi(100));

        System.out.println(staticMethod.decode("abcdef", 32));

        staticMethod.pyramid(5);

        System.out.println(staticMethod.isprime(4));
    }
}
