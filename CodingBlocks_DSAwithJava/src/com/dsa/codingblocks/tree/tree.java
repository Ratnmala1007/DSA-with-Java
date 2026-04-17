package com.dsa.codingblocks.tree;



class Node{
    public int data;
public Node left;
public Node right;
    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

}
public class tree {
    public static void main(String[] args) {
        Node root = new Node(10);
        Node leftChild = new Node(20);
        Node rightChild = new Node(30);


        root.left = leftChild;
        root.right = rightChild;
        System.out.println("root"+ root.data);
        System.out.println("left"+ root.left.data);
        System.out.println("right"+ root.right.data);
        System.out.println(root.left.left);
        System.out.println(root.right);

    }
}