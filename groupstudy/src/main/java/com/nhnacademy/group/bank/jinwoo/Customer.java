package groupstudy.src.main.java.com.nhnacademy.group.bank.jinwoo;

public class Customer {
    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public void receiveTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
