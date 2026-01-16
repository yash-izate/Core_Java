package arrays;

public class Array2D {
    public static void main(String[] args) {

        int[][] arr = {{21, 89}, {22, 65}};
        System.out.println(arr[1][0]);

        int[][] numArr = new int[3][2];
        numArr[2][1] = 100;
        System.out.println(numArr[2][1]);
    }
}