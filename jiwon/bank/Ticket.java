package bank;

class Ticket {
    private int ticketNumber;
    private String ticketingTime;
    private int waitingCustomers;


    public Ticket(int ticketNumber, String ticketingTime, int waitingCustomers) {
        this.ticketNumber = ticketNumber;
        this.ticketingTime = ticketingTime;
        this.waitingCustomers = waitingCustomers;

    }


    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getTicketingTime() {
        return ticketingTime;
    }

    public int getWaitingCustomers() {
        return waitingCustomers;
    }


}