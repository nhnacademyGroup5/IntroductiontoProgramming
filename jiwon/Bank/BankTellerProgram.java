package Bank;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BankTellerProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Customer> customerQueue = new LinkedList<>();
        Queue<Ticket> ticketQueue = new LinkedList<>();
        Teller teller = new Teller();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");


        int maxTime = 15;
        int sum = 0;
        int ticketNumber = 1;
        while (sum <= maxTime) {
            int enterTime = (int) (Math.random() * 5) + 1;
            try {
                Thread.sleep(enterTime * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Customer customer = new Customer(ticketNumber);
            customerQueue.add(customer);
            String ticketingTime = dateFormat.format(new Date());
            Ticket ticket = new Ticket(ticketNumber, ticketingTime, customerQueue.size() - 1);
            ticketQueue.add(ticket);
            System.out.println("Ticket Number: " + ticket.getTicketNumber());
            System.out.println("Ticketing Time: " + ticket.getTicketingTime());
            System.out.println("Waiting Customers: " + ticket.getWaitingCustomers());
            ticketNumber++;
            sum += enterTime;
        }

    }
}