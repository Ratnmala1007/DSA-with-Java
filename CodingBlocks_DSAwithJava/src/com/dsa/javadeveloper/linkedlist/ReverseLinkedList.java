package com.dsa.javadeveloper.linkedlist;

public class ReverseLinkedList {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static Node reverseList(Node head){
        Node prev = null;
        Node current = head;
        while(current!=null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public static void printList(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.val + " ->");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[]args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.print("original linkedlist:");
        printList(head);

        head = reverseList(head);
        System.out.print("Reversed linkedlist:");
        printList(head);
    }
}
