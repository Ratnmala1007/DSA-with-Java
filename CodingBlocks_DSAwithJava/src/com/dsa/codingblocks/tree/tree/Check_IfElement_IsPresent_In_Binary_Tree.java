package com.dsa.codingblocks.tree.tree;

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

public class Check_IfElement_IsPresent_In_Binary_Tree {

        // Method to check if element exists (Recursive)
        public static boolean isPresent(Node root, int target) {
            // Base case
            if (root == null) {
                return false;
            }

            // Check current node
            if (root.data == target) {
                return true;
            }

            // Check left and right subtree
            return isPresent(root.left, target) || isPresent(root.right, target);
        }

        public static void main(String[] args) {

        /*
                10
               /  \
              20   30
             / \
            40  50
        */

            Node root = new Node(10);
            root.left = new Node(20);
            root.right = new Node(30);
            root.left.left = new Node(40);
            root.left.right = new Node(50);
            root.left.left.right = new Node(45);

            int target = 50;

            boolean result = isPresent(root, target);

            if (result) {
                System.out.println("Element is present in tree");
            } else {
                System.out.println("Element is NOT present in tree");
            }
        }
    }

