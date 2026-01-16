package patterns;

//____1
//___2 2
//__3 3 3
//_4 4 4 4
//5 5 5 5 5

public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            //for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("_");
            }
            //for number
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}