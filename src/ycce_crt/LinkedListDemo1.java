package ycce_crt;

class Node {
    int data;
    Node addr;
}

public class LinkedListDemo1 {

    static int count = 0;

    void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.addr;
            count++;
        }
    }

    Node insertFirst(Node head, Node yash) {
        yash.addr = head;
        head = yash;
        return head;
    }

    void insertLast(Node head, Node lastNode) {
        Node temp = head;
        while (temp.addr != null) {
            temp = temp.addr;
        }
        temp.addr = lastNode;
    }

    Node deleteFirst(Node head) {
        if (head == null) {
            System.out.println("Linked List is null!");
            return null;
        }
        System.out.println("Deleted node: " + head.data);
        head = head.addr;
        return head;
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

//        obj.traverse(first);
//        System.out.println("\nTotal nodes: " + count);

        Node yash = new Node();
        yash.data = 100;
        yash.addr = null;

        yash = obj.insertFirst(first, yash);
        obj.traverse(yash);

        System.out.println("\nTotal number of nodes: " + count);

        Node newL = new Node();
        newL.data = 111;
        newL.addr = null;

        obj.insertLast(first, newL);
        obj.traverse(yash);

        System.out.println();
        yash = obj.deleteFirst(yash);
        obj.traverse(yash);
    }
}