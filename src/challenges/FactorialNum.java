package challenges;

import java.util.Scanner;

public class FactorialNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Factorial Finder !...\n");
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        System.out.println();

        long fact = 1;

        while (num > 0) {
            fact *= num;
            num--;
        }

        System.out.println("The factorial of number is " + fact);
    }
}