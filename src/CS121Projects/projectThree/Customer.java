package CS121Projects.projectThree;

import java.util.ArrayList;

public class Customer {
    private String fName, lName;
    private int pin;
    ArrayList<Account> accounts;

    public Customer(String fName, String lName, int pin){
        this.fName = fName;
        this.lName = lName;
        this.pin = pin;
        this.accounts = new ArrayList<>();
    }

    public String getFullName() {
        return fName + " " + lName;
    }
    public int getPin() {
        return pin;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }
    public void removeAccount(Account account){accounts.remove(account); }
    public Account getAccountByNum(int accNum) {
        for (Account account : accounts) {
            if (account.getAccountNum() == accNum) {
                return account;
            }
        }
        return null;
    }
    public ArrayList<Account> getAllAccounts(){
        return accounts;
    }

    @Override
    public String toString() {
        return String.format("Customer's name: %s\nPIN: %f",getFullName(),pin);
    }
}
