package groupstudy.src.main.java.com.nhnacademy.group.bank.jiyh;


public class CusThread implements Runnable{
    private Bank bank;

    CusThread(Bank bank){
        this.bank = bank;
    }
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                bank.addVisitCustomer(new Customer("112-1211-1221-32", i, "private"));

                long rand = (long) ( Math.random() * 5 ) + 1;
                Thread.sleep(rand*1000);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        }
    }
}


