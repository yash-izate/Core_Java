package basic;

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nShowcasing Bitwise Operator !..\n");
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println();

        int bitAND = num1 & num2;
        System.out.println("Bitwise AND = " + bitAND);

        int bitOR = num1 | num2;
        System.out.println("Bitwise OR = " + bitOR);

        int bitXOR = num1 ^ num2;
        System.out.println("Bitwise XOR = " + bitXOR);

        int bitNOT = ~num1;
        System.out.println("Bitwise NOT of first number: " + bitNOT);

        int bitLShift = num1 << 2;
        System.out.println("Left Shift by 2 = " + bitLShift);

        int bitRShift = num1 << 2;
        System.out.println("Right Shift by 2 = " + bitRShift);

    }

}