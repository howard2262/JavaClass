package domain;

import java.util.Map;
import java.util.HashMap;

public class Customer {

    private String name;

    public static final int HEAD_OFFICE = 0;
    public static final int BILLING = 1;
    public static final int DELIVERY = 2;

    private final Address[] addresses = new Address[3];

    public Customer(String name, Address office, Address billing, Address delivery) {
        this.name = name;
        addresses[HEAD_OFFICE] = office;
        addresses[BILLING] = billing;
        addresses[DELIVERY] = delivery;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name){
       this.name= name;
    }

    public Address getOfficeAddress() {
        return addresses[HEAD_OFFICE];
    }

    public Address getBillingAddress() {
        return addresses[BILLING];
    }

    public Address getDeliveryAddress() {
        return addresses[DELIVERY];
    }

    public Address[] getAddress() {
        return addresses;
    }

    private static final Map<Long, Customer> customers = new HashMap<>();

    static {
        customers.put(1L, new Customer("Fred Bloggs", 
                new Address("1750 Crumlin Road", "", "London", "Ontair0", "N5B 3V6"),
                new Address("6782 Collier Drive", "", "Paris", "Texas", "75462"),
                new Address("1 Airport Road", "", "ManChester", "New HampShire", "03103")));
    }

    public static Customer getCustomer(long id) {
        return customers.get(id);

    }

    public static Map<Long, Customer> getCustomers() {
        return customers;
    }

}
