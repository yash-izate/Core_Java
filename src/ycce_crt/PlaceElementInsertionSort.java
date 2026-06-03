package ycce_crt;

public class PlaceElementInsertionSort {
    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 6, 2, 0};

        int target = 3;
        int n = arr.length - 1;

        System.out.print("Original Array: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        // Insertion Sort
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

        System.out.print("\nInsertion Sort: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        // insert target
        int i = n - 1;
        while (i >= 0 && target < arr[i]) {
            arr[i + 1] = arr[i];
            i--;
        }

        arr[i + 1] = target;

        System.out.print("\nFinal Array: ");

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}