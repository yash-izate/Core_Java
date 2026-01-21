package oops.practice;

public class BankAccount {
    private final String accountHolderName;
    private final long accountNumber;
    private double currentBalance;

    public BankAccount(String accountHolderName, long accountNumber, double currentBalance) {
        if (currentBalance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }

        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("\nPlease enter a valid amount!");
        } else {
            currentBalance += amount;
            System.out.println("Amount Deposited Successfully!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (currentBalance < amount) {
                System.out.println("Insufficient Balance!");
            } else {
                currentBalance = currentBalance - amount;
                System.out.println("Amount Withdrawn Successfully!");
            }
        } else {
            System.out.println("Enter Valid Amount For Withdrawal!");
        }
    }

    @Override
    public String toString() {
        return "Account Holder Name: " + accountHolderName + '\n' +
                "Account Number: " + accountNumber + '\n' +
                "Bank Name: State Bank Of India";
    }
}