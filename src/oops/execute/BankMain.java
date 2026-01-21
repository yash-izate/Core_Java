package oops.execute;

import oops.practice.BankAccount;

import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount sbi = new BankAccount("Yash Izate", 400389789L, 1000.0);

        int choice = 0;

        do {
            System.out.println("\nWelcome To State Bank Of India!");
            System.out.println("1. Show Account Details");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            System.out.print("\nChoose the function: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                sc.next(); // clear invalid input
                continue;
            }

            choice = sc.nextInt();

            switch (choice) {

                case 1 -> System.out.println(sbi);

                case 2 -> {
                    System.out.print("Enter deposit amount: ");
                    double amount = sc.nextDouble();

                    if (sbi.deposit(amount)) {
                        System.out.println("Amount deposited successfully!");
                    } else {
                        System.out.println("Invalid deposit amount!");
                    }
                }

                case 3 -> {
                    System.out.print("Enter withdrawal amount: ");
                    double amount = sc.nextDouble();

                    if (sbi.withdraw(amount)) {
                        System.out.println("Amount withdrawn successfully!");
                    } else {
                        System.out.println("Invalid amount or insufficient balance!");
                    }
                }

                case 4 -> System.out.println("Current Balance: ₹" + sbi.getBalance());

                case 5 -> System.out.println("Thank you for banking with us!");

                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}