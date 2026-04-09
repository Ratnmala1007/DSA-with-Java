package com.dsa.practice.selfBuildLogic.array;

public class ArrPolindrome {
    public static void main(String[] args) {
        int []arr={1,2,3,2,1};
        int left = 0;
        int right = arr.length-1;

boolean isPolindrome=false;
        while(left<right){
           if(arr[left]==arr[right]){
               isPolindrome=true;
           break;}


           left++;
           right--;

        }
        System.out.println(isPolindrome);
    }
}
