package basic;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWhile Loop Example !...");
        System.out.print("Enter to number: ");
        float num = sc.nextFloat();
        System.out.println();

        int i = 1;

        while (i <= 10) {

            float res = num * i;
            System.out.println(num + " x " + i + " = " + res);
            i++;
        }

    }
}