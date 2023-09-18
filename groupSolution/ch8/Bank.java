package ch8;

public class Bank implements Comparable<Bank>{
    private String name;
    private String subname;
    private double balance;

    public Bank(String name, String subname) {
        this.name = name;
        this.subname = subname;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public String getSubname() {
        return this.subname;
    }

    public double getBalance() {
        return this.balance;
    }

    public String toString(){
        return name + " " + subname + " " + balance;
    }

    public void updateBalance(double rate){
        this.balance = balance * rate;
    }
    
    public int compareTo(Bank b){
        return (int) (this.balance - b.getBalance());
    }

}
