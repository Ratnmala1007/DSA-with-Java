package com.dsa.youtube.kunalkushwaha.searching;
// Topic: Binary Search
// Date: 29 Jan 2026

public class BinarySearch {
    public static void main(String[] args) {
        int []arr={-10,-1,2,5,8,12,1,16,23,38,56,72,91};

        int target= 23;
        //int ans=binSearch(arr,target);
        System.out.println(binSearch(arr,target));
    }
    static int binSearch(int []arr,int target){
        int start = 0;
        int end = arr.length-1;


        while(start <= end){
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
