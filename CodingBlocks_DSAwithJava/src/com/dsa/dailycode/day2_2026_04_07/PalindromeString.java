package com.dsa.dailycode.day2_2026_04_07;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "Abcba";
//        String result = isPalindrome(s);
       System.out.println(isPalindrome(s));
    }
        private static boolean isPalindrome (String s){
        s = s.toLowerCase();
            int left = 0;
            int right = s.length()-1;
            while (left < right) {
                if (s.charAt(left) !=s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
