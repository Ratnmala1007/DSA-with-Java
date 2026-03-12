package com.dsa.assignment.assignment_2;

import java.util.Scanner;

public class ArmstrongNum {

    static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    static int power(int base, int exp) {
        int res = 1;
        for (int i = 1; i <= exp; i++) {
            res *= base;
        }
        return res;
    }

    static boolean isArmstrong(int num) {
        int original = num;
        int digits = countDigits(num);
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += power(digit, digits);
            num /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        int num = 1634;//153;
        System.out.println(isArmstrong(num));

//        static boolean isArmstrong(int num) {
//            int original = num;
//            int sum = 0;
//
//            while (num != 0) {
//                int digit = num % 10;
//                sum += digit * digit * digit;
//                num = num / 10;
//            }
//
//            return sum == original;
//        }
//
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//
//            System.out.print("Enter a number: ");
//            int num = sc.nextInt();   // 👈 user input
//
//            System.out.println(isArmstrong(num));

    }

}


