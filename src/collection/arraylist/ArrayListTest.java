package collection.arraylist;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(9);
        // add element at index
        l1.add(2, 6);
        l1.add(0, 5);

//        add element to L2
        l2.add(11);
        l2.add(22);
        l2.add(33);
        l2.add(44);
        l2.add(55);

        // print array list
        System.out.print("Original ArrayList: ");
        System.out.println(l1);

        // get first and last index
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());

        // add l2 to l1
        l1.addAll(l2);
        System.out.println(l1);

        // is element present
        System.out.println(l1.contains(5));
        System.out.println(l1.contains(33));

        // to clear list
        l1.clear();
        System.out.println(l1);
    }
}