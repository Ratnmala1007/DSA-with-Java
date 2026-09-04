package com.dsa.dailycode.day58_2026_08_25;

public class SmallestMissingMultipleofK {
    public static void main(String[] args) {
        int[] nums = {8,2,3,4,6};
        int k = 2;
        System.out.println(missingMultiple(nums, k));
    }

    public static int missingMultiple(int[] nums, int k) {
        //int[] arr = new int[nums.length];
        for (int i = 1; i <= nums.length; i++) {

            int multiple = k * i;

            boolean found = false;

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] == multiple) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return multiple;
            }
        }
        return 0;
    }
}
