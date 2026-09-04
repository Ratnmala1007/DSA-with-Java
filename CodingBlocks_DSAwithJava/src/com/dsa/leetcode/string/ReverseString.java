package com.dsa.leetcode.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s ={'r','a','t','n'};

       reverse(s);
        }
        public static void reverse(char[]s){
        int left =0;
        int right =s.length-1;
        while (left < right){
            char temp=s[left];
           s[left] =s[right] ;
           s[right] = temp;
           right--;
           left++;
        }
            System.out.println(Arrays.toString(s));
    }
    }

