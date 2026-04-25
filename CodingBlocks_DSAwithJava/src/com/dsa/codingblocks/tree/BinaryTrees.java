package com.dsa.codingblocks.tree;

import java.util.Scanner;

 class BinaryTree {
     private Node root;
     Scanner sc = new Scanner(System.in);


     public Node creatTree() {
         System.out.println("Enter data: ");
         int data = sc.nextInt();
         Node root = new Node(data);

         System.out.println("has Left Child : ");

         boolean hasLeftChild = sc.nextBoolean();
         if (hasLeftChild) {
             Node leftChild = creatTree();

             root.left = leftChild;
         }
         System.out.println("has right Child : ");

         boolean hasRightChild = sc.nextBoolean();
         if (hasRightChild) {
             Node rightChild = creatTree();

             root.right = rightChild;
         }
         return root;
     }

     public void preOrder(Node root) {
         if (root == null)
             return;
         System.out.println(root.data + ", ");
         preOrder(root.left);
         preOrder(root.right);
     }

     public void inOrder(Node root) {
         if (root == null)
             return;
         inOrder(root.left);

         System.out.println(root.data + ", ");
         inOrder(root.right);
     }

     public int findMax(Node root) {
         if (root == null)
             return Integer.MIN_VALUE;
         int lmax = findMax(root.left);
         int rmax = findMax(root.right);
         int maxi = Math.max(root.data, Math.max(lmax, rmax));
         return maxi;
     }
 }
public class BinaryTrees{
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.creatTree();

        binaryTree.preOrder(root);
        System.out.println();
        binaryTree.inOrder(root);
    }
}
