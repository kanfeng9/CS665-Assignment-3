package edu.bu.met.cs665.customer;

/**
 * Name: Zhiling Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: FrequentCustomer.java
 * Description: Represents a frequent customer in the Email Generation application. This class extends
 * the Customer abstract class, providing specific implementations for customers who frequently
 * engage with the business. It emphasizes acknowledging their loyalty through personalized
 * email messages that offer special rewards.
 */
public class FrequentCustomer extends Customer {

    /**
     * Constructs a new FrequentCustomer with the specified name and email address.
     *
     * @param name The name of the frequent customer.
     * @param email The email address of the frequent customer.
     */
    public FrequentCustomer(String name, String email) {
        super(name, email, CustomerType.FREQUENT);
    }

    /**
     * Generates a personalized email message for the frequent customer, highlighting their
     * loyalty and the special rewards they've earned through their frequent visits.
     *
     * @return A personalized email message thanking the frequent customer for their loyalty and
     * informing them about special rewards.
     */
    @Override
    public String getEmailMessage() {
        return "Hello " + getName() + "! Your frequent visits have earned you special rewards. Thank you for your loyalty.";
    }
}
