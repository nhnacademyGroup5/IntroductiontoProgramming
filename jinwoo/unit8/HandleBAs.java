package jinwoo.unit8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

// Ex 8.7. (같이 해봐요)
public class HandleBAs {
    private String name;
    private String surname;
    private int balance;

    public HandleBAs(String name, String surname, int balance) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }

    private void handleBAs(String filename) throws IOException{
        File file = new File("jinwoo/unit8/resources/" + filename + ".txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(this.toString() + "\n");
        bufferedWriter.close();
        fileOutputStream.close();
    }

    public void interests(double rate){

    }

    @Override
    public String toString() {
        return "[name=" + name + ", surname=" + surname + ", balance=" + balance + "]";
    }
}
