package com.dsa.day02;

import org.w3c.dom.ls.LSOutput;

public class SimpleInterest {
    public static void main(String[] args) {


        double principle = 80000;
        double rate = 2;
        double time = 1;

        double si = principle * rate * time / 100;

        System.out.println("simple interest is :"+si);
    }
}