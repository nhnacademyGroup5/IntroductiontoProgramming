package com.nhnacademy.group.bank.jiyh;

public class Banktest {
    
    public static void main(String[] args) {

        Bank bank = new Bank();

        Thread cus = new Thread(new CusThread(bank));
        Thread counter = new Thread(new CounterThread(bank));

        cus.start();
        counter.start();

    }
}
