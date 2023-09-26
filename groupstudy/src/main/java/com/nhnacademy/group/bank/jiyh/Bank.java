package com.nhnacademy.group.bank.jiyh;

import java.time.LocalTime;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;

public class Bank {

    private static int ticketNum = 1;
    private Queue<Customer> watingCusList = new LinkedList<>();
    private Counter counter = new Counter(new Employee("지영훈", "2018112479"), 1);

    public void addVisitCustomer(Customer cus){
        cus.setTicket(new Ticket(ticketNum++));
        watingCusList.offer(cus);
    }

    public void finishProcess(){
        if (watingCusList.isEmpty()) return;

        counter.process(watingCusList.poll());
        System.out.println("남은 고객의 수는 " + watingCusList.size() + "명 입니다");
    }    

    public String getWaitngtime(){
        return counter.getCusWaitingTime();
    }

    public boolean iswaitingQueue(){
        return watingCusList.isEmpty();
    }

}
