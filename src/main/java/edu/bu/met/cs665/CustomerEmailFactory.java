package edu.bu.met.cs665;

import edu.bu.met.cs665.customer.*;
import org.apache.log4j.Logger;

public class CustomerEmailFactory {
    private static final Logger logger = Logger.getLogger(CustomerEmailFactory.class);

    public enum CustomerType {
        BUSINESS, RETURNING, FREQUENT, NEW, VIP;
    }

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
                return new BusinessCustomer(name, email); // Now uses email address
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
