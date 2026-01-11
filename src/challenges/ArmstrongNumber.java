package challenges;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Armstrong Number Checker !...\n");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Negative numbers cannot be Armstrong numbers.");
            return;
        }

        int original = num;
        int temp = num;
        int digits = 0;

        // Count digits
        if (num == 0) {
            digits = 1;
        } else {
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
        }

        temp = num;
        int sum = 0;

        // Calculate Armstrong sum
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}