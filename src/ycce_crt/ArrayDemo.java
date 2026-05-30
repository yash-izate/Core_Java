package ycce_crt;

public class ArrayDemo {

    public static void dsa1(int[] arr) {
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[idx] = arr[i];
                idx++;
            }
        }

        while (idx < arr.length) {
            arr[idx] = 0;
            idx++;
        }

        System.out.print("Array: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    public static void dsa2(int[] arr) {

        int id = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
                    System.out.println(arr[i] + " -> " + arr[j]);
                    found = true;
                    break;
                }

            }

            if (!found) {
                System.out.println(arr[i] + " -> " + "-1");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 0, 1, 0, 0, 8, 4};
//        dsa1(arr1);

        int[] arr2 = {2, 1, 6, 5};
        dsa2(arr2);

    }
}