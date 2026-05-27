package ycce_crt;

public class Arrays {
    public static void main(String[] args) {

        int[] arr = {1, 2, 60, 6, 3, 4, 5};

        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

        for (int ele : arr) {

            if (ele > max) {
                sMax = max;
                max = ele;
            } else if (ele > sMax && ele != max) {
                sMax = ele;
            }
        }

        System.out.println("Max number: " + max);
        System.out.println("Second Max number: " + sMax);
    }
}