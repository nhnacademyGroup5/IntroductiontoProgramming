package bank;

class Customer {
    private String name;

    public Customer(int ticketNumber) {
        this.name = "Customer " + ticketNumber;
    }

    public String getName() {
        return name;
    }
}