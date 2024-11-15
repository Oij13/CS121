package projectThree;

public class Account {
    private double balance;
    private int accountNum;
    private static int numOfAcc = 1000;

    public Account(double balance, int accountNum){
        this.balance = balance;
        this.accountNum = accountNum;
    }

    public void deposit(double dep){
        balance += dep;
        System.out.println("New balance: " + balance);
    }
    public void withdraw(double with){
       while(true) {
           if (balance < with) {
               System.out.println("Insufficient funds");
           } else if (balance >= with) {
               balance -= with;
               System.out.println(with + "withdrawn from account" + accountNum);
               return;
           }
       }
    }

    public double getbalance() {
        return balance;
    }
    public int getAccountNum(){
        return accountNum;
    }

    public String toString() {
        return String.format("Account Balance: %f\nAccount Number: %d\n",balance,accountNum);

    }
}
