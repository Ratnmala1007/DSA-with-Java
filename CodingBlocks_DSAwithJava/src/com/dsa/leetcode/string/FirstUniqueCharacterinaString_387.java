package com.dsa.leetcode.string;

import java.util.HashMap;

public class FirstUniqueCharacterinaString_387 {
    public static void main(String[] args) {
        String s =  "abcdac";
        System.out.println(uniqueChar(s));
    }
    public static char uniqueChar(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for(char c : ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c : ch){
            if(map.get(c)==1){
                return c;
            }
        }
  return '\0';
}
}