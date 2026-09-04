package com.dsa.dailycode.linkedlist;

public class Linkedlist {
    Node head;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;


    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertAtHead(50);
//        ll.insertAtHead(30);
//        ll.insertAtHead(20);
//        ll.insertAtHead(10);
//        ll.insertAtHead(00);
 Node first =new Node(20);
 Node second =new Node(30);

        Node third =new Node(40);
first.next=second;
second.next=third;
third .next=null;
        Node temp = ll.head;
        temp.next=first;
        while (temp != null) {
            System.out.print(temp.data + "->" + " ");
            temp = temp.next;
        }
    }
}
