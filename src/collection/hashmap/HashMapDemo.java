package collection.hashmap;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 2);
        map.put(2, 4);
        map.put(4, 3);
        map.put(3, 5);


        System.out.println(map);
        System.out.println(map.get(4));
        System.out.println(map.remove(2));
        System.out.println(map);
        System.out.println(map.containsKey(3));

    }
}