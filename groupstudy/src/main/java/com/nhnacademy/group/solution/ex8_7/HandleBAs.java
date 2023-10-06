package com.nhnacademy.group.solution.ex8_7;

import java.io.*;
import java.util.StringTokenizer;

public class HandleBAs {
    private String filename;

    public HandleBAs(String filename) throws IOException{
        String path = "groupSolution/ch8/" + filename + ".txt";
        this.filename = path;
    }

    public Bank setBank() throws IOException{
        Bank newBank = new Bank();
        FileReader fileReader = new FileReader(new File(this.filename));
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        bufferedReader.readLine();
        String line = bufferedReader.readLine();
        while(line != null){
            StringTokenizer stringTokenizer = new StringTokenizer(line);
            String name = stringTokenizer.nextToken();
            String surname = stringTokenizer.nextToken();
            double balance = Double.valueOf(stringTokenizer.nextToken());
            Account account = new Account(surname, name, balance);
            newBank.add(account);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();

        return newBank;
    }

    public void interests(double rate) throws IOException{
        Bank bank = setBank();
        for (Account account : bank.getAccounts()) {
            account.setBalance(rate * account.getBalance());
        }
        bank.stored(filename);
    }

    public void printNegative() throws IOException{
        Bank bank = setBank();
        for (Account account : bank.getAccounts()) {
            if(account.getBalance() < 0 ){
                System.out.println(account);
            }
        }
    }
}
