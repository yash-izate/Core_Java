package exception;

import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return super.toString() + "I am toString() method";
    }

    public String getMessage() {
        return super.getMessage() + "I am a getMessage() method";
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        a = sc.nextInt();

        if (a < 9) {
            try {
                throw new MyException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        }
    }
}