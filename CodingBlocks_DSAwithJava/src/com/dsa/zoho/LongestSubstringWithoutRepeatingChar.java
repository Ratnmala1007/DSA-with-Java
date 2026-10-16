package com.dsa.zoho;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(LongestSubString(s));
    }

        public static int LongestSubString (String s){
       // s = "abcadeefs";

            int left = 0;
            int max = 0;
            HashMap<Character, Integer> map = new HashMap<>();//a -2 b -1 c-1 d-1 e-2 f-1 s-1
                                                              // abc bcade cade ade de efe
            for (int right = 0; right < s.length(); right++) {
                char ch = s.charAt(right);
                while (map.containsKey(ch)) {
                    map.remove(s.charAt(left));
                    left++;
                }
                map.put(ch,0);
                max = Math.max(right-left+1, max);
            }
            System.out.println(map);

            return max;
        }

    }
