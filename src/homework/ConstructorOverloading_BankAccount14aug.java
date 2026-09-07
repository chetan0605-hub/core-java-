package homework;

// First class
class BankAccount {

    String accountHolderName;
    int accountNumber;
    double balance;

    // Default constructor
    BankAccount() {
        accountHolderName = "Unknown";
        accountNumber = 0;
        balance = 0;
    }

    // Parameterized constructor
    BankAccount(String name, int number, double bal) {
        accountHolderName = name;
        accountNumber = number;
        balance = bal;
    }

    // Deposit
    void deposit(double amount) {
        balance = balance + amount;
    }

    // Withdraw
    void withdraw(double amount) {
        balance = balance - amount;
    }

    // Display
    void display() {
        System.out.println("Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("-------------------");
    }
}


// Second class - Main method
public class ConstructorOverloading_BankAccount14aug {

    public static void main(String[] args) {

        // First object
        BankAccount b1 = new BankAccount();

        // Second object
        BankAccount b2 = new BankAccount("Kiran", 6034, 5000);

        // Deposit and withdraw
        b1.deposit(1000);
        b1.withdraw(200);

        b2.deposit(2000);
        b2.withdraw(500);

        // Display
        b1.display();
        b2.display();
    }
}