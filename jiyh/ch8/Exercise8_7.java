package ch8;

import java.io.IOException;

public class Exercise8_7{
    public static void main(String[] args) throws IOException{
        HandleBAs handle = new HandleBAs("bank.txt");

        handle.printNegative();
        handle.printAll();
    }
}