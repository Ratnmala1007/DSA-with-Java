package com.dsa.dailycode.day5_2026_04_10;

import java.util.Arrays;

public class PrefixSumBasedRange {
    public static void main(String[] args) {
        //1st approach
        int[]arr = { 1,2,3};

//        for(int i = 1;i<=3;i++){
//            int sum=arr[i]+arr[i-1];
//
//            System.out.print(sum+" ");
//        }

        //2nd approach

        int[] prefix = new int [arr.length];
        prefix[0] = arr[0];
               for(int i = 1;i<arr.length;i++){
                   prefix[i]=prefix[i-1]+arr[i];
               }
        System.out.println(Arrays.toString(prefix));
int left = 1;int right = 2;

int sum ;
        if(left == 0){
            sum = prefix[right];

        } else {
            sum = prefix[right] - prefix[left - 1];

        }
        System.out.println(sum);
    }

    }

