package challenges;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Simple Intrest Calculator !...\n");
        System.out.print("Enter principal amount; ");
        float p = sc.nextFloat();
        System.out.print("Enter rate of intrest; ");
        float r = sc.nextFloat();
        System.out.print("Enter time in years; ");
        int t = sc.nextInt();
        System.out.println();

        double simpleIntrest = (p * r * t) / 100;

        System.out.println("The simple intrest on " + p + " with " + r + "% rate of intrest for " + t + " years is " + simpleIntrest);
        
    }
}
