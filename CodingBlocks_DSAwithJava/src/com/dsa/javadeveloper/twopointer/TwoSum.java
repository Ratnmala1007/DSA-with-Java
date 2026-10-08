package com.dsa.javadeveloper.twopointer;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[]arr = { 2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(sum(arr , target)));
    }
    public static int[] sum(int[]arr,int target){
        int left =0,right = arr.length-1;
        while(left < right){
            int sum = arr[left]+arr[right];
            if(sum > target){
                right--;
            }
            else if(sum < target){
                left++;
            }
            else{
                return new int[]{left, right};
            }
        }
        return new int[]{-1  -1};
    }
}
