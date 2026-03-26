package com.dsa.codingblocks.binarysearch;

// num is greater in arr and smaller than or equal to target element
public class FloorOfNum {
    public static void main(String[] args) {
        int[] arr={-2,2,5,8,12,14,16,23,38,56,72,91};
        int target=-3;
        int ans=floorNum(arr,target);
        System.out.println(ans);
    }
    static int floorNum(int[]arr,int target){
       int start = 0;
       int end = arr.length-1;

        while(start<=end) {
            int mid = start + (end - start) / 2;
            if(target< arr[arr.length-1]){
                return -1;
            }
           else if (target <= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
            return arr[end];
        }
    }

