package Unit4;

public class Exercise4_2 {

    public static boolean sumOverflow(byte x, byte y) {

        short a = x;
        short b = y;


        short sum = (short) (a + b);


        return (sum < Byte.MIN_VALUE || sum > Byte.MAX_VALUE);
    }

    public static void main(String[] args) {
        System.out.println(sumOverflow((byte) 0, (byte) 4));

    }

}
