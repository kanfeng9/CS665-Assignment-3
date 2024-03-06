package edu.bu.met.cs665;

// Make sure to import the correct classes
import edu.bu.met.cs665.customer.Customer;
import edu.bu.met.cs665.CustomerEmailFactory;
import org.apache.log4j.Logger;

public class Main {

  private static final Logger logger = Logger.getLogger(Main.class);

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

  // Encapsulate the email sending logic, possibly using an email API or other mechanism
  private static void sendEmail(Customer customer) {
    // Example: Assume there's a method to send emails
    // MailService.send(customer.getEmail(), message);
    logger.info("Email sent to " + customer.getEmail() + ": " + "We have exciting invoices for you tomorrow.");
  }
}
