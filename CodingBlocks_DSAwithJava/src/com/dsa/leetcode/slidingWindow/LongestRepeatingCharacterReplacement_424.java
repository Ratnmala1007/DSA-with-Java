package com.dsa.leetcode.slidingWindow;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement_424 {
    public static void main(String[] args) {
       //String s = "ABABAB"; int k =2;
       String s = "AABABBA"; int k = 1;
        System.out.println( characterReplacement(s,k) );
    }

        public static int characterReplacement(String s, int k) {
            HashMap<Character,Integer> map = new HashMap<>();
            int left = 0;
            int maxFreq = 0;
            int result =0;
            for(int right =0; right < s.length(); right++){
                char c = s.charAt(right);

                map.put(c,map.getOrDefault(c,0)+1);

                maxFreq = Math.max(maxFreq,map.get(c));  //ABABAB A=2 B=3
             int windowSize = right - left + 1;  //6

             if(windowSize - maxFreq > k){
                 char leftchar = s.charAt(left); //A
                 map.put(leftchar,map.get(leftchar)-1);//A,2-1=1
                 left++;                              //1
             }
                result = Math.max(result,right-left+1);
            }
            return result;
        }
    }

