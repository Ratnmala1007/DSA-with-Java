package com.dsa.codingblocks.recursion.NumSystem;

public class FibonacciSeries {
  //  public static void main(String[] args) {


//        int a=0,b=1;int c;
//        for(int i=2;i<=6;i++) {
//             c = a + b;
//            //System.out.print(c + " ");
//            a=b;
//            b=c;
//
//        }
//        System.out.print(b + " ");

        static int fib(int n) {
            if (n <= 1)
                return n;

            return fib(n - 1) + fib(n - 2);
        }

       public static void main(String[] args) {
            int n = 6;
            System.out.println(fib(n));
        }
    }


