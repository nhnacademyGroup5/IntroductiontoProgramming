package ch8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ApartmentCilent {
    public static void main(String[] args) throws IOException {
        
        Apartment apart = new Apartment("광주", 123.21);
        apart.addLiving("1");
        apart.addLiving("2");
        apart.addLiving("3");
        apart.addLiving("4");

        // 삭제후 제위치에 정렬 되었는지 확인
        System.out.println(apart.isempty(4));
        apart.delete(3);
        System.out.println(apart.isempty(3));

        System.out.println("------- read file ---------");
        apart.saveToFile("apart.txt");
        readFromFile("apart.txt");
    }

    public static void readFromFile(String filename) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(filename));

        String str = br.readLine();
        while(str != null){
            System.out.println(str);
            str = br.readLine();
        }
    }
    
}
