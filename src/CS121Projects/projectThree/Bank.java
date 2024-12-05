package CS121Projects.projectThree;

import java.util.HashMap;

public class Bank {
    HashMap<Integer, Customer> customers = new HashMap<>();


    public void addCustomer(Customer customer){
        customers.put(customer.getPin(), customer);
    }

    public void removeCustomer(Customer customer){
        if (customers.remove(customer.getPin()) != null) {
            System.out.println("Customer removed successfully.");
        } else {
            System.out.println("Customer not found.");
        }
    }

    public Customer customerPin(int pin){
        return customers.get(pin);
    }

    public HashMap<Integer, Customer> getAllCustomer(){
        return customers;
    }




}
