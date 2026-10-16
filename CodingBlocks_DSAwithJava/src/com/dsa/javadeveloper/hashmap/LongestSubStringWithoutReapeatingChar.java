package com.dsa.javadeveloper.hashmap;

import java.util.HashMap;

public class LongestSubStringWithoutReapeatingChar {
    public static void main(String[] args) {
String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        // Write your logic here
        HashMap<Character,Integer> map = new HashMap<>();
        int max =0;
        int left =0;
        for(int right =0;right< s.length();right++){
            char ch = s.charAt(right);
            if(map.containsKey(ch)&& map.get(ch)>=left){  //abcabcbb
                left = map.get(ch)+1;
            }
            map.put(ch,right);
            max = Math.max(max,right-left+1);

        }
        System.out.println(map);
        return max;

    }
}
