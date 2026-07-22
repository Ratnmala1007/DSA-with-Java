package com.dsa.dailycode.day51_2026_07_20;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7}; int target = 7;
        CombinationSum cs = new CombinationSum();
        System.out.println(cs.combinationSum(candidates , target));
    }
        public List<List<Integer>> combinationSum(int[] candidates, int target) {

                    List<List<Integer>> result = new ArrayList<>();

                    backtrack(candidates, 0, new ArrayList<>(), result);

                    return result;
                }

                public void backtrack(int[] nums,
                                      int i,
                                      List<Integer> current,
                                      List<List<Integer>> result) {

                    // base case
                    if(i == nums.length) {

                        result.add(new ArrayList<>(current));
                        return;
                    }

                    // TAKE
                    current.add(nums[i]);

                    backtrack(nums, i + 1, current, result);

                    // BACKTRACK
                    current.remove(current.size() - 1);

                    // NOT TAKE
                    backtrack(nums, i + 1, current, result);
                }
            }