package basic;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Password Checker !...\n");

        String correctPass = "pass123";
        String pass;

        do {
            System.out.print("Please enter your Password: ");
            pass = sc.nextLine();

            if (!pass.equals(correctPass)) {
                System.out.println("Incorrect Password. Try Again!\n");
            }

        } while (!pass.equals(correctPass));

        System.out.println("\nPassword Matched. Congratulations!");
        sc.close();
    }
}