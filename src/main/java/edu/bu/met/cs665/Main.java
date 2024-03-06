package edu.bu.met.cs665;

import edu.bu.met.cs665.customer.Customer;
import org.apache.log4j.Logger;

/**
 * Name: Zhiling Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: Main.java
 * Description: This class demonstrates the functionality of the Email Generation application.
 * It creates customer accounts of different types, such as Business, Returning, Frequent, New, and VIP customers,
 * and sends personalized emails to them based on their customer type. The purpose is to show how different customer
 * segments can be handled in an automated and customized manner without the need for a graphical user interface.
 */
public class Main {

  private static final Logger logger = Logger.getLogger(Main.class);

  /**
   * The main method of the application. It attempts to create different types of customer accounts
   * and send personalized emails to them. Demonstrates the use of the CustomerEmailFactory
   * for creating customer objects and simulates sending emails by logging the action.
   *
   * @param args Command line arguments (not used).
   */
  public static void main(String[] args) {
    // Attempt to create different types of customers and send emails
    try {
      // Create a business customer
      Customer businessCustomer = CustomerEmailFactory.createAccount("Joe Smith", "joe@example.com", "Business");
      sendEmail(businessCustomer);

      // Similar operations can be done for other customer types

    } catch (IllegalArgumentException e) {
      // Log the specific error message
      logger.error("Failed to create customer account or send email: ", e);
    }
  }

  /**
   * Sends a personalized email to the specified customer. This method currently simulates email sending
   * by logging the email content. The message content could be tailored based on the customer type
   * to provide a more personalized experience.
   *
   * @param customer The customer to whom the email will be sent. The email content is currently a fixed
   *                 message, but could be enhanced to use personalized messages based on customer type.
   */
  private static void sendEmail(Customer customer) {
    // Simulate email sending by logging the action
    logger.info("Email sent to " + customer.getEmail() + ": " + "We have exciting invoices for you tomorrow.");
  }
}
