package com.dsa.dailycode.day40_2026_06_19;

public class CountWords {
    public static void main(String[] args) {


        String s = " I am a Java developer";
        //s = s.toLowerCase();

        String[]words = s.trim().split("\\s+");

        System.out.println(words.length);
    }
}