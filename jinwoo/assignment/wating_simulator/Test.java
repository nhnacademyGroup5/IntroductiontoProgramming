package jinwoo.assignment.wating_simulator;

public class Test {
    public static void main(String[] args){
        Bank bank = new Bank();
        Thread thread = new Thread(() -> bank.open());
        Thread secondThread = new Thread(() -> bank.process());
        thread.start();
        secondThread.start();
    }
}
