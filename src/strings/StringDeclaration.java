package strings;

/*
* String is a class
In Java, String is not a primitive data type; it is a class present in java.lang package.

* Strings are immutable
Once a String object is created, its value cannot be changed. Any modification creates a new object.

* Two ways to create Strings
Using string literal: String s = "Hello";
Using new keyword: String s = new String("Hello");

* String literals are stored in String Pool
String literals are stored in a special memory area called String Constant Pool to save memory.

* new String() creates a new object
Using new keyword always creates a new object in heap memory, even if the value already exists.

* == vs equals()
  == compares reference (address)
  equals() compares content (value)

* Common String methods
Examples:
length(), charAt(), toUpperCase(), toLowerCase(), substring(), contains()

* Strings can be concatenated using +
Example:
String s = "Hello" + " World";

* String is thread-safe
Because Strings are immutable, they are safe for multithreading.

* For mutable strings, use StringBuilder or StringBuffer
StringBuilder → faster, not thread-safe
StringBuffer → thread-safe, slower

*/

import java.util.Scanner;

public class StringDeclaration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String("Yash");
        String s = "k";

        System.out.println("\nWelcome to String Declaration !\n");
        System.out.print("Enter your first name: ");
        String first = sc.nextLine();
        System.out.print("Enter your middle name: ");
        String middle = sc.nextLine();
        System.out.print("Enter your last name: ");
        String last = sc.nextLine();

        String fullName = first + " " + middle + " " + last;
        System.out.println("\nYour Full Name: " + fullName);
    }

}