import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    
    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }
    
    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    
    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
    
    // Method to get balance
    public double getBalance() {
        return balance;
    }
    
    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: $" + balance);
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a bank account
        BankAccount account = new BankAccount("123456789", "John Doe", 1000.0);
        
        // Display initial account details
        System.out.println("Initial Account Details:");
        account.displayAccountDetails();
        System.out.println();
        
        // Perform some transactions
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(2000.0); // This should fail due to insufficient balance
        account.deposit(-100.0); // This should fail due to invalid amount
        
        // Display final account details
        System.out.println("\nFinal Account Details:");
        account.displayAccountDetails();
        
        scanner.close();
    }
}