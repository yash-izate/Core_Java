package exception;

import java.util.Scanner;

public class ErrorsTypes {
    public static void main(String[] args) {

//        Syntax Errors Demo
//        int d = 7        Syntax Error no semicolon
//        a = 7;           Syntax Error a not declared

//        Logical Errors demo
//        WAP to print prime numbers between 1 and 10
        System.out.println(2);
        for (int i = 1; i < 5; i++) {
            System.out.println(2 * i + 1);
        }

//        Runtime Errors
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is " + 1000 / k);

    }

}