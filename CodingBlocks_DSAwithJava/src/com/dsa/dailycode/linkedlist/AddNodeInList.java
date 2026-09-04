package com.dsa.dailycode.linkedlist;

public class AddNodeInList {
    Node head = null;
    Node tail = null;
    int size = 0;

    public static void main(String[] args) {
        AddNodeInList node = new AddNodeInList();
        node.addFront(10);
        node.addFront(20);
        node.addFront(30);
node.addLast(40);
        node.print();
    }
    public void addFront(int data){
        Node newnode = new Node(data);
        if(size == 0){
            head = newnode;
            tail = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
        size++;
    }
    public void addLast(int data){
        Node newnode = new Node(data);
        if(size == 0){
            head = newnode;
            tail = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
        size++;
    }

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->"+" ");
            temp=temp.next;
        }
    }
}