package com.dsa.javadeveloper.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String s = "listen";
        String t = "silentt";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
            // Write your logic here
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> map1 = new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }
        for (int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (int i =0;i<t.length();i++){
            char ch = t.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        if(map.equals(map1)){
            return true;
        }
return false;
    }
}
