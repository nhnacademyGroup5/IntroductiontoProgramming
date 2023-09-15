package ch8;

public class BankAccount {
    private String name;
    private String subname;
    private double balance;

    BankAccount(String name, String subname, double balance){
        this.name = name;
        this.subname = subname;
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
}
