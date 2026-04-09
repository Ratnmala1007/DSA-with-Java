package com.dsa.assignment.assignment_6;

public class StrinOddEvenChar {
    public static void main(String[] args) {

    String s = "abcd";
    System.out.println(replaceChars(s));
}

    public static String replaceChars(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (i % 2 == 0) {
                // even index → next character
                ch = (char)(ch + 1);
            } else {
                // odd index → previous character
                ch = (char)(ch - 1);
            }

            result.append(ch);
        }

        return result.toString();

    }
}