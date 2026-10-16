package com.dsa.javadeveloper.string;

public class Palindrome {
    public static void main(String[] args) {
       String s= "madame";
        System.out.println(isPalindrome(s));
    }
        public static boolean isPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;

            while (left < right) {

                    // What should you compare here?
                    if (s.charAt(left) != s.charAt(right)) {
                        return false;
                    }
                    // What should you return if they differ?

                    left++;
                    right--;
                }

            return true;
        }
    }

