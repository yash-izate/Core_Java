package collection.arraylist;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(25);
        l1.add(33);
        l1.add(90);

        // add element at index
        l1.add(2, 67);
        l1.add(0, 55);

        // print array list
        System.out.print("Original ArrayList: ");
        System.out.println(l1);

        // get first and last index
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
    }
}