package com.dsa.assignment.assignment_6;

public class StringsMaxFrequencyCharacter {
    public static void main(String[] args) {
        String s = "aaabacB";
          // s=s.toLowerCase();
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
           // freq[s.charAt(i) - 'a']++;
            freq[s.charAt(i) ]++;

        }

        //find max freq char
        int max = 0;
        char result = ' ';
        for (int i = 0; i < 256; i++) {
            if (freq[i] > max ) {
                max = freq[i];
                result = (char)(i);
            }
        }
        System.out.println(result);
    }
}
