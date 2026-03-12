//Thursday-5/Feb/2026

package com.dsa.practice.leetcode;

import static com.dsa.practice.leetcode.BinSearch_704.Solution.search;

public class BinSearch_704 {
    public static void main(String[] args) {
        int[]nums = {-1,0,3,5,9,12};
        int target = 9;
        int ans =search(nums,target);
        System.out.println(ans);
    }
    class Solution {
       static int search(int[] nums, int target) {
            int start=0;
            int end=nums.length-1;


            while(start<=end){
                int mid=start + (end-start)/2;

                if(target < nums[mid]){
                    end=mid-1;
                }
                else if(target > nums[mid]){
                    start=mid+1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }
    }


}
