package com.dsa.codingblocks.linkedlists;

import java.util.LinkedList;

public class LinkedListClient {
    public static void main(String[] args) {
        LinkedList1 linkedlist = new LinkedList1();
        linkedlist.addAtFront(10);
        linkedlist.addAtFront(20);
        linkedlist.addAtFront(30);


        linkedlist.laddAtLast(15);
        linkedlist.laddAtLast(15);
        linkedlist.laddAtLast(15);

        linkedlist.addAtIndex(1,100);
        linkedlist.addAtIndex(6,200);

        linkedlist.print();
    }
}
