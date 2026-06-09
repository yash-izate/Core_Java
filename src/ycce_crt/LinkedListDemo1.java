package ycce_crt;

class Node {
    int data;
    Node addr;
}

public class LinkedListDemo2 {

    static int count = 0;

    void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.addr;
            count++;
        }

    }

    public static void main(String[] args) {
        Node first = new Node();
        first.data = 10;
        first.addr = null;

        Node second = new Node();
        second.data = 20;
        second.addr = null;

        Node third = new Node();
        third.data = 30;
        third.addr = null;

        Node fourth = new Node();
        fourth.data = 40;
        fourth.addr = null;

        Node fifth = new Node();
        fifth.data = 50;
        fifth.addr = null;

        first.addr = second;
        second.addr = third;
        third.addr = fourth;
        fourth.addr = fifth;

        LinkedListDemo1 obj = new LinkedListDemo1();
        obj.traverse(first);

        System.out.println("\nTotal nodes: " + count);
    }
}