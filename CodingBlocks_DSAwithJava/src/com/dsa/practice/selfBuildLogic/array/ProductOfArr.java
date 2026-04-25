package com.dsa.practice.selfBuildLogic.array;

public class ProductOfArr {
    public static void main(String[] args) {
        int []arr={3,4,2,2};
       int result= ProductOfArr.product(arr);
        System.out.println(result);
    }
    public static int product(int[]arr) {
        int result = 1;
for(int i =0 ;i < arr.length;i++){
               // if (arr[i] != arr[j])
                    result = result*arr[i] ;

        }
            return result;
        }

}
