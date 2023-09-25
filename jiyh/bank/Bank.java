package bank;

import java.util.LinkedList;
import java.util.Queue;

public class Bank {

    private static int ticketNum = 1;
    private Queue<Customer> watingCusList = new LinkedList<>();
    private Counter counter = new Counter(new Employee("지영훈", "2018112479"));


    // 임시 테스트를 위한 초기화
    public void init(){
        for(int i=0; i<10; i++){
            try {
                visitCustomer(new Customer("112-1211-1221-32", i, "private"));

                int rand = (int) ( Math.random()*5 ) + 1;
                Thread.sleep(rand*1000);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        }
    }

    public void visitCustomer(Customer cus){
        cus.setTicket(new Ticket(ticketNum++));
        watingCusList.offer(cus);
    }

    public void finishProcess(){
        counter.process(watingCusList.poll());
        System.out.println("남은 고객의 수는 " + watingCusList.size() + "명 입니다");
    }    

    public String getWaittime(){
        return counter.getCusWaitingTime();
    }

    public boolean iswaitingQueue(){
        return watingCusList.isEmpty();
    }

}
