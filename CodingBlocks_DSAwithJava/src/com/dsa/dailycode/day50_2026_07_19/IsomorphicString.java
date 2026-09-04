package com.dsa.dailycode.day50_2026_07_19;

import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        String s = "ege";
        String t = "eed";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {


       HashMap <Character, Character> map = new HashMap<>();
//            HashMap<Character, Character> map2 = new HashMap<>();
//
            for(int i =0;i< s.length();i++) {

                char ch1 = s.charAt(i);
                char ch2 = t.charAt(i);
//
//                if (map1.containsKey(ch1)) {
//
//                    if (map1.get(ch1) != ch2) {
//                        return false;
//                    }
//                }
//
//                else {
//                    map1.put(ch1, ch2);
//                }
//
//                if (map2.containsKey(ch2)) {
//
//                    if (map2.get(ch2) != ch1) {
//                        return false;
//                    }
//                }
//
//                else {
//                    map2.put(ch2, ch1);
//                }
//
//
//            }
                if (map.containsKey(ch1)) {
                    if (map.get(ch1) != ch2) {
                        return false;
                    }
                } else {
                    if (map.containsValue(ch2)) {
                        return false;
                    }
                    map.put(ch1, ch2);
                }
            }
            return true;
        }
    }
