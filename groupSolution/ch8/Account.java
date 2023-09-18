package groupSolution.ch8;

public class Account {
    private String name;
    private String subname;
    private double balance;
    
    
    public String getName() {
        return name;
    }
    
    public String getSubname() {
        return subname;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public Account(String name, String subname, double balance) {
        this.name = name;
        this.subname = subname;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Name : " + name + ", Surname : " + subname + ", Balance : " + balance;
    }

    
}
