package edu.bu.met.cs665.customer;

public class ReturningCustomer extends Customer {

    public ReturningCustomer(String name, String email) {
        super(name, email, CustomerType.RETURNING);
    }

    @Override
    public String getEmailMessage() {
        return "Welcome back, " + getName() + "! As a Returning customer, we're excited to offer you exclusive deals.";
    }
}
