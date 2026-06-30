package com.dsa.dailycode.day44_2026_06_27;

public class SwapString {
    public static void main(String[] args) {
        String s1 = "ratn";
        String s2 = "hello";

        s1 = s1+s2;

        s2 = s1.substring(0,s1.length()-s2.length());
        s1 = s1.substring(s2.length());
        System.out.println(s1 +" "+ s2);
    }
}
