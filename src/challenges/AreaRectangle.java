package challenges;

import java.util.Scanner;

public class AreaPerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Rectangle Area/Perimeter Calculator !...\n");
        System.out.print("Enter length of rectangle: ");
        float length = sc.nextFloat();
        System.out.print("Enter width of rectangle: ");
        float width = sc.nextFloat();

        System.out.println();

        double areaRect = length * width;
        double perimeterRect = 2 * (length + width);

        System.out.println("Area of Rectangle is " + areaRect);
        System.out.println("Perimeter of Rectangle is " + perimeterRect);

    }
}
