package challenges;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Simple Interest Calculator !...\n");
        System.out.print("Enter principal amount: ");
        float p = sc.nextFloat();
        System.out.print("Enter rate of interest: ");
        float r = sc.nextFloat();
        System.out.print("Enter time in years: ");
        int t = sc.nextInt();
        System.out.println();

        double simpleInterest = (p * r * t) / 100;

        System.out.print("The simple interest on " + p + " with " + r + "% rate of interest for " + t + " years is " + simpleInterest + ". ");
        System.out.println("The final amount will be " + (simpleInterest + p));

    }
}