package com.dsa.codingblocks.week7.day20.slidingWindow;

public class LongestSubarrWithSum {
    public static void main(String[] args) {
        int[]arr={1,2,1,0,1,1,0,3};
        int left=0;
        int maxLen=0;
        int sum=0;
        int k=4;//sum would be 4 or less than 4
        for(int right=0;right<arr.length;right++){
            //expand window
            sum=sum+arr[right];

            //shrink window if needed
            while(sum>k){
                sum=sum-arr[left];
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        System.out.println(maxLen);
    }
}
