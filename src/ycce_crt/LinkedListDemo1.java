package ycce_crt;

class Node {
    int data;
    Node addr;
}

public class LinkedListDemo1 {

    void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.addr;
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

        Node four = new Node();
        four.data = 40;
        four.addr = null;

        Node five = new Node();
        five.data = 50;
        five.addr = null;

        first.addr = second;
        second.addr = third;
        third.addr = four;
        four.addr = five;

        LinkedListDemo1 obj = new LinkedListDemo1();
        obj.traverse(first);
    }
}