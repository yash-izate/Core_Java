package oops.execute;

import oops.practice.BankAccount;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount sbi = new BankAccount("Yash Izate", 400389789, 1000);

        int choice;
        do {
            System.out.println("\nWelcome To State Bank Of India!");
            System.out.println("1. Show Account Details");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            System.out.print("\nChoose the function: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println(sbi);
                case 2 -> {
                    System.out.print("Enter the amount you want to deposit: ");
                    double amt = sc.nextDouble();
                    sbi.deposit(amt);
                }
                case 3 -> {
                    System.out.print("Enter the amount you want to withdraw: ");
                    double amt = sc.nextDouble();
                    sbi.withdraw(amt);
                }
                case 4 -> System.out.println("Current Balance: " + sbi.getCurrentBalance());
                case 5 -> System.out.println("Thank you!");
                default -> System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}