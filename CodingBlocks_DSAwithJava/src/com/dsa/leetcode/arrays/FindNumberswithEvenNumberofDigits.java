package com.dsa.leetcode.arrays;

public class FindNumberswithEvenNumberofDigits {
        public static void main(String[] args) {

            int[]nums = {12,345,2,6,7894};
            System.out.println( findNumbers(nums));
        }
        public static int findNumbers(int[] nums) {
            int result =0;
            int num ;
            for(int i=0;i<nums.length;i++) {
                int count = 0;

                while (nums[i] > 0) {
                    count++;
                    nums[i] /= 10;
                }

                if (count % 2 == 0)
result++;

            }
            return result;

        }

}
