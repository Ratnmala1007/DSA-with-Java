package com.dsa.leetcode.slidingWindow;

import java.util.ArrayList;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[]nums = {1,3,-1,-3,5,3,6,7};
        int k =3;
        System.out.println(maxSlidingWindow(nums,k));
    }
        public static int[] maxSlidingWindow(int[] nums, int k) {
            ArrayList<Integer> list = new ArrayList<>();
            int left =0;int maxVal=0;
            int[] max = new int[0];
            for(int right =0;right < nums.length; right++){
                if(right > k){
                    maxVal = Math.max(maxVal , right-left+1);
                    //max = maxVal;
                    left++;
                }
            }
            return max;
        }
    }

