package com.dsa.dailycode.day55_2026_07_31;

public class SortColor {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 0, 1};
     sortColors(nums);

     //System.out.println();
    }

    public static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean swap = false;
            for (int j = 0; j < nums.length-1; j++) {
                swap = true;
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }

            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}