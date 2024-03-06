package edu.bu.met.cs665;

import edu.bu.met.cs665.customer.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Name: Zhiling Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: EmailGenerationTest.java
 * Description: This test class verifies the functionality of the Email Generation application by ensuring
 * that personalized email messages are correctly generated for different types of customers
 * (Business, Returning, Frequent, New, and VIP). Each test case focuses on a specific customer type,
 * validating the content of the generated email message against expected criteria.
 */
public class EmailGenerationTest {

    private BusinessCustomer businessCustomer;
    private ReturningCustomer returningCustomer;
    private FrequentCustomer frequentCustomer;
    private NewCustomer newCustomer;
    private VIPCustomer vipCustomer;

    /**
     * Sets up test fixtures before each test method. This includes initializing one customer
     * of each type with predefined names and email addresses.
     */
    @Before
    public void setUp() {
        businessCustomer = new BusinessCustomer("Business Name", "business@example.com");
        returningCustomer = new ReturningCustomer("Returning Name", "returning@example.com");
        frequentCustomer = new FrequentCustomer("Frequent Name", "frequent@example.com");
        newCustomer = new NewCustomer("New Name", "new@example.com");
        vipCustomer = new VIPCustomer("VIP Name", "vip@example.com");
    }

    /**
     * Tests that the email message generated for a BusinessCustomer contains the expected content.
     */
    @Test
    public void testBusinessCustomerEmailMessage() {
        String message = businessCustomer.getEmailMessage();
        assertTrue(message.contains("valued Business customer") && message.contains("Business Name"));
    }

    /**
     * Tests that the email message generated for a ReturningCustomer contains the expected welcoming back content.
     */
    @Test
    public void testReturningCustomerEmailMessage() {
        String message = returningCustomer.getEmailMessage();
        assertTrue(message.contains("Welcome back") && message.contains("Returning Name"));
    }

    /**
     * Tests that the email message generated for a FrequentCustomer acknowledges their loyalty with special rewards.
     */
    @Test
    public void testFrequentCustomerEmailMessage() {
        String message = frequentCustomer.getEmailMessage();
        assertTrue(message.contains("frequent visits have earned you") && message.contains("Frequent Name"));
    }

    /**
     * Tests that the email message generated for a NewCustomer includes a welcome message and a discount offer.
     */
    @Test
    public void testNewCustomerEmailMessage() {
        String message = newCustomer.getEmailMessage();
        assertTrue(message.contains("Welcome") && message.contains("New Name") && message.contains("Enjoy a welcome discount"));
    }

    /**
     * Tests that the email message generated for a VIPCustomer highlights their VIP status and offers exclusive benefits.
     */
    @Test
    public void testVIPCustomerEmailMessage() {
        String message = vipCustomer.getEmailMessage();
        assertTrue(message.contains("VIP status") && message.contains("VIP Name"));
    }
}
