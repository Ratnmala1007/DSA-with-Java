package com.dsa.dailycode.day24_2026_05_13;

public class Subsequences {
    public static void main(String[] args) {
        String s = "abc";
        int n = s.length();
        print(s, 0, n, "");
    }

    private static void print(String s, int i, int n, String output) {
        if (i == n) {
            System.out.println(output.toString());
            return;
        }
        //take
        print(s, i + 1, n, output+s.charAt(i));
        print(s,i+1,n,output);


    }
}