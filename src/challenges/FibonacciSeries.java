package challenges;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to Fibonacci Series Calculator !...\n");
        System.out.print("Enter the number of terms you want: ");
        int terms = sc.nextInt();
        System.out.println();

        int first = 0;
        int second = 1;
        int i = 2;

        System.out.print("Fibonacci Series: ");

        if (terms > 2) {
            System.out.print(first + ", " + second + ", ");
        } else if (terms == 2) {
            System.out.println("0, 1");
            return;
        } else if (terms == 1) {
            System.out.println("0 ");
            return;
        } else {
            System.out.println("Enter a valid number!");
        }

        while (i < terms) {
            int third = first + second;
            System.out.print(third + ", ");
            first = second;
            second = third;
            i++;

        }
    }
}