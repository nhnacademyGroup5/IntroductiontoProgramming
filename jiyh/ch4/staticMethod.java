package ch4;

public class staticMethod {
    public static double converLireEuro(int x){
        return x/1424.24;
    }

    public static boolean sumOverflow(byte x, byte y){
        if(x + y > Byte.MAX_VALUE)
            throw new StackOverflowError();

        return false;
    }

    public static boolean even(int x){
        return (x % 2 == 0) ? true : false;
    }
    public static char lastCharacter(String s){
        return s.charAt(s.length()-1);
    }
}
