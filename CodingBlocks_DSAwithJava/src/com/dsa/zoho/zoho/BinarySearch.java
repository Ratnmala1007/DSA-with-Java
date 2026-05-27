package com.dsa.zoho.zoho;
//        Input: nums = [-1,0,3,5,9,12], target = 9
//        Output: 4
//        Explanation: 9 exists in nums and its index is 4
//

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(binarySearch(arr,9));
    }
    public static int binarySearch(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;

        while(low < high){
            int mid = low + (high - low)/2;
            if(target < arr[mid]){
                high = mid - 1;
            }
            else if(target > arr[mid]){
                low = mid +1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
