package oops.practice;

public class TestArrayOperations {
    public static void main(String[] args) {

        ArrayOperations arrOpr = new ArrayOperations(new int[]{1, 3, 5, 7, 9});
        ArrayOperations.Statistics arrStat = arrOpr.new Statistics();

        System.out.println(arrStat.mean());

    }
}