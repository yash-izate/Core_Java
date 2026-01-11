package challenges;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Reverse Number ");
        System.out.print("Please enter a positive number: ");
        int num = sc.nextInt();
        System.out.println();

        int revNum = 0;

        while (num > 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + revNum);
    }
}