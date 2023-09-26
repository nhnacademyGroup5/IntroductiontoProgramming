package Bank;

import java.util.Queue;

class Teller {
    public void serveCustomer(Customer customer, Queue<Customer> customerQueue,
                              Queue<Ticket> ticketQueue) {
        System.out.println("Serving customer: " + customer.getName());
        customerQueue.poll();
        ticketQueue.poll();
    }
}