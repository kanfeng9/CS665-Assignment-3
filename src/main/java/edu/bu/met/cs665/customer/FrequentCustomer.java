package edu.bu.met.cs665.customer;

public class FrequentCustomer extends Customer {

    public FrequentCustomer(String name, String email) {
        super(name, email, CustomerType.FREQUENT);
    }

    @Override
    public String getEmailMessage() {
        return "Hello " + getName() + "! Your frequent visits have earned you special rewards. Thank you for your loyalty.";
    }
}
