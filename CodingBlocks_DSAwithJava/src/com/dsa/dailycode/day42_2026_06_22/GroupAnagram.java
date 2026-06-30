package com.dsa.dailycode.day42_2026_06_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static void main(String[] args) {
String[] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<String> list = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
     for(String str : strs){
char[] ch = str.toCharArray();
         Arrays.sort(ch);

         String key = new String(ch);

         map.putIfAbsent(key, new ArrayList<>());

         map.get(key).add(str);
     }

        return new ArrayList<>(map.values());
    }


}