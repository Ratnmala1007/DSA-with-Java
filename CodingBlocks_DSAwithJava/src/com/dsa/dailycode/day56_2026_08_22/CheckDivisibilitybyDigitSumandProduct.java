package com.dsa.dailycode.day56_2026_08_22;

public class CheckDivisibilitybyDigitSumandProduct {
    public static void main(String[] args) {
        int n = 29;
        System.out.println( checkDivisibility(n));
    }

    public static boolean checkDivisibility(int n) {
        int digit = 0;
        int sum = 0;
        int product = 1;
        int temp = n;
        while (temp > 0) {
            digit = temp % 10;
            sum += digit;
           product *= digit;
            temp = temp/ 10;
        }
        System.out.println(sum+product);
        return n%(sum+product)==0;
        ///return sum+product==n;
    }
}