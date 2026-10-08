package com.dsa.javadeveloper.twopointer;

import java.util.Arrays;

public class SortArrayByParityII_922 {
    public static void main(String[] args) {
        int[]nums = { 1,2,3,4};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }
        public static int[] sortArrayByParityII(int[] nums) {
            int left = 0;int right = nums.length-1;
           // for(int right = 0;right < nums.length;right++){
                while(left < right){
                    if(nums[left] % 2 == 0 && left % 2 == 0){
                        left++;
                    }
                    else if(nums[right] % 2 != 0 && right % 2 != 0){
                        right--;
                    }
                    else{
                        int temp = nums[left];
                        nums[left] = nums[right];
                        nums[right] = temp;
                        left++;
                        right--;
                    }
                }
           // }
            return nums;
        }

}
