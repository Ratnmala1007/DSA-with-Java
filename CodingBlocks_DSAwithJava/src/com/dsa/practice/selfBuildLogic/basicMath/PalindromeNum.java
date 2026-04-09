package com.dsa.practice.selfBuildLogic.basicMath;

public class PalindromeNum {
    public static void main(String[] args) {
        int num = 122;
       int result = 0;
       int original = num;
       int rev =0;
       while(num > 0){
           int digit = num % 10;
            rev = rev * 10 + digit;
            num/=10;

       }
       if(original == rev){
           System.out.println("Palindrome");
       }
       else{
           System.out.println("not palindrome");
       }

    }
}
