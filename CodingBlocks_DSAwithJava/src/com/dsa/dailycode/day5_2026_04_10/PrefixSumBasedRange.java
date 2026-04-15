package com.dsa.dailycode.day5_2026_04_10;

public class PrefixSumBasedRange {
    public static void main(String[] args) {
        //1st approach
        int[]arr = { 1,2,3,4,5,6};

        for(int i = 1;i<=3;i++){
            int sum=arr[i]+arr[i-1];

            System.out.print(sum+" ");
        }

        //2nd approach

        int[] prefix = new int [arr.length];
        prefix[0] = arr[0];
               for(int i = 1;i<arr.length;i++){
                   prefix[i]=prefix[i-1]+arr[i];
               }
int l = 1;int r = 3;

int sum = prefix[r] - prefix[l-1];
        System.out.print(sum+" ");
    }
}
