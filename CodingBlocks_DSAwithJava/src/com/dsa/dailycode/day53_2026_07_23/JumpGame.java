package com.dsa.dailycode.day53_2026_07_23;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 4,5};
        System.out.println(maxjump(nums));
    }
    private static boolean maxjump(int[]nums){
        int maxJump = 0;

        for(int i =0; i < nums.length;i++){
            if(i > maxJump){
                return false;
            }
            maxJump = Math.max(maxJump , i+nums[i]);
            if(maxJump >= nums.length-1){
                return true;
            }
        }
        return true;
    }
}
