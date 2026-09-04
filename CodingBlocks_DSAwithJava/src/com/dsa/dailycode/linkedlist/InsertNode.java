package com.dsa.dailycode.linkedlist;

public class InsertNode {
    Node head;

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node (20);
        head.next.next = new Node(30);
        Node newNode = new Node(5);//add at head
        Node newNode1= new Node(25);//add at between 20 and 30


        newNode.next=head;
        head= newNode;
        Node temp = newNode;

        while (temp.data!=20){
            temp=temp.next;
        }
        newNode1.next=temp.next;
        temp.next = newNode1;
         //Node temp = head;

        temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->"+" ");
            temp=temp.next;
        }
    }
}
