package ch8;

import java.io.IOException;

public class FileHandle {
    public static void main(String[] args) throws IOException {
        HandleBAs handle = new HandleBAs("j", "제이", 200);

        handle.HandleBAs("bank.txt");
    }
}
