package com.dsa.zoho;

public class ValidPalindrome {
    public static void main(String[] args) {


        String s = "ra1r";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length()-1;

       // for (int i = 0; i < s.length(); i++){
            while (left < right){
//                char l = s.charAt(left);
//                char r = s.charAt(right);


                if(!Character.isLetterOrDigit(s.charAt(left))){
                    left++;
                    continue;
                }
                if(!Character.isLetterOrDigit(s.charAt(right))){
                    right--;
                  continue;
            }
                if (Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                    return false;

                }
                left++;
                right--;
        }
            return true;
    }
}