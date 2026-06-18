package collection.set;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(20);
        set.add(30);
        set.add(10);

        System.out.println(set);
        System.out.println("Unique Element: " + set.size());
    }
}