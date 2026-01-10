package challenges;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Digit Sum Calculator !...");
        System.out.print("Please enter a number: ");
        long num = sc.nextLong();
        System.out.println();

        int sum = 0;

        while (num > 0) {
            int digit = (int) num % 10;
            sum += digit;
            num /= 10;
        }

        System.out.println("Sum of digits of number is " + sum);
    }
}