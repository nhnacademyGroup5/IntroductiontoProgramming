package com.nhnacademy.group.bank.jiyh;

import java.time.LocalTime;

public class Ticket {
    
    private LocalTime time;
    private int number;

    Ticket(int number){
        this.time = LocalTime.now();
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public LocalTime getTime() {
        return time;
    }

    public String toString(){
        return "number : " + number + ",  time : " + time;
    }

}
