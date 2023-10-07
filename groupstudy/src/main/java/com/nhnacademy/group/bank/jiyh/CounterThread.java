package com.nhnacademy.group.bank.jiyh;

import java.time.LocalTime;

public class CounterThread implements Runnable{

    private Bank bank;

    CounterThread(Bank bank){
        this.bank = bank;
    }

    @Override
    public void run() {
        int t = LocalTime.now().toSecondOfDay() + 180;

        while (t >= LocalTime.now().toSecondOfDay()){
            if(!bank.iswaitingQueue()){
                bank.finishProcess();
            }
        }

    }
}
