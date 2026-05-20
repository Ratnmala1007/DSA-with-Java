package com.dsa.dailycode.day24_2026_05_13;

public class ReverseWordInString {
    public static void main(String[] args) {
        String s = "Hello coder";
        System.out.println(reverse(s));
    }
    public static String reverse(String s){
        String[] word = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = word.length-1;i >= 0;i--){
            sb.append(word[i]);

            if (i != 0) {
                sb.append(" ");
            }
        }


return sb.toString();
    }
}
