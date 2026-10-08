package com.dsa.leetcode.arrays;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[]nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
        public static int[] sortArrayByParity(int[] nums) {
            int left = 0;int right = nums.length-1;
            for(int i =0;i <nums.length;i++) {

                if(nums[0]%2!=0) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;

                }
                    left++;
                    right--;

            }
            return nums;
        }
    }

