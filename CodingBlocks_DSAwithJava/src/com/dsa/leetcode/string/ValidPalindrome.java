package com.dsa.leetcode.string;

public class ValidPalindrome {
    public static void main(String[] args) {
        //String s = "A man, a plan, a canal: Panama";
        String s="racerecar09";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s =s.toLowerCase();
        int left =0;
        int right = s.length()-1;

        while(left < right){
            if(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(s.charAt(left)!= s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}