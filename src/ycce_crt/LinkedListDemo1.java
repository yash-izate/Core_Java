package ycce_crt;

class Node {
    int data;      // stores data
    Node addr;     // stores address of next node
}

public class LinkedListDemo1 {

    static int count = 0;

    // Display all nodes of the linked list
    void traverse(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.addr;
            count++;
        }
    }

    // Insert a node at the beginning
    Node insertFirst(Node head, Node yash) {

        // New node points to current head
        yash.addr = head;

        // New node becomes the head
        head = yash;

        return head;
    }

    // Insert a node at the end
    void insertLast(Node head, Node lastNode) {

        Node temp = head;

        // Move to the last node
        while (temp.addr != null) {
            temp = temp.addr;
        }

        // Connect last node to new node
        temp.addr = lastNode;
    }

    // Delete the first node
    Node deleteFirst(Node head) {

        if (head == null) {
            System.out.println("Linked List is null!");
            return null;
        }

        System.out.println("Deleted node: " + head.data);

        // Move head to second node
        head = head.addr;

        return head;
    }

    // Delete node at a given position
    Node deleteAtPosition(int pos, Node head) {

        if (head == null) {
            System.out.println("Linked List is empty!");
            return null;
        }

        // Special case: delete first node
        if (pos == 1) {
            System.out.println("Deleted node: " + head.data);
            return head.addr;
        }

        Node temp = head;

        // Move to node just before target position
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.addr;
        }

        // Position does not exist
        if (temp == null || temp.addr == null) {
            System.out.println("Invalid position!");
            return head;
        }

        System.out.println("Deleted node: " + temp.addr.data);

        // Skip the node to be deleted
        temp.addr = temp.addr.addr;

        return head;
    }

    // Reverse the linked list
    Node reverse(Node head) {

        Node prev = null;  // previous node
        Node curr = head;  // current node
        Node next;         // next node

        while (curr != null) {

            // Save next node before changing link
            next = curr.addr;

            // Reverse current node's link
            curr.addr = prev;

            // Move pointers one step ahead
            prev = curr;
            curr = next;
        }

        // prev becomes new head
        return prev;
    }

    public static void main(String[] args) {

        // Create nodes
        Node first = new Node();
        first.data = 10;

        Node second = new Node();
        second.data = 20;

        Node third = new Node();
        third.data = 30;

        Node fourth = new Node();
        fourth.data = 40;

        Node fifth = new Node();
        fifth.data = 50;

        // Connect nodes
        first.addr = second;
        second.addr = third;
        third.addr = fourth;
        fourth.addr = fifth;

        LinkedListDemo1 obj = new LinkedListDemo1();

        // Create new node for insertion at beginning
        Node yash = new Node();
        yash.data = 100;

        // Insert at first
        yash = obj.insertFirst(first, yash);

        System.out.println("After Insert First:");
        obj.traverse(yash);

        System.out.println("\nTotal number of nodes: " + count);

        // Create new node for insertion at end
        Node newL = new Node();
        newL.data = 111;

        // Insert at last
        obj.insertLast(first, newL);

        System.out.println("\nAfter Insert Last:");
        obj.traverse(yash);

        // Delete first node
        System.out.println("\n");
        yash = obj.deleteFirst(yash);

        System.out.println("After Delete First:");
        obj.traverse(yash);

        // Delete node at position 3
        System.out.println("\n");
        yash = obj.deleteAtPosition(3, yash);

        System.out.println("After Delete At Position 3:");
        obj.traverse(yash);

        // Reverse linked list
        System.out.println("\n\nReversed Linked List:");

        Node newHead = obj.reverse(yash);

        obj.traverse(newHead);
    }
}