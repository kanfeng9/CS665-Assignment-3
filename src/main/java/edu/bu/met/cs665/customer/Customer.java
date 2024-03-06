package edu.bu.met.cs665.customer;

import org.apache.log4j.Logger;

public abstract class Customer {
    protected String name;
    protected String email;
    protected CustomerType customerType;
    private static final Logger logger = Logger.getLogger(Customer.class);

    public Customer(String name, String email, CustomerType customerType) {
        this.name = name;
        this.email = email;
        this.customerType = customerType;
        logger.info("Creating a " + customerType + " account for " + name + " with email " + email);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public CustomerType getType() {
        return customerType;
    }

    // Method to generate a personalized email message
    public abstract String getEmailMessage();
}
