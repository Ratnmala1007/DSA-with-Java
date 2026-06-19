package com.dsa.dailycode.day37_2026_06_15;

public class StackImplementation {
    int[] arr;
    int top;

    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation(5);
         stack.push(10);
        stack.push(100);
        stack.push(1000);

        System.out.println("Top element:"+stack.peek());
        System.out.println("popped:"+stack.pop());
        System.out.println("Top element:"+stack.peek());
        System.out.println("Size: " + stack.size());

        System.out.println("Is Empty: " + stack.isEmpty());
    }
    StackImplementation(int size) {
        arr = new int[size];
        top = -1;
    }
    public void  push(int data){
        arr[++top] = data;
    }
    public int pop() {
        return arr[top--];
    }
    public int peek(){
        return arr[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public int size() {
        return top + 1;
    }

}