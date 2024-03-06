package edu.bu.met.cs665.customer;

public class NewCustomer extends Customer {

    public NewCustomer(String name, String email) {
        super(name, email, CustomerType.NEW);
    }

    @Override
    public String getEmailMessage() {
        return "Welcome " + getName() + "! As a New customer, we’re thrilled to have you with us. Enjoy a welcome discount on your next purchase.";
    }
}
