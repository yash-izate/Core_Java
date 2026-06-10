package ycce_crt;

class Node1 {
    int data;
    Node1 next;
    Node1 prev;
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        Node1 head = new Node1();
        head.data = 10;
        head.prev = null;
        head.next = null;

    }
}