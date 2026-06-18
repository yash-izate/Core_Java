package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo3 {
    public static void main(String[] args) {
        Queue<Character> que = new LinkedList<>();

        int[] freq = new int[256];
        String str = "aabbbcdmdcn";

        for (int i = 0; i < str.length(); i++) {
            que.offer(str.charAt(i));
            freq[str.charAt(i)]++;

        }

        System.out.println(que);

        while (!que.isEmpty()) {
            if (freq[que.peek()] == 1) {
                System.out.println("First non-repeating element: " + que.peek());
                return;
            }
            que.poll();
        }

    }
}