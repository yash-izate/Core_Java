package exception;

class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}

public class ExceptionThrowsThrow {
    public static int divide(int radius) throws ArithmeticException, NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException();
        }
        int result = (int) (Math.PI * Math.pow(radius, 2));
        return result;
    }

    public static void main(String[] args) {

        try {
            int c = divide(-5);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}