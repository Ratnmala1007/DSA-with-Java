package com.dsa.javadeveloper.arrays;

import java.util.Arrays;

public class SumOfPositiveAndNegative {
    public static void main(String[] args) {
        int[]arr = { 1,2,3,4,-5,-6};
        System.out.println(Arrays.toString(sum(arr)));
    }
    static int[] sum(int[]arr){
        int positive = 0;
        int negative = 0;
        for (int  i=0;i<arr.length;i++){
            if(arr[i]>0){
               positive+=arr[i];
            }
            else{
                negative+=arr[i];
            }
        }
        int[]ans = { positive,negative};
        return ans;
       // System.out.println("positive sum:"+positive+"\n"+"negative sum:"+negative);
    }
}
