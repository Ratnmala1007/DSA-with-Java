package com.dsa.dailycode.day6_2026_04_11;

import java.util.HashMap;

public class LongestSubarraywithSumOfK {
    public static void main(String[] args) {
        int[] arr = { 1,2,1,0,1,1,0,1};
int sum =0;
int maxLength=0;
int k =4;
        HashMap<Integer,Integer> map = new HashMap<>();
          map.put(0,-1);
        for (int i = 0; i < arr.length;i++){
          sum+=arr[i];
if(map.containsKey(sum-k)) {
    int length = i - map.get(sum - k);
    maxLength = Math.max(maxLength, length);
}
    if(!map.containsKey(sum)){
        map.put(sum, i);
    }
}
        System.out.println("Max Length = " + maxLength);

    }

        }


