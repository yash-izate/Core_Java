package basic;

/**
 * A simple calculator class that performs basic arithmetic operations.
 *
 * @author Yash Izate
 * @version 1.0
 * @since 2026
 */
public class Calculator {

    /**
     * Adds two integers.
     *
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts one integer from another.
     *
     * @param a First number
     * @param b Second number
     * @return Difference of a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Main method to test the Calculator class.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum = " + calc.add(10, 5));
        System.out.println("Difference = " + calc.subtract(10, 5));
    }
}