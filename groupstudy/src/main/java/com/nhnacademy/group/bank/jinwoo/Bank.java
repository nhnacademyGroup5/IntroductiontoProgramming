package groupstudy.src.main.java.com.nhnacademy.group.bank.jinwoo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Bank{
    private int count=0;
    private int waitingTime=0;
    private int waitingNum=0;
    private final Random random = new Random();
    public final Queue<Customer> waitingList = new LinkedList<>();

    public void createTicket(){
        try {
            int time = (random.nextInt(10) + 1) * 1000;
            Thread.sleep(time);
            count++;
            waitingNum++;
            Customer customer = new Customer();
            String parse = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            customer.receiveTicket(new Ticket(count, parse));
            System.out.println("(방문) " + customer.getTicket());
            waitingList.offer(customer);
            waitingTime += 5;
            System.out.println("대기인원 : " + waitingNum + "명 | 예상 소요 시간 : " + waitingTime + "초");
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    public void process() {
        try {
            if(!waitingList.isEmpty()){
                Thread.sleep(5000);
                String parse = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(parse + " " + count + "번 고객 업무 완료");
                waitingNum--;
                waitingTime-=5;
                System.out.println("대기인원 : " + waitingNum + "명 | 예상 소요 시간 : " + waitingTime + "초");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
