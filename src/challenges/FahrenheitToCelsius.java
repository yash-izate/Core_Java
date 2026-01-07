package challenges;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Temperature Converter F -> C !...\n");
        System.out.print("Enter temperature: ");
        float far = sc.nextFloat();
        System.out.println();

        float cel = (far - 32) * 5 / 9;

        System.out.println("Temperature in Celsius = " + cel);
    }
}