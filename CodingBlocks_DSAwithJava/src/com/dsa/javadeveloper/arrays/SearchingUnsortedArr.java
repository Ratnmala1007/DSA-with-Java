package com.dsa.javadeveloper.arrays;

public class SearchingUnsortedArr {
    public static void main(String[] args) {
        int[]arr = { 1,2,3,2,6,4};
        int target =2;
        System.out.println(searchEle(arr,target));
    }
    static int searchEle(int[]arr,int target){
        for(int i =0;i< arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
