package ycce_crt;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(89);
        set.add(30);
        set.add(10);
        set.add(40);
        set.add(90);

        System.out.println(set);
        System.out.println("Unique Element: " + set.size());
    }
}