package oops.practice;

public class ArrayOperations {
    private int[] numbers;

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    public class Statistics {
        double mean() {
            double sum = 0;
            for (int ele : numbers) {
                sum += ele;
            }
            return sum / numbers.length;
        }

        double median() {
            return 0;
        }

    }
}