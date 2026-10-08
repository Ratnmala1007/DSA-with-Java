package com.dsa.leetcode.string;

import java.util.HashMap;
import java.util.HashSet;

public class RansomNote_383 {
    public static void main(String[] args) {
       String ransomNote = "aa";
       String magazine = "aab";
        System.out.println(canConstruct(ransomNote,magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();

        for (char c:magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);  // aab  a = 2 b=1
        }

            for (char c:ransomNote.toCharArray())
                {
                    if (!map.containsKey(c) || map.get(c) == 0) { // aa
                        return false;
                    }
                    map.put(c, map.get(c) - 1);          //a 2-1=1 a 1-1=0

                }


    return true;
}
}