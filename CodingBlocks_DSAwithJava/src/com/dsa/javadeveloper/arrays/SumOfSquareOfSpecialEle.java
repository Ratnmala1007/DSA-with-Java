package com.dsa.javadeveloper.arrays;

public class SumOfSquareOfSpecialEle {
    public static void main(String[] args) {
        int[]nums = { 1,2,3,4};
        System.out.println(sumOfSquares(nums));
    }
        public static int sumOfSquares(int[] nums) {
            int n = nums.length;
int result = 0;
            for(int i =0;i< nums.length;i++){
                if(n%(i+1)==0){
                    result+=nums[i]*nums[i];
                }
            }
            return result;
        }
    }

