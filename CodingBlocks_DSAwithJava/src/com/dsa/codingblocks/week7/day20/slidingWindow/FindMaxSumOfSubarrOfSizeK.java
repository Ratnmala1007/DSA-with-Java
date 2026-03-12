package com.dsa.codingblocks.week7.day20.slidingWindow;
//26/feb/2026-lecture
public class FindMaxSumOfSubarrOfSizeK {
    public static void main(String[] args) {
        int[]arr={2,1,5,1,3,5,2};

        int max=0;
        int sum=0;
        int k=3;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        max=sum;

        for(int i=k;i<arr.length;i++){
            sum=sum-arr[i-k]+arr[i];
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }
}
