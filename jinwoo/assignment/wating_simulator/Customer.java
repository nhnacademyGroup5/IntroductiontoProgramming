package jinwoo.assignment.wating_simulator;

public class Customer {
    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public void receiveTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
