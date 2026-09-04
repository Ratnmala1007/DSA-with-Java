package com.dsa.leetcode.arrays;

import java.util.Arrays;

public class ShuffleTheArr {
    public static void main(String[] args) {
        int[]nums={2,5,1,3,4,7};
        int n =3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    public static int[] shuffle(int[] nums, int n) {
                int start =0;
                int index =0;
                int[]arr =new int[nums.length];
                while(start < n){            //i/p   2,5,1,3,4,7  n=3
                    arr[index]=nums[start] ;
                      arr[index+1] =nums[start+n];         //0/p  2,3,5,4,1,7
                    start++;
                   index+=2;
                }
                return arr;
            }
        }


