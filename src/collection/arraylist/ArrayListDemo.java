package collection.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(10);
        arr.add(750);
        arr.add(-7);
        arr.add(23);
        arr.add(57);
        System.out.println(arr);
        System.out.println(arr.indexOf(750));
        System.out.println(arr.get(3));
        System.out.println(arr.contains(10));
        System.out.println(arr.remove(3));
        arr.clear();
        System.out.println(arr);
    }
}