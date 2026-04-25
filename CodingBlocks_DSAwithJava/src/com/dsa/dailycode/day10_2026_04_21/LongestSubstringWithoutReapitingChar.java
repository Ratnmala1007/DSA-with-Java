package com.dsa.dailycode.day10_2026_04_21;

import java.util.HashMap;

public class LongestSubstringWithoutReapitingChar {
    public static void main(String[] args) {
        String s = "abcdcsdbu";
        HashMap<Character,Integer> map = new HashMap<>();

        int left = 0;
       int MaxLen = 0;


       for(int right =0; right < s.length(); right++){
           char ch = s.charAt(right);
if(map.containsKey(ch))   {
    left = Math.max(left,map.get(ch)+1);
}
map.put(ch , right);
MaxLen = Math.max(MaxLen,right-left+1);
        }
        System.out.println(MaxLen);
    }
}
