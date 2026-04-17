package com.dsa.codingblocks.linkedlists;

  class Node {

    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}
public  class Main{
     static Node insertAtEnd(Node head,int data){
        Node newnode = new Node(data);

        if (head == null){
            return newnode;
        }
        Node temp = head;
        while (temp.next!= null){
            temp = temp.next;
        }
        temp.next = newnode;
        return head;
     }
     static void printList(Node head){
         Node temp = head;
         while (temp!= null){
             System.out.print(temp.data+"->");
             temp=temp.next;
         }
         System.out.println("null");
     }
    public static void main(String[] args) {

Node head = null;
        head = insertAtEnd(head,10);
        head = insertAtEnd(head,20);
        head = insertAtEnd(head,30);


       printList(head);
    }
}