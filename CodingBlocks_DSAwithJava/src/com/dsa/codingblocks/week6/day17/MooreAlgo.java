package com.dsa.codingblocks.week6.day17;

public class MooreAlgo {
    public static void main(String[] args) {
        int []nums={3,2,3};
        int result=majorityElement( nums);
        System.out.println(result);
    }
        public static int majorityElement(int[] nums) {

            int candidate = 0;
            int count = 0;

            for (int i = 0; i < nums.length; i++) {

                if (count == 0) {
                    candidate = nums[i];
                }

                if (nums[i] == candidate) {
                    count++;
                } else {
                    count--;
                }
            }

            return candidate;
        }
    }


