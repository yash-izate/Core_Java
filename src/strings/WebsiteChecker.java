package strings;

import java.util.Scanner;

public class WebsiteChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to Website Checker !\n");
        System.out.println("Enter website url: ");
        String url = sc.nextLine().toLowerCase();
        System.out.println();

        if (url.endsWith(".com")) {
            System.out.println("Commercial Website");
        } else if (url.endsWith(".org")) {
            System.out.println("Organization Website");
        } else if (url.endsWith(".in")) {
            System.out.println("Indian Website");
        } else {
            System.out.println("Invalid URL Link");
        }
    }
}