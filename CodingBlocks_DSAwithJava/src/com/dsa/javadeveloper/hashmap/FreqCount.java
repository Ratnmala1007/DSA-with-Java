package com.dsa.javadeveloper.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FreqCount {
    public static void main(String[] args) {
        String s = "Java";
        System.out.println(charFrequency(s));
    }

        public  static Map<Character, Integer> charFrequency(String s) {
            Map<Character, Integer> freq = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
   freq.put(ch,freq.getOrDefault(ch,0)+1);

                // Update the frequency of ch here


            }

            return freq;
        }
    }


