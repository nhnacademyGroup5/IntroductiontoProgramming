package jinwoo.assignment.wating_simulator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Bank{
    private int count;
    private int waitingTime;
    private int waitingNum;
    private int workingTime;
    public final Queue<Customer> waitinglist = new LinkedList<>();

    public Bank() {
        this.count = 0;
        this.waitingTime = 0;
        this.waitingNum = 0;
        this.workingTime = 0;
    }

    public synchronized void open(){
        System.out.println("은행 오픈");
        while(workingTime <= 100000){
            Random random = new Random();
            int time = (random.nextInt(10) + 1) * 1000;
            workingTime += time;
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            createTicket();
        }
        System.out.println("은행 업무 종료");
    }

    public void createTicket(){
        count++;
        waitingNum++;
        Customer customer = new Customer();
        LocalDateTime now = LocalDateTime.now();
        String parse = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        Ticket ticket = new Ticket(count, parse);
        customer.receiveTicket(ticket);
        System.out.println(ticket);
        waitinglist.offer(customer);
        waitingTime += 5;
        System.out.println("---------------------------");
        System.out.println("대기인원 : " + waitingNum + "명 | 예상 소요 시간 : " + waitingTime + "초");
        System.out.println("---------------------------");
        System.out.println();
    }

    public synchronized void process() {
        while(waitingNum != 0){
            try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        LocalDateTime now = LocalDateTime.now();
        String parse = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(parse + " " + count + "번 고객 업무 완료");
        waitingNum--;
        waitingTime -= 5;
        waitinglist.poll();
        System.out.println("---------------------------");
        System.out.println("대기인원 : " + waitingNum + "명 | 예상 소요 시간 : " + waitingTime + "초");
        System.out.println("---------------------------");
        System.out.println();
        }
    }
}
