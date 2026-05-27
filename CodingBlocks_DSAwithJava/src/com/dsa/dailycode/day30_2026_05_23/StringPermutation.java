package com.dsa.dailycode.day30_2026_05_23;

public class StringPermutation {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder("");
        permutation(s, "");
    }

    public static void permutation(String s, String output) {
        //n = output.length();
        if (s.length() == 0) {
            System.out.println(output);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String remaining = s.substring(0, i) +
                    s.substring(i + 1);

            permutation(remaining, output + ch);

        }
    }
}