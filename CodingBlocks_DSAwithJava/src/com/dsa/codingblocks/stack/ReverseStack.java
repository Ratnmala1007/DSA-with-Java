package com.dsa.codingblocks.stack;

import java.util.Stack;

public class ReverseStack {
    static void insertAtBottomtack(Stack<Integer> stack, int element){
        //base case
        if(stack.isEmpty()){
            stack.push(element);
            return;
        }
        int x = stack.pop();
        insertAtBottomtack(stack,element);
        stack.push(x);
    }
    static void reverseStack(Stack<Integer>st){
        if(st.isEmpty()){
            return;
        }
        int x = st.pop();
        reverseStack(st);
        insertAtBottomtack(st, x);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        int element = 7;
        ReverseStack reverseStack = new ReverseStack();
        reverseStack.reverseStack(stack);

        System.out.println(stack);

    }

}
