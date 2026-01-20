package basic;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Factorial & Fibonacci using Recursion!\n");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println();

        System.out.println("Factorial = " + factorial(num));
        System.out.println();

        System.out.print("Fibonacci Series: ");
        printFibonacci(num, 0);
    }

    // Factorial using recursion
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Fibonacci number using recursion
    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Print Fibonacci series using recursion ONLY
    public static void printFibonacci(int n, int i) {
        if (i == n) {
            return;
        }

        System.out.print(fibonacci(i) + " ");
        printFibonacci(n, i + 1);
    }
}