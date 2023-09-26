package com.nhnacademy.group.bank.jiyh;

public class Customer {
    
    private String account;
    private int balance;
    private String personalDate;
    private Ticket ticket;

    Customer(String account, int balance, String personalDate){
        this.account = account;
        this.balance = balance;
        this.personalDate = personalDate;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

}
