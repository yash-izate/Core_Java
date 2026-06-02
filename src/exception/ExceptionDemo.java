package exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to Exception Handling!");

//        Arithimatic Exception
        int a = 5000;
        int b = 0;

        try {
            int c = a / b;
            System.out.println("The result is " + c);
        } catch (ArithmeticException e) {
            System.out.println("Divide by 0 not allowed");
//            or we can write instead of sout(e)

            System.out.println(e);
//            e.printStackTrace();
        }

        System.out.println("End of the program");

    }
}