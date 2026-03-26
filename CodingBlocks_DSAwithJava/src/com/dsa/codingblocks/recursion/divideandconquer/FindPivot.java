package com.dsa.codingblocks.recursion.divideandconquer;

public class FindPivot {
    private static int findPivot(int[]arr,int start,int end){
       int item = arr[end];
       for(int i=start;i<end;i++){
           if(arr[i]<item){
               int temp=arr[i];
               arr[i]=arr[start];
               arr[start]=temp;
               start++;
           }

       }
       arr[end]=arr[start];
       arr[start]=arr[end];
       return start;
    }
    public static void main(String[] args) {
        int[]arr = {5,7,2,1,8,3,4};
        int n=arr.length;
        System.out.println(findPivot(arr,0,n-1));

    }
}
