package challenges;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Greatest Number Finder !...\n");
        System.out.print("Enter first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter second number: ");
        float b = sc.nextFloat();
        System.out.print("Enter third number: ");
        float c = sc.nextFloat();
        System.out.println();

        System.out.print("Greatest Number: ");

        if (a > b && a > c) {
            System.out.print(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}