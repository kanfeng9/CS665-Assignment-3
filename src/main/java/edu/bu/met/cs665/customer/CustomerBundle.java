package edu.bu.met.cs665.customer;

public class CustomerBundle {
    private Customer customer;

    public CustomerBundle(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
