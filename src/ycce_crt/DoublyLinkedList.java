package ycce_crt;

class Node1 {
    int data;
    Node1 next;
    Node1 prev;
}

public class DoublyLinkedList {

    // Traverse in forward direction
    void traverse(Node1 head) {

        Node1 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Traverse in backward direction
    void reverseTraverse(Node1 tail) {

        Node1 temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node1 first = new Node1();
        first.data = 10;

        Node1 second = new Node1();
        second.data = 20;

        Node1 third = new Node1();
        third.data = 30;

        // Mapping nodes
        first.next = second;
        second.prev = first;
        second.next = third;
        third.prev = second;

        DoublyLinkedList obj = new DoublyLinkedList();

        System.out.println("Forward Traversal:");
        obj.traverse(first);

        System.out.println("\nBackward Traversal:");
        obj.reverseTraverse(third);
    }
}