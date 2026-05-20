package com.dsa.dailycode.day24_2026_05_13;

public class StringAnagram {
    public static void main(String[] args) {
        String s1 = "silentt";
        String s2 = "listen";
        System.out.println(anagram(s1,s2));
    }
    public static boolean anagram(String s1,String s2){
            if(s1.length() != s2.length())
                return false;
        int[] freq = new int[26];

        for(int i = 0; i < s1.length();i++){

                    freq [s1.charAt(i)-'a']++;
                freq [s2.charAt(i)-'a']--;
            }

        for (int count : freq){
            if(count!=0)
                return false;

        }
        return true;

    }
}
