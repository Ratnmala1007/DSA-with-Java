package com.dsa.codingblocks.week6.day18;

public class AtoiLeetcode_8 {
    public static void main(String[] args) {
        String s= " -042";
        System.out.println(myAtoi(s));
    }
        static int myAtoi(String s) {

            int i = 0;
            int n = s.length();
            int sign = 1;
            long result = 0;   // use long to safely detect overflow

            // 1️⃣ Skip leading spaces
            while (i < n && s.charAt(i) == ' ') {
                i++;
            }

            // 2️⃣ Check sign
            if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                if (s.charAt(i) == '-') {
                    sign = -1;
                }
                i++;
            }

            // 3️⃣ Read digits
            while (i < n && Character.isDigit(s.charAt(i))) {

                int digit = s.charAt(i) - '0';
                result = result * 10 + digit;

                // 4️⃣ Check overflow
                if (sign * result > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }

                if (sign * result < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }

                i++;
            }

            return (int)(sign * result);
        }
    }

