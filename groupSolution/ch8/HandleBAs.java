package ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HandleBAs{
    private String filename;
    private List<Bank> bank = new ArrayList<>();

    HandleBAs(String filename) throws IOException{
        this.filename = filename;
        bankInit();
        System.out.println(bank.size());
    }

    public void bankInit() throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader(this.filename))){

            String str = br.readLine();
            while(!isEmtpy(str)){
                String[] bankCus = str.split(" ");
                Bank cus = new Bank(bankCus[0], bankCus[1]);
                cus.setBalance(Double.parseDouble(bankCus[2]));
                bank.add(cus); 

                str = br.readLine();
            }

            Collections.sort(bank);

        } catch (FileNotFoundException e) {
            System.out.println("파일을 다시 확인하세요");
        } catch (NumberFormatException e1) {
            System.out.println("balance의 잘못된 입력 존재");
        }
        
    }

    public void interests(double rate){
        for(Bank b : bank){
            b.updateBalance(rate);
        }
    }

    public void printAll(){
        for(Bank b : bank){
            System.out.println(b.toString());
        }
    }
    public void printNegative(){
        for(Bank b : bank){
            if(b.getBalance() < 0) System.out.println(b.toString());
        }
    }

    public void storageBank() throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(filename));

        for(Bank b : bank){
            bw.write(b.toString());
        }
        bw.flush();
        bw.close();
    }

    public boolean isEmtpy(String str){
        if(str == null) return true;
        return false;
    }

}