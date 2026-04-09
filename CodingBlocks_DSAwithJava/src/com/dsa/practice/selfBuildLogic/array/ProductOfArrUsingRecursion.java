package com.dsa.practice.selfBuildLogic.array;

public class ProductOfArrUsingRecursion {
        public static void main(String[] args) {
            int []arr={2,2,3,5};
            System.out.println(product(arr,0));
        }
        public static int product(int[]arr,int index){
            if(index == arr.length){
                return 1;
            }
            int Ans=product(arr, index+1);
            return arr[index]*Ans;
        }
    }


