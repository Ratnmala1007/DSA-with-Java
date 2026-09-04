package com.dsa.leetcode.slidingWindow;

public class MaximumNumberofVowelsinaSubstringofGivenLength_1456 {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }

    public static boolean isvowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'o' || c == 'u';
    }

    public static int maxVowels(String s, int k) {
        int left = 0;
        int maxvowels = 0;
        int vowels = 0;

        for (int right = 0; right < s.length(); right++) {
            if (isvowel(s.charAt(right))) {
                vowels++;
            }
            if (right - left + 1 > k) {


                if (isvowel(s.charAt(left))) {
                    vowels--;
                }
               left++;
            }

            if (right - left + 1 == k) {
                maxvowels = Math.max(maxvowels, vowels);

            }
        }
        return maxvowels;

    }
}

