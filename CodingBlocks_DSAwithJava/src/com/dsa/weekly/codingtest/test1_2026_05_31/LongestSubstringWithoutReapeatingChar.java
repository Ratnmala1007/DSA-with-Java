package com.dsa.weekly.codingtest.test1_2026_05_31;
//Input:
//        "abcabcbb"
//
//        Output:
//        3

import java.util.HashMap;

public class LongestSubstringWithoutReapeatingChar {
    public static void main(String[] args) {
        String s = "abcabcbb";
        longestSbstring(s);
    }

    public static void longestSbstring(String s) {
HashMap<Character,Integer> map = new HashMap<>();
int left = 0;
        int max = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
           if (map.containsKey(ch)) {
                left = Math.max(left,map.get(ch)+1);

            }
            map.put(ch,right);

            max = Math.max(max, right - left+1);
        }
        System.out.println(map);
        System.out.println(max);
    }
    }
