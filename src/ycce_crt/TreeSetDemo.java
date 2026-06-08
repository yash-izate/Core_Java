package ycce_crt;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(20);
        set.add(40);
        set.add(10);
        set.add(30);
        set.add(50);

        System.out.println(set);
        System.out.println("Second Largest: " + set.lower(set.last()));

    }
}