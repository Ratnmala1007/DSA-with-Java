package com.dsa.zoho;
//        Input: nums = [-1,0,3,5,9,12], target = 9
//        Output: 4
//        Explanation: 9 exists in nums and its index is 4
//

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,8,12};
        int target = 12;
        System.out.println(binarySearch(arr,12));
    }
    public static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }
            else{
                return arr[mid];
            }
        }
        return -1;
    }
}
