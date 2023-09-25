package homework.service;

public class Banktest {
    
    public static void main(String[] args) {
        
        Bank bank = new Bank();
        bank.init();

        while (!bank.iswaitingQueue()){
            bank.finishProcess();
        }

        System.out.println(bank.getWaittime());
    }
}
