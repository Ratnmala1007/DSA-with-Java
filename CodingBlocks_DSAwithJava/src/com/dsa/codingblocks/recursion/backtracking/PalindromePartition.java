package com.dsa.codingblocks.recursion.backtracking;

import java.util.*;

public class PalindromePartition {

    static void solve(String s, int start, List<String> path) {

        // base case
        if (start == s.length()) {
            System.out.println(path);
            return;
        }

        for (int i = start; i < s.length(); i++) {

            String part = s.substring(start, i + 1);

            if (isPalindrome(part)) {

                // take
                path.add(part);

                // explore
                solve(s, i + 1, path);

                // backtrack
                path.remove(path.size() - 1);
            }
        }
    }

    static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "aab";
        List<String> path = new ArrayList<>();

        solve(s, 0, path);
    }
}