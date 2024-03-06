package edu.bu.met.cs665.customer;

/**
 * Name: Zhiling Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: CustomerType.java
 * Description: Defines the different types of customers supported by the Email Generation application.
 * Each enum value represents a specific segment of customers, allowing for targeted personalization
 * and communication strategies. The application uses these types to generate and send personalized
 * emails tailored to each customer segment's unique needs and preferences.
 */
public enum CustomerType {
    /**
     * Represents customers with business accounts, typically requiring formal and professional communication.
     */
    BUSINESS,

    /**
     * Represents customers who have previously purchased and are returning, emphasizing gratitude and offers to encourage repeat business.
     */
    RETURNING,

    /**
     * Represents customers who frequently engage with the business, warranting rewards or recognition for their loyalty.
     */
    FREQUENT,

    /**
     * Represents new customers, focusing on welcoming messages and introductory offers to build a relationship.
     */
    NEW,

    /**
     * Represents highly valued customers who receive VIP treatment, including exclusive offers and services.
     */
    VIP
}
