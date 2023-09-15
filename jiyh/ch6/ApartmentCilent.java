package ch6;

import java.io.BufferedReader;
import java.io.IOException;

public class ApartmentCilent {
    public static void main(String[] args) throws IOException {
        
        Apartment apart = new Apartment("광주", 123.21);
        apart.addLiving("1");
        apart.addLiving("2");
        apart.addLiving("3");
        apart.addLiving("4");
        System.out.println(apart.isempty(4));
        apart.delete(3);
        System.out.println(apart.isempty(3));
        apart.saveToFile("apart.txt");

    }

    public static void seveToFile(BufferedReader br, String filename) throws IOException{
        // br = new BufferedReader(new FileReader(filename));

        // String str = br.readLine();
        // while(str != null){
            
        // }        
    }
    
}
