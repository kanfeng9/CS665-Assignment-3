package edu.bu.met.cs665.customer;

/**
 * Name: Zhiling Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: NewCustomer.java
 * Description: Represents a new customer in the Email Generation application. This class is a subclass
 * of the Customer abstract class, providing a customized implementation for customers who are new to
 * the business. The primary goal with new customers is to welcome them warmly to encourage future engagement
 * and build a strong relationship from the start. The personalized email message aims to reflect this
 * welcoming and inclusive attitude.
 */
public class NewCustomer extends Customer {

    /**
     * Constructs a NewCustomer with the specified name and email address.
     *
     * @param name The name of the new customer.
     * @param email The email address of the new customer.
     */
    public NewCustomer(String name, String email) {
        super(name, email, CustomerType.NEW);
    }

    /**
     * Generates a personalized email message for the new customer. The message welcomes the customer
     * to the business and offers a welcome discount on their next purchase, aiming to foster initial
     * loyalty and encourage them to engage with the business's offerings.
     *
     * @return A personalized welcome email message that includes an offer for a welcome discount.
     */
    @Override
    public String getEmailMessage() {
        return "Welcome " + getName() + "! As a New customer, we’re thrilled to have you with us. Enjoy a welcome discount on your next purchase.";
    }
}
