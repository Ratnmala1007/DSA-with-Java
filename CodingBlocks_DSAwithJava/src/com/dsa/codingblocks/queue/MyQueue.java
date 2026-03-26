package com.dsa.codingblocks.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<Integer>queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);


        System.out.println(queue); // [10, 20, 30]

        queue.remove(); // removes 10

        System.out.println(queue.peek());// 20
    }
}
