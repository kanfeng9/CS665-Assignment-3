package edu.bu.met.cs665.customer;

import org.apache.log4j.Logger;

/**
 * Name: Zhiling Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: Customer.java
 * Description: This abstract class represents a general customer in the Email Generation application.
 * It serves as the base class for different types of customers (e.g., Business, Returning, Frequent, New, VIP),
 * encapsulating common properties like name, email, and customer type. It also defines the contract for generating
 * personalized email messages, which must be implemented by subclasses.
 */
public abstract class Customer {
    protected String name;
    protected String email;
    protected CustomerType customerType;
    private static final Logger logger = Logger.getLogger(Customer.class);

    /**
     * Constructs a new Customer with the given name, email, and customer type.
     * Logs the creation of a new customer account.
     *
     * @param name The name of the customer.
     * @param email The email address of the customer.
     * @param customerType The type of the customer, as defined by the CustomerType enum.
     */
    public Customer(String name, String email, CustomerType customerType) {
        this.name = name;
        this.email = email;
        this.customerType = customerType;
        logger.info("Creating a " + customerType + " account for " + name + " with email " + email);
    }

    /**
     * Gets the name of the customer.
     *
     * @return The name of the customer.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the email address of the customer.
     *
     * @return The email address of the customer.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gets the customer type.
     *
     * @return The customer type, as defined by the CustomerType enum.
     */
    public CustomerType getType() {
        return customerType;
    }

    /**
     * Abstract method to generate a personalized email message for the customer.
     * This method must be implemented by subclasses to provide specific messages for different customer types.
     *
     * @return A personalized email message tailored to the customer.
     */
    public abstract String getEmailMessage();
}
