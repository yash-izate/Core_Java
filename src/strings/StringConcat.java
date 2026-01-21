package strings;

import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to String Concatenation and To Upper Case Method !");
        System.out.print("Enter your first name: ");
        String fName = sc.nextLine();
        System.out.print("Enter you last name: ");
        String lName = sc.nextLine();

        String fullName = fName.toUpperCase().concat(" ").concat(lName.toUpperCase());

        System.out.format("""
                Good Morning %s,\s
                \t I want to give you a good news that I am finally placed in Amazon\
                .
                """, fullName);

    }
}