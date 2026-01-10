package challenges;

import java.util.Scanner;

public class SumOddNum {

    public static int userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    public static void sumOdd(int n) {
        int i = 1;
        int sum = 0;

        while (i <= n) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("The sum of odd number between 1 and " + n + " is " + sum);
    }

    public static void main(String[] args) {
        System.out.println("\nWelcome to Odd Sum Finder !...\n");
        int num = userInput();
        sumOdd(num);
    }
}