package edu.bu.met.cs665;

import edu.bu.met.cs665.customer.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmailGenerationTest {

    private BusinessCustomer businessCustomer;
    private ReturningCustomer returningCustomer;
    private FrequentCustomer frequentCustomer;
    private NewCustomer newCustomer;
    private VIPCustomer vipCustomer;

    @Before
    public void setUp() {
        // Initialize one customer of each type before each test
        businessCustomer = new BusinessCustomer("Business Name", "business@example.com");
        returningCustomer = new ReturningCustomer("Returning Name", "returning@example.com");
        frequentCustomer = new FrequentCustomer("Frequent Name", "frequent@example.com");
        newCustomer = new NewCustomer("New Name", "new@example.com");
        vipCustomer = new VIPCustomer("VIP Name", "vip@example.com");
    }

    @Test
    public void testBusinessCustomerEmailMessage() {
        String message = businessCustomer.getEmailMessage();
        assertTrue(message.contains("valued Business customer") && message.contains("Business Name"));
    }

    @Test
    public void testReturningCustomerEmailMessage() {
        String message = returningCustomer.getEmailMessage();
        assertTrue(message.contains("Welcome back") && message.contains("Returning Name"));
    }

    @Test
    public void testFrequentCustomerEmailMessage() {
        String message = frequentCustomer.getEmailMessage();
        assertTrue(message.contains("frequent visits have earned you") && message.contains("Frequent Name"));
    }

    @Test
    public void testNewCustomerEmailMessage() {
        String message = newCustomer.getEmailMessage();
        assertTrue(message.contains("Welcome") && message.contains("New Name") && message.contains("Enjoy a welcome discount"));
    }


    @Test
    public void testVIPCustomerEmailMessage() {
        String message = vipCustomer.getEmailMessage();
        assertTrue(message.contains("VIP status") && message.contains("VIP Name"));
    }
}
