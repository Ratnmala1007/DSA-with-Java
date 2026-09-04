package com.dsa.dailycode.linkedlist;

public class AllLinkedlistOperation {
    public static void main(String[] args) {
        AllLinkedlistOperation ls = new AllLinkedlistOperation();
       Node head = new Node(10);
        Node f1=new Node(20);
        Node f2 =new Node(30);
        //connect existing node
head.next = f1;
f1.next=f2;
//Add 5 at front
Node newnode = new Node(5);
newnode.next=head;
head=newnode;

//tail points to f2
Node tail = f2;
//add 40 as a tail
        Node newtail = new Node(40);
        tail.next=newtail;
        tail = newtail;

        //print
        Node temp =head;
          while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
}