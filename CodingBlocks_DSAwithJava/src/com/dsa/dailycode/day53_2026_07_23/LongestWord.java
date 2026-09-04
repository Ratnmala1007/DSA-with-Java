package com.dsa.dailycode.day53_2026_07_23;

public class LongestWord {
    public static void main(String[] args) {
        String s = "I am a software developer";
        System.out.println(longestWord(s));
    }
    public static String longestWord(String s){

        String longest = " ";

String[] words = s.split(" ");
        for(int i =0; i< words.length;i++) {


                if (words[i].length() > longest.length()) {
                    longest = words[i];


            }

        }
          return longest;
    }
}
