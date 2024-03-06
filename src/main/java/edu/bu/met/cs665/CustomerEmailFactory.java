package edu.bu.met.cs665;

import edu.bu.met.cs665.customer.*;
import org.apache.log4j.Logger;

/**
 * Name: Zhiling Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: CustomerEmailFactory.java
 * Description: This class serves as a factory for creating Customer objects of various types
 * (BUSINESS, RETURNING, FREQUENT, NEW, VIP) based on the provided customer type string.
 * It demonstrates the Factory Method Pattern, enabling the encapsulation of object creation logic
 * based on customer type, thus promoting flexibility and ease of maintenance.
 */
public class CustomerEmailFactory {
    private static final Logger logger = Logger.getLogger(CustomerEmailFactory.class);

    public enum CustomerType {
        BUSINESS, RETURNING, FREQUENT, NEW, VIP
    }

    /**
     * Creates a Customer object of the appropriate subclass based on the specified type string.
     * The method translates the string into a CustomerType enum and creates an instance of the corresponding
     * Customer subclass. If the specified type does not match any known CustomerType, it throws an IllegalArgumentException.
     *
     * @param name The name of the customer.
     * @param email The email address of the customer.
     * @param typeString The type of the customer as a string, which should match one of the predefined types.
     * @return A Customer object of the specified type, fully initialized with the provided name and email.
     * @throws IllegalArgumentException if the provided typeString does not match any known CustomerType.
     */
    public static Customer createAccount(String name, String email, String typeString) {
        CustomerType type;
        try {
            type = CustomerType.valueOf(typeString.toUpperCase());
        } catch (IllegalArgumentException e) {
            logger.error("Invalid customer type provided: " + typeString, e);
            throw new IllegalArgumentException("Invalid customer type: " + typeString, e);
        }

        switch (type) {
            case BUSINESS:
                return new BusinessCustomer(name, email);
            case RETURNING:
                return new ReturningCustomer(name, email);
            case FREQUENT:
                return new FrequentCustomer(name, email);
            case NEW:
                return new NewCustomer(name, email);
            case VIP:
                return new VIPCustomer(name, email);
            default:
                logger.error("Unhandled customer type: " + type);
                throw new IllegalStateException("Unhandled customer type: " + type);
        }
    }
}
