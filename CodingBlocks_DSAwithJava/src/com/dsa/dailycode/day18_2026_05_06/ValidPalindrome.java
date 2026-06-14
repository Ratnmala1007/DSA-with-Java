package com.dsa.dailycode.day18_2026_05_06;

public class ValidPalindrome {
    public static void main(String[] args) {


        String s = "rar1";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {

        int right = s.length() - 1;
        int left = 0;
        // for (int i = 0; i < s.length(); i++){
        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);


            if (!Character.isLetterOrDigit(l)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(r)) {
                right--;
                continue;
            }

            if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                return false;

            }
            left++;
            right--;
        }
            return true;
        }

}