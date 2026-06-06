package ycce_crt;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(97);
        marks.add(86);
        marks.add(91);
        marks.add(99);
        marks.add(85);

        System.out.println(marks);

        int sum = 0;
        for (int ele : marks) {
            sum += ele;
        }
        double avg = (double) sum / marks.size();

        System.out.println("Total marks = " + sum);
        System.out.printf("Average marks = %.2f", avg);

        System.out.println();
        Collections.sort(marks);
        System.out.println(marks);
        System.out.println(marks.get(marks.size() - 2));

    }
}