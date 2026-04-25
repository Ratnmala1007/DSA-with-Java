package com.dsa.dailycode.day11_2026_04_22;

import java.util.HashMap;

public class LongestSubstringwithAtMost_K_DistinctChar {
        public static void main(String[] args) {

            String s = "aabacbebebe";
            int k = 3;

            HashMap<Character, Integer> map = new HashMap<>();

            int left = 0;
            int maxLen = 0;

            for (int right = 0; right < s.length(); right++) {

                char ch = s.charAt(right);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                while (map.size() > k) {

                    char leftChar = s.charAt(left);
                    map.put(leftChar, map.get(leftChar) - 1);

                    if (map.get(leftChar) == 0) {
                        map.remove(leftChar);
                    }

                    left++;
                }

                maxLen = Math.max(maxLen, right - left + 1);
            }

            System.out.println(maxLen);
        }
    }

