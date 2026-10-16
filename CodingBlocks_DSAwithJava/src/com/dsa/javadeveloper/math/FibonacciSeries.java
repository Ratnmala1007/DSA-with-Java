package com.dsa.javadeveloper.math;

public class FibonacciSeries {
    public static void main(String[] args) {

// 0 1 1 2 3 5 8 13 21 34 55
        int n = 10;
        int a = 0,b = 1 ;
        System.out.print(a+ " "+ b+" ");
        for(int i = 2;i <= n; i++){

        int sum = a + b; // 0+1  1+1
            System.out.print(sum+" ");

      a = b;     // 1  1  2  3
      b = sum ;  // 1   2  3  5
        }
      //  System.out.println(b+" ");
    }
}