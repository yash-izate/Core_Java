package challenges;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Income Tax Calculator!\n");
        System.out.print("Enter your annual income: ");
        long income = sc.nextLong();

        double tax = 0;

        // First 2.5 lakh is always non-taxable
        if (income > 250000) {

            // 5% slab
            if (income <= 500000) {
                tax = (income - 250000) * 0.05;
            }

            // 20% slab
            else if (income <= 1000000) {
                tax = (250000 * 0.05)
                        + (income - 500000) * 0.20;
            }

            // 30% slab
            else {
                tax = (250000 * 0.05)
                        + (500000 * 0.20)
                        + (income - 1000000) * 0.30;
            }
        }

        System.out.printf("Tax to be paid: ₹ %.2f", tax);
        sc.close();
    }
}