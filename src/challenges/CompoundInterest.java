package challenges;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Compound Interest Calculator !...\n");
        System.out.print("Enter principal amount: ");
        float p = sc.nextFloat();
        System.out.print("Enter rate of interest: ");
        float r = sc.nextFloat();
        System.out.print("Enter time in years: ");
        int t = sc.nextInt();
        System.out.println();

        double compoundInterest = p * Math.pow((1 + r / 100), t);

        System.out.print("The compound interest on " + p + " with " + r + "% rate of interest for " + t + " years is "
                + compoundInterest + ".");
        System.out.println("The final amount will be " + (compoundInterest + p));

    }
}