package com.dsa.codingblocks.recursion.NumSystem;

public class Factorial {

        public static int factorial(int n){

            System.out.println("Entering factorial(" + n + ")");

            if(n == 0){
                System.out.println("Base case reached: factorial(0) = 1");
                return 1;
            }

            int result = n * factorial(n - 1);

            System.out.println("Returning from factorial(" + n + ") = " + result);

            return result;
        }

        public static void main(String[] args) {
            int n = 4;
            System.out.println("Final Answer = " + factorial(n));
        }
    }

