package com.dsa.javadeveloper.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DuplicateLetter {
    public static void main(String[] args) {

    }
        public   List<String> commonChars(String[] words) {
            HashMap<Character,Integer> map = new HashMap<>();
            List<String>ls = new ArrayList<>();
            for(int i =0;i<words.length;i++)
            {

                if(map.containsKey(words[i])){

                }
               // map.put(char,0);
            }
            return ls;
        }
    }



//        Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
//
//        Given a balanced string s, split it into some number of substrings such that:
//
//        Each substring is balanced.
//        Return the maximum number of balanced strings you can obtain.
//
//
//
//        Example 1:
//
//        Input: s = "RLRRLLRLRL"
//        Output: 4

//2
//Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.

//Example 1:
//
//Input: words = ["bella","label","roller"]
//Output: ["e","l","l"]
//Example 2:
//
//Input: words = ["cool","lock","cook"]
//Output: ["c","o"]
//
//
//Constraints: