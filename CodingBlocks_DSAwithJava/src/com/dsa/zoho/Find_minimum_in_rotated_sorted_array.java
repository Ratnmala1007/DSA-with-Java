package com.dsa.zoho;

public class Find_minimum_in_rotated_sorted_array {

    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(minRotatedArr(arr));
    }
    public static int minRotatedArr(int[]arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int mid = start+(end-start)/2;
            if(arr[mid] < arr[end]){
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return arr[start];
    }
}
