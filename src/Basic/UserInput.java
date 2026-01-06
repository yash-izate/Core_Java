package Basic;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.printf("My name is %s.", name);
        sc.close();

    }
}
