package patterns;

//         *  *  *  *  *
//         *  *  *  *  *
//         *  *  *  *  *

public class Rectangle {
    public static void main(String[] args) {
        int l = 5;
        int b = 3;

        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= l; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}