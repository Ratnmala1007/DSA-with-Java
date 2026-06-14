package com.dsa.zoho;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
//String s = "abcadeefs";


      //  public static void LongestSubString (String s){
       String s = "abcadeefs";

            int left = 0;
            int max = 0;
            HashMap<Character, Integer> map = new HashMap<>();
            for (int right = 0; right < s.length(); right++) {
                char ch = s.charAt(right);
                while (map.containsKey(ch)) {
                    map.remove(s.charAt(left));
                    left++;
                }
                map.put(ch,0);
                max = Math.max(right-left+1, max);
            }
        System.out.println(max);
        System.out.println(map);
        }

    }
