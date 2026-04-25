package com.dsa.practice.leetcode;
//23-Apr-2026
public class L_9_ReverseNum {
    public static void main(String[] args) {
        //int x =122;
        L_9_ReverseNum num = new L_9_ReverseNum();
        boolean val = num.isPalindrome(121);
        System.out.println(val);
    }
          public boolean isPalindrome(int x) {
            if(x<0){
                return false;
            }
            int digit = 0;
            int rev = 0;
            int temp = x;
            while(x > 0){
                digit = x % 10;
                rev = rev * 10 + digit;
                x= x/10;
            }
            if(rev == temp){
                return true;
            }
            else{
                return false;
            }
        }
    }


