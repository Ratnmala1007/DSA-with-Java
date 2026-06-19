package com.dsa.dailycode.day38_2026_06_17;

public class Permutation {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder("");
        permutation(s,"");
    }
    public static void permutation(String s,String path) {
        if (s.length() == 0) {
            System.out.println(path);
            return;
        }

        for (int i = 0;i< s.length();i++) {
            char ch = s.charAt(i);
            String remaining = s.substring(0, i) +
                    s.substring(i + 1);

        permutation(remaining, path + ch);

    }
    }

}
