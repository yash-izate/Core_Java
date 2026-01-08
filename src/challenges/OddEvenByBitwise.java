package challenges;

import java.util.Scanner;

public class OddEvenByBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Odd Even Checker using Bitwise Operator !...\n");
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println();

        if ((num & 1) == 1) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Even Number");
        }

    }
}