package com.dsa.dailycode.day59_2026_08_26;

import java.util.HashMap;

public class ShortestandLexicographicallySmallestBeautifulString {
    public static void main(String[] args) {
        String s= "101010111";
        int k =3;
        System.out.println(shortestBeautifulSubstring(s,k));
    }
        public static String shortestBeautifulSubstring(String s, int k) {

                    int left = 0;
                    int ones = 0;

                    String answer = "";

                    for (int right = 0; right < s.length(); right++) {

                        // Add current character
                        if (s.charAt(right) == '1') {
                            ones++;
                        }

                        // We have exactly k ones
                        if (ones == k) {

                            // Remove unnecessary zeros from left
                            while (s.charAt(left) == '0') {
                                left++;
                            }

                            String current = s.substring(left, right + 1);

                            // First answer OR shorter answer
                            if (answer.equals("")
                                    || current.length() < answer.length()) {

                                answer = current;
                            }

                            // Same length → lexicographically smaller
                            else if (current.length() == answer.length()
                                    && current.compareTo(answer) < 0) {

                                answer = current;
                            }
                        }
                    }

                    return answer;
                }
            }