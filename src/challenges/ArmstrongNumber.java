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
            sc.close();
            return;
        }

        int sum = getSum(num);

        if (sum == num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }

    private static int getSum(int num) {
        int temp1 = num;
        int digits = 0;

        // Count digits
        if (num == 0) {
            digits = 1;
        } else {
            while (temp1 > 0) {
                digits++;
                temp1 /= 10;
            }
        }

        int temp2 = num;
        int sum = 0;

        // Armstrong calculation (using Math.pow, close to your logic)
        while (temp2 > 0) {
            int digit = temp2 % 10;
            sum += (int) Math.pow(digit, digits);
            temp2 /= 10;
        }
        return sum;
    }
}