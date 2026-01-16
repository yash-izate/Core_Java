package arrays;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 6, 3, 9, 8, 0, -5, 2, 14};

        System.out.println("\nWelcome To Array Maximum and Minimum Finder !\n");

        int max = Integer.MIN_VALUE;
        for (int ele : arr) {
            if (ele > max) {
                max = ele;
            }
        }
        System.out.println("Maximum element of array = " + max);

        int min = Integer.MAX_VALUE;
        for (int ele : arr) {
            if (ele < min) {
                min = ele;
            }
        }
        System.out.println("Minimum element of array = " + min);
    }
}