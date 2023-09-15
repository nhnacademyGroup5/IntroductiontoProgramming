package ch8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HandleBAs {
    private String name;
    private String subName;
    private double balance;

    public HandleBAs(String name, String subName, double balance) {
        this.name = name;
        this.subName = subName;
        this.balance = balance;
    }

    // filename : bankStorage
    public void HandleBAs(String filename) throws IOException{
        FileWriter fw = new FileWriter(new File(filename), true);

        fw.write(name + " " + subName + " " + balance +"\n");
        fw.flush();
        fw.close();
    }


}
