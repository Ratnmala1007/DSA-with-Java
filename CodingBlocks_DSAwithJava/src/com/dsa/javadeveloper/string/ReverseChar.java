package com.dsa.javadeveloper.string;

import java.util.Arrays;

public class ReverseChar {
    public static void main(String[] args) {
        char[]s={'H','e','l','l','o'};
     reverseString(s);
    }

        public static void reverseString(char[] s) {
           int left =0;
           int right = s.length-1;

           while(left < right){
               char temp = s[left];
               s[left] = s[right];
               s[right] = temp;
               left++;
               right--;

           }
            System.out.println(Arrays.toString(s));
        }
    }

