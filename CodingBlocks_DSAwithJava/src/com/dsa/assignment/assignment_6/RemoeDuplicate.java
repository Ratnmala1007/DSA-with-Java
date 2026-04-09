package com.dsa.assignment.assignment_6;

public class RemoeDuplicate {
    public static void main(String[] args) {
        String s = " aabbcdd";
        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();

        result.append(s.charAt(0)); // first character always included

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }

}


