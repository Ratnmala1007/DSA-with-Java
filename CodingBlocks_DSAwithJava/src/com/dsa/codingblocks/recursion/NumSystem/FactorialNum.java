package com.dsa.codingblocks.recursion.NumSystem;

public class FactorialNum {
    public static int factorial(int n){
        if(n==0){
            return 1;}
       // int smallerAns = factorial(n-1);

        //int largeAns = n* smallerAns;

        //return largeAns;
       return  n*factorial(n-1);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.print(factorial(n));
    }
}
