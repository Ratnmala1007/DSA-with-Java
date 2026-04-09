package com.dsa.practice.selfBuildLogic.array;

public class FindMinInArr {
    public static void main(String[] args) {
        int[]arr = {8,-19,-4,4,-1};
       // int min = arr[0];
      int min=  Integer.MAX_VALUE;
       // Integer.MAX_VALUE

//        for(int i = 0; i < arr.length;i++){
//            if(arr[i]<min){
//                min = arr[i];
//            }
        for(int num:arr){
            if(num < min){
                 min=num ;
            }

        }
        System.out.println(min);
    }
}
