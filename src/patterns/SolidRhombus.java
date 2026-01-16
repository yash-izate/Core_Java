package patterns;

//____*****
//___*****
//__*****
//_*****
//*****

public class SolidRhombus {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            //for spaces
            for (int j = n - i; j > 0; j--) {
                System.out.print("_");
            }
            //for stars
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}