package challenges;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Prime Number Checker !...\n");
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        System.out.println();

        if (num <= 1) {
            System.out.println("Numbers less than 1 are not prime.");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        String str = isPrime ? "Prime" : "Not Prime";

        System.out.println(str);
    }
}