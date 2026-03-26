package com.dsa.codingblocks.stack;

import java.util.Stack;

public class AddElementToLast {
    static void addElementToLast(Stack<Integer> stack,int element){
        //base case
        if(stack.isEmpty()){
            stack.push(element);
            return;
        }
        int x = stack.pop();
        addElementToLast(stack,element);
        stack.push(x);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        addElementToLast(stack,7);

        System.out.println(stack);

    }
}
