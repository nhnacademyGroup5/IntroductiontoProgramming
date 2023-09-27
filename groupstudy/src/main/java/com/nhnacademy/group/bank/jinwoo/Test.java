package groupstudy.src.main.java.com.nhnacademy.group.bank.jinwoo;

public class Test {
    public static void main(String[] args){
        // 창구가 하나일 경우를 가정 했을때
        System.out.println("은행 오픈");
        long startTime = System.currentTimeMillis();
        long duration = 100000;
        Bank bank = new Bank();
        while(System.currentTimeMillis() - startTime < duration){
            try {
                Thread thread = new Thread(bank::process);
                Thread factoryThread = new Thread(bank::createTicket);
                thread.start();
                factoryThread.start();
                thread.join();
                factoryThread.join();
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("은행 마감");
    }
}
