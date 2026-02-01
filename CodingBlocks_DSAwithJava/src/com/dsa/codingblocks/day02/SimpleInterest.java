package com.dsa.codingblocks.day02;

public class SimpleInterest {
    public static void main(String[] args) {


        double principle = 80000;
        double rate = 2;
        double time = 1;

        double si = principle * rate * time / 100;

        System.out.println("simple interest is :"+si);
    }
}