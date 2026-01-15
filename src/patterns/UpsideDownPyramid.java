package patterns;

//____*
//___* *
//__* * *
//_* * * *
//* * * * *
//_* * * *
//__* * *
//___* *
//____*

public class UpsideDownPyramid {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("_");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("_");
            }
            for (int k = n - i; k > 0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}