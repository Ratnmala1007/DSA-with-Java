package com.dsa.codingblocks.week6.day18;

public class Palindrome {
    public static void main(String[] args) {
      String str = "madam";
        System.out.println(isPalindrome(str));
        System.out.println("string length is" + " "+str.length());

    }

    static boolean isPalindrome(String str) {

        str = str.toLowerCase();

       // for (int i = 0; i <= str.length()-1 ; i++) {
//            char start = str.charAt(i);
//            char end = str.charAt(str.length() - 1-i );
           int start =0;
            int end=str.length()-1;
           while(start<end){
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;

    }
    }
