package projectThree;
import java.util.IllegalFormatCodePointException;
import java.util.Objects;
import java.util.Scanner;

public class Menu {
    Scanner scn = new Scanner(System.in);
    Bank bank = new Bank();

    public void displayMenu(){
        boolean keepGoing = true;
        while(keepGoing) {
        System.out.print("\n******** Main Menu: ********\n\n" +
                "1. Open a New Account\n" +
                "2. Access an Existing Account\n" +
                "3. Close All Accounts\n" +
                "4. Exit\n" +
                ">> ");

                int choice;
                try {
                    choice = scn.nextInt();
                    scn.nextLine();
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number between 1 and 4.");
                    scn.nextLine();
                    continue;
                }
            if (choice == 1) {
                openNewAccount();
            } else if (choice == 2) {
                accessAccount();
            } else if (choice == 3) {
                closeAllAccounts();
            }else if (choice == 4) {
                keepGoing = false;
                scn.close();
            } else {
                System.out.println("Please enter an int 1-4");
            }
        }
    }

    public void accessAccount(){
        try {
            System.out.println("Please enter your PIN:");
            int pin = Integer.parseInt(scn.nextLine());
            Customer customer = bank.customerPin(pin);

            if (customer.getAllAccounts().isEmpty()) {
                System.out.println("No accounts found for this customer.");
                return;
            }
            System.out.println("Your Accounts: \n" + customer.getAllAccounts());
            System.out.println("Please enter the number of the account you would like to access.");
            int accountNumber = scn.nextInt();
            scn.nextLine();

            Account account = customer.getAccountByNum(accountNumber);
            if (account == null) {
                System.out.println("Account number invalid.");
                return;
            }

            System.out.println("Please make a selection: \n" +
                    "1) Make a deposit\n" +
                    "2) Make a withdrawal\n" +
                    "3) See account balance\n" +
                    "4) Close account\n" +
                    "5) Exit");

            int response = Integer.parseInt(scn.nextLine());
            if (response == 1) {
                System.out.println("Enter your deposit amount: ");
                double amount = scn.nextDouble();
                account.deposit(amount);
            } else if (response == 2) {
                System.out.println("Enter your withdrawal amount: ");
                double amount = scn.nextDouble();
                account.withdraw(amount);
            } else if (response == 3) {
                System.out.println("Account Balance: $" + account.getBalance());
            } else if (response == 4) {
                System.out.println("Closing account: " + account);
                customer.removeAccount(account);
            } else if (response == 5) {
                System.out.println("Returning to main menu");
            } else {
                System.out.println("Invalid choice");
            }
        } catch (Exception e){
            System.out.println("PIN not valid.");

        }
    }
    public void openNewAccount(){
        try {
            System.out.println("Are you a new customer Y/N:");
            String response = scn.nextLine();
            Customer customer;
            if (response.equals("Y")) {
                customer = createNewCustomer();
                if (customer == null) {
                    return;
                }
            } else if (response.equals("N")) {
                System.out.println("Please enter your PIN: ");
                int pin = scn.nextInt();
                scn.nextLine();
                customer = bank.customerPin(pin);

            } else {
                return;
            }
            System.out.println("Please enter your initial deposit amount: ");
            double deposit;
            while (true) {
                deposit = scn.nextDouble();
                scn.nextLine();
                Account account = new Account(deposit);

                customer.addAccount(account);

                System.out.printf("New Account Opened: %.2f\n", account.getBalance());
                break;
            }
        }catch (Exception e){
            System.out.println("Invalid input");
            scn.nextLine();
        }
        /*System.out.println("Are you a new customer Y/N:");
        String response = scn.nextLine();
        Customer customer = null;
        if (response.equals("Y")){
            customer = createNewCustomer();
            if (customer == null){
                return;
            }
        } else if (response.equals("N")) {
            try {
                System.out.println("Please enter your PIN: ");
                int pin = scn.nextInt();
                scn.nextLine();
                customer = bank.customerPin(pin);
            } catch (Exception e) {
                System.out.println("PIN is not valid.");
            }
        } else{
            return;
        }
        System.out.println("Please enter your initial deposit amount: ");
        double deposit;
        while(true) {
            try {
                deposit = scn.nextDouble();
                scn.nextLine();
                Account account = new Account(deposit);

                customer.addAccount(account);

                System.out.printf("New Account Opened: %.2f\n", account.getBalance());
                break;
            } catch (Exception e) {
                System.out.println("Please enter appropriate amount.");
                scn.nextLine();

            }

        }*/

    }
    public Customer createNewCustomer(){
        System.out.println("Enter your first name: ");
        String fName = scn.nextLine();
        System.out.println("Enter your last name: ");
        String lName = scn.nextLine();
        System.out.println("Enter your 4-digit PIN: ");
        int pin = scn.nextInt();
        scn.nextLine();

        if (bank.customerPin(pin) == null) {
            Customer customer = new Customer(fName, lName, pin);
            bank.addCustomer(customer);
            System.out.println("Customer added into bank's system: " + customer.getFullName());
            return customer;
        } else if (bank.customerPin(pin) != null) {
            System.out.println("That pin is already in use");
            return null;
        }
        return null;
    }
    public void closeAllAccounts(){
        try {
            System.out.println("Enter your pin: ");
            int pin = Integer.parseInt(scn.nextLine());

            Customer customer = bank.customerPin(pin);
            if (customer != null) {
                System.out.println("Customer and all accounts removed from the bank");
                bank.removeCustomer(customer);

            }

        } catch (Exception e){
            System.out.println("PIN is not valid");
        }
    }
}
