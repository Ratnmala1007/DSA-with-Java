package com.dsa.dailycode.day29_2026_05_21;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[]nums = {1,2,3};
        List<Integer> current = new ArrayList<>();
        List<List<Integer>>result = new ArrayList<>();

        backtrack(nums,current,result);
        System.out.println(result);

    }
        public List<List<Integer>> permute(int[] nums) {

            List<List<Integer>> result = new ArrayList<>();

            backtrack(nums, new ArrayList<>(), result);

            return result;
        }

        public static void backtrack(int[] nums,
                              List<Integer> current,
                              List<List<Integer>> result) {

            // BASE CASE
            if(current.size() == nums.length) {

                result.add(new ArrayList<>(current));

                return;
            }

            // TRY EVERY NUMBER
            for(int i = 0; i < nums.length; i++) {

                // skip if already used
                if(current.contains(nums[i])) {

                    continue;
                }

                // CHOOSE
                current.add(nums[i]);

                // RECURSION
                backtrack(nums, current, result);

                // BACKTRACK
                current.remove(current.size() - 1);
            }
        }
    }

