package com.dsa.dailycode.linkedlist;

public class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Node1 {
    public static void main(String[] args) {
         Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);

       first.next = second;

        second.next = third;
        Node head = first;
        third.next = forth;
       // head  = forth ;
        Node temp = head;

        while (temp!=null) {
            System.out.print(temp.data+"->"+" ");
            temp = temp.next;
        }
        }
//        Node head = null;
//        Node newNode = new Node(10);
//
//        head = newNode;
//
//        head.data = 50;
//
//        System.out.println(newNode.data);
//    }
}