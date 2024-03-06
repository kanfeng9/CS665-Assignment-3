package edu.bu.met.cs665.customer;

public class BusinessCustomer extends Customer {

    public BusinessCustomer(String name, String email) {
        super(name, email, CustomerType.BUSINESS);
    }

    @Override
    public String getEmailMessage() {
        return "Dear " + getName() + ", as our valued Business customer, we have special offers for you.";
    }
}
