package com.dsa.dailycode.day1_2026_04_06;

public class L_07_ReverseInteger {

    public static void main(String[] args) {
        int x = -123;
       // L_07_ReverseInteger rev = new L_07_ReverseInteger ();
        int result = reverse(x);
        System.out.println(result);
    }        public static int reverse(int x) {
            int digit = 0;
            int rev = 0;
            while(x != 0) {
                digit = x % 10;
                if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                    return 0;

                }

                rev = rev * 10 + digit;
                x = x / 10;

            }
            return rev;
        }
    }

