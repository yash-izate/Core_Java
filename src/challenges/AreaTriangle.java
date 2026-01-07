package challenges;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Triangle Area Calculator !... \n");
        System.out.print("Enter height of triangle : ");
        float heightTriangle = sc.nextFloat();
        System.out.print("Enter base of triangle : ");
        float baseTriangle = sc.nextFloat();

        System.out.println();

        double areaTriangle = (0.5) * baseTriangle * heightTriangle;

        System.out.println("Area of triangle is " + areaTriangle);
    }
}
