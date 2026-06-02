package exception;

import java.util.Scanner;

public class ExceptionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        exception due to array
        int[] marks = new int[5];
        marks[0] = 8;
        marks[1] = 56;
        marks[2] = 6;

        System.out.println("Enter the array index: ");
        int idx = sc.nextInt();

        System.out.println("Enter the num index: ");
        int num = sc.nextInt();

        try {
            System.out.println("The value at array index entered is :" + marks[idx]);
            System.out.println("The result of division is : " + marks[idx] / num);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred (Divide by zero not allowed)!");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Exception occurred!");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Some Exception occurred!");
            System.out.println(e);
        }
    }
}