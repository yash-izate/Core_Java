package challenges;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Student Grade Checker !...\n");
        System.out.print("Enter marks of physics (out of 100): ");
        float phy = sc.nextFloat();
        System.out.print("Enter marks of chemistry (out of 100): ");
        float chem = sc.nextFloat();
        System.out.print("Enter marks of maths (out of 100): ");
        float math = sc.nextFloat();
        System.out.println();

        float totalMarks = (phy + chem + math) / 3;

        System.out.print("Grade: ");

        if (totalMarks > 90 && totalMarks <= 100) {
            System.out.println('A');
        } else if (totalMarks > 80 && totalMarks <= 90) {
            System.out.println('B');
        } else if (totalMarks > 70 && totalMarks <= 80) {
            System.out.println('C');
        } else if (totalMarks > 60 && totalMarks <= 70) {
            System.out.println('D');
        } else if (totalMarks > 50 && totalMarks <= 60) {
            System.out.println('E');
        } else {
            System.out.println("Fail");
        }

    }
}