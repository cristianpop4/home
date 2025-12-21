package homeworks.session10.BankAccountManagementSystem;

public class BankAccount {

    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public  BankAccount(String accountHolderName, String accountNumber, double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        } else {
            System.out.println("The deposit is not possible");
        }
    }

    public void withdraw(double amount){
        if (amount > 0){
            if (amount < balance){
                balance -= amount;
            } else {
                System.out.println("Insufficient funds");
            }
        } else {
            System.out.println("The withdraw is not possible");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public boolean transferFunds(BankAccount targetAcount, double amount){
        if (targetAcount == null || amount <= 0 || amount > balance){
           return false;
        }

        balance -= amount;
        targetAcount.balance += amount;
        return true;
    }
}

class Bank{
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Popescu Cristian", "RO3352564573", 350);
        BankAccount account2 = new BankAccount("Popescu Ionut", "RO7587680856", 7000);

        account1.deposit(650);
        System.out.println(account1.toString());

        account1.transferFunds(account2, 700);
        System.out.println("Account 1 balance is: " + account1.getBalance());
        System.out.println(account2.toString());
    }
}