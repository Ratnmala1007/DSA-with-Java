package com.dsa.javadeveloper.twopointer;

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(arr , target)));
    }

    public static int[] twoSum(int[] arr, int target) {
int left = 0;
int right = arr.length-1;
while(left < right){
    int sum = arr[left]+arr[right];
    if(sum > target){
right--;
    }
    else if(sum < target){
        left++;
    }
    else{
        return new int[]{left+1,right+1};

    }
}
        return new int[]{-1,-1};

    }
}