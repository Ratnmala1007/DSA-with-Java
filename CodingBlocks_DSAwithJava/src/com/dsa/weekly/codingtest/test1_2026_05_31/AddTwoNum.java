package com.dsa.weekly.codingtest.test1_2026_05_31;

import java.util.Arrays;
import java.util.HashMap;
//chatgpt rating overall mocktest 6/10
//Given an integer array nums and an integer target, return the indices of the two numbers such that they add up to target.
//
//        Example
//        Input:
//        nums = [2,7,11,15]
//        target = 9
//
//        Output:
//        [0,1]
//
public class AddTwoNum {
    public static void main(String[] args) {
        int[] arr = {2,0,11,15,7};
        int target =9;

        System.out.println(Arrays.toString(add(arr, 9)));
    }
    public static int[] add(int[]arr,int target){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<arr.length;i++){

            int diff = target-arr[i];

            if(map.containsKey(diff)){
            return new int[]{map.get(diff),i};
           }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}
