package com.dsa.dailycode.day53_2026_07_23;

import java.util.HashSet;

public class LongestConsicutive {
    public static void main(String[] args) {


        int[] nums = {1, 4, 200, 5, 3, 2};
        System.out.println(longestConsicutive(nums));
    }
    public static int longestConsicutive(int[]nums){

        HashSet<Integer> set = new HashSet<>();


                for (int num : nums) {
                    set.add(num);
                }

                int longest = 0;

                for (int num : set) {

                    // Start only if this is the first number
                    if (!set.contains(num - 1)) {

                        int current = num;
                        int length = 1;

                        while (set.contains(current + 1)) {
                            current++;
                            length++;
                        }

                        longest = Math.max(longest, length);
                    }
                }

                return longest;
            }
        }