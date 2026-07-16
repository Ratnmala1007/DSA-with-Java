package com.dsa.zoho;

public class ThreeSum {
    public static void main(String[] args) {
        int[]arr = {-1,0,1,2,-1,-4};
int sum = 0;
        for(int i = 0;i < arr.length-2;i++){
            for(int j = i+1;j < arr.length-1;j++){
                for(int k = j+1;k < arr.length;k++){
                  //  if(arr[i] !=arr[j] && arr [i] !=arr[k] &&  arr[j] !=arr[k]){
                        if(arr[i] + arr[j] + arr[k] == 0){
                    sum += arr[i] + arr[j] + arr[k];


                   }

                }
            }
        }
        System.out.println(sum);
    }
}
