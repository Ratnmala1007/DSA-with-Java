package com.dsa.codingblocks.day10;

public class SumOfSubArrays {
    public static void main(String[] args) {

        int[] arr = {1,2,3,7,6,5};
        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int k=i;
                int sum=0;
                while(k<=j){
           sum+=arr[k];
           k++;
                }
                System.out.println(sum);
            }
        }
    }

}
