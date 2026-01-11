package challenges;

import java.util.Scanner;

public class ArmstrongNumber {

    // Function to count digits
    static int countDigits(int num) {
        if (num == 0) {
            return 1;
        }

        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }

    // Function to calculate Armstrong sum
    static int calculateArmstrongSum(int num, int digits) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, digits);
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Armstrong Number Checker !...\n");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Negative numbers cannot be Armstrong numbers.");
            sc.close();
            return;
        }

        int digits = countDigits(num);
        int sum = calculateArmstrongSum(num, digits);

        if (sum == num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}