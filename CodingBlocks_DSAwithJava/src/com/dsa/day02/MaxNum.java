package com.dsa.day02;

public class MaxNum {
    public static void main(String[] args) {


        //Scanner sc=new Scanner()

        int a = 10, b = 20, c = 30;

        int result = (a > b && a > c ? a : (b > a && b > c ? b : c));


        System.out.println(result);
    }
    }
