package com.dsa.javadeveloper.linkedlist;

import static com.dsa.javadeveloper.linkedlist.MiddleoftheLinkedList_876.Node.middlelist;
import static com.dsa.javadeveloper.linkedlist.MiddleoftheLinkedList_876.Node.printist;

public class MiddleoftheLinkedList_876 {
    static class Node {
        Node next;
        int value;

        Node(int value) {
            //this.next = null;
            this.value = value;

        }

        public static Node middlelist(Node head) {
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;

        }

        public static void printist(Node head) {
            Node current = head;
            while (current != null) {
                System.out.print(current.value + " ->");
                current = current.next;
            }
            System.out.println("null");
        }
    }

        public static void main(String[] args) {
Node head = new Node(1);
head.next = new Node(2);
head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);
            System.out.println("Linked List:");
            printist(head);

            Node middle = middlelist(head);

            System.out.println("Middle Node: " + middle.value);
        }

}
