package com.dsa.tpoint.string;

public class CountWords {
    public static void main(String[] args) {


        String s = " I am a Java developer";
        //s = s.toLowerCase();

        String[]words = s.trim().split("\\s+");

        System.out.println(words.length);
    }
}