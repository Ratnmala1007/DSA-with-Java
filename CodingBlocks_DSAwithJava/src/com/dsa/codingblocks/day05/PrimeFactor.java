package com.dsa.codingblocks.day05;

public class PrimeFactor {
    public static void main(String[] args) {

        int n = 24;
int i=2;
        // Print factor 2
        while (n % 2 == 0) {
            System.out.println(i);
            n /= i;
        }

        // Print odd prime factors
        for ( i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;   // ✅ FIXED
            }
        }

        // If remaining n is prime
        if (n > 1) {
            System.out.println(n);
        }

    }
}
