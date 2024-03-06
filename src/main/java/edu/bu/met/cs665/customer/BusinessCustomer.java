package edu.bu.met.cs665.customer;

/**
 * Name: Zhiling Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: BusinessCustomer.java
 * Description: Represents a business customer in the Email Generation application. This class
 * extends the Customer abstract class, providing implementations specific to business customers.
 * It includes custom logic for generating personalized email messages tailored to business customer needs.
 */
public class BusinessCustomer extends Customer {

    /**
     * Constructs a new BusinessCustomer with the specified name and email address.
     *
     * @param name The name of the business customer.
     * @param email The email address of the business customer.
     */
    public BusinessCustomer(String name, String email) {
        super(name, email, CustomerType.BUSINESS);
    }

    /**
     * Generates a personalized email message for the business customer.
     *
     * @return A personalized email message highlighting special offers for business customers.
     */
    @Override
    public String getEmailMessage() {
        return "Dear " + getName() + ", as our valued Business customer, we have special offers for you.";
    }
}
