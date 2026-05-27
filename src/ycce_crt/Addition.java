package ycce_crt;

import java.util.Scanner;

public class Addition {

    public static int add(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int addRecursion(int n) {
        if (n > 0) {
            return n + addRecursion(n - 1);
        } else {
            return 0;
        }
    }

    public static void printNumber(int n) {

        if (n > 0) {
            System.out.println(n);
            printNumber(n - 1);

        }
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

//        System.out.println("Sum Of numbers: " + addRecursion(n));
//        System.out.println("Sum Of numbers: " + add(n));
//        printNumber(n);
        System.out.println(factorial(n));

    }
}