package edu.bu.met.cs665.customer;

/**
 * Name: Zhiling Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: ReturningCustomer.java
 * Description: This class represents a returning customer within the Email Generation application.
 * It extends the Customer abstract class, providing a tailored implementation for customers who
 * have previously engaged with the business. The focus for returning customers is to recognize
 * their loyalty and to incentivize continued patronage by offering them exclusive deals through
 * personalized email communications.
 */
public class ReturningCustomer extends Customer {

    /**
     * Constructs a new ReturningCustomer with the specified name and email address.
     *
     * @param name The name of the returning customer.
     * @param email The email address of the returning customer.
     */
    public ReturningCustomer(String name, String email) {
        super(name, email, CustomerType.RETURNING);
    }

    /**
     * Generates a personalized email message for the returning customer, emphasizing a warm welcome back
     * and the provision of exclusive deals as a token of appreciation for their loyalty.
     *
     * @return A personalized email message designed to re-engage and reward the returning customer,
     * underscoring the business's enthusiasm for their continued patronage.
     */
    @Override
    public String getEmailMessage() {
        return "Welcome back, " + getName() + "! As a Returning customer, we're excited to offer you exclusive deals.";
    }
}
