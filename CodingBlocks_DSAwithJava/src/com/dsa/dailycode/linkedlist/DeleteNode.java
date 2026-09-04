package com.dsa.dailycode.linkedlist;

public class DeleteNode {
    public static void main(String[] args) {


        Node head = new Node(10);
        head.next= new Node(20);
        head.next.next = new Node(30);
Node first = new Node(5);
first.next=head;
        Node temp = first;
        first = temp;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next ;
        }
    }
}
