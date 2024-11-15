package projectThree;

import java.util.ArrayList;

public class Bank {
    ArrayList<String> customers = new ArrayList<>();

    public void addCustomer(String customer){
        customers.add(customer);
    }
    public void removeCustomer(String customer){
        customers.remove(customer);
    }
    public int customerPin(){
        for (int i = 0; i < customers.length)
        return customers[i];
    }

}
