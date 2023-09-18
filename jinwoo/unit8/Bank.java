package jinwoo.unit8;

import java.io.*;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public Bank() {}
    
    public void add(Account account){
        accounts.add(account);
    }

    public void stored(String fileName) throws IOException{
        String path = fileName;
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String title = "Name | Surname | balance";
        bufferedWriter.write(title);
        bufferedWriter.newLine();
        for (Account account : accounts) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(account.getName()).append(" ");
            stringBuilder.append(account.getSubname()).append(" ");
            stringBuilder.append(account.getBalance());
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
    
}
