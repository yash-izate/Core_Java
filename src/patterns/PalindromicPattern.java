package patterns;

// ____1
// ___212
// __32123
// _4321234
// 543212345

public class PalindromicPattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            //for spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("_");
            }
            // print first half numbers
            for (int k = i; k > 0; k--) {
                System.out.print(k);
            }
            // print second half numbers
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}