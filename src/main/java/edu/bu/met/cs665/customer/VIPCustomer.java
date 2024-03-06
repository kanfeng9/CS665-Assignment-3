package edu.bu.met.cs665.customer;

public class VIPCustomer extends Customer {

    public VIPCustomer(String name, String email) {
        super(name, email, CustomerType.VIP);
    }

    @Override
    public String getEmailMessage() {
        return "Dear " + getName() + ", your VIP status grants you access to exclusive offers and discounts. We appreciate your continued support.";
    }
}
