package ch3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        String sender = "010-1234-1234";
        String receiver = null;

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        String arr[] = str.split(" ");

        for(int i=0; i<arr.length; i++){
            sb.append(arr[i].charAt(i));
        }
        MessageText text = new MessageText(str, sb.toString());
        receiver = sc.nextLine();

        Message message = new Message(text, receiver, sender);
        message.print();

        sc.close();

    }
}
