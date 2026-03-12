package com.dsa.codingblocks.recursion.NumSystem;

public class ReverseNum {

    public static void main(String[] args) {
        int result = reverse(8907, 0);
        System.out.println(result);
    }

        public static int reverse ( int n, int rev){
            if (n == 0) return rev;

            int digit = n % 10;
            return reverse(n / 10, rev * 10 + digit);
        }
    }
