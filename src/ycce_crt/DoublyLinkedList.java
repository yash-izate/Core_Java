package ycce_crt;

class NodeD {
    int data;
    NodeD next;
    NodeD prev;
}

public class DoublyLinkedList {

    // Traverse in forward direction
    void traverse(NodeD head) {

        NodeD temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Traverse in backward direction
    void reverseTraverse(NodeD tail) {

        NodeD temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        NodeD first = new NodeD();
        first.data = 10;

        NodeD second = new NodeD();
        second.data = 20;

        NodeD third = new NodeD();
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