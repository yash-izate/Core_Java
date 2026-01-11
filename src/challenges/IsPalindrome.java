package challenges;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Palindrome Checker !...\n");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println();

        int temp = num;
        int rev = 0;

        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        if (rev == num) {
            System.out.println("It is Palindrome Number");
        } else {
            System.out.println("It is not a Palindrome Number.");
        }

    }
}