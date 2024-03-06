package edu.bu.met.cs665.customer;

/**
 * Name: Zhiling Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: VIPCustomer.java
 * Description: This class represents a VIP customer in the Email Generation application.
 * It extends the Customer abstract class, offering a specialized implementation for VIP customers
 * who are highly valued for their loyalty and high engagement with the business. The class aims to
 * provide VIP customers with personalized email messages that recognize their importance to the
 * business and offer them exclusive benefits as a token of appreciation.
 */
public class VIPCustomer extends Customer {

    /**
     * Constructs a new VIPCustomer with the specified name and email address.
     *
     * @param name The name of the VIP customer.
     * @param email The email address of the VIP customer.
     */
    public VIPCustomer(String name, String email) {
        super(name, email, CustomerType.VIP);
    }

    /**
     * Generates a personalized email message for the VIP customer, emphasizing their exclusive
     * status and the special offers and discounts available to them as a mark of recognition
     * for their continued support and loyalty.
     *
     * @return A personalized email message that conveys gratitude and acknowledges the VIP
     * status of the customer, offering them access to exclusive benefits.
     */
    @Override
    public String getEmailMessage() {
        return "Dear " + getName() + ", your VIP status grants you access to exclusive offers and discounts. We appreciate your continued support.";
    }
}
