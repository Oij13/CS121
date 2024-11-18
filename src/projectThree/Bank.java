package projectThree;

import java.util.HashMap;

public class Bank {
    HashMap<Integer, Customer> customers = new HashMap<>();


    public void addCustomer(Customer customer){
        customers.put(customer.getPin(), customer);
    }

    public void removeCustomer(Customer customer){
        customers.remove(customer);
    }

    public Customer customerPin(Customer pin){
        if (customers.containsKey(pin.getPin())) {
            customers.get(pin);
            return pin;
        }else {
            System.out.println("Account with that pin does not exist.");
        }
        return null;
    }

    public HashMap<Integer, Customer> getAllCustomer(){
        return customers;
    }




}
