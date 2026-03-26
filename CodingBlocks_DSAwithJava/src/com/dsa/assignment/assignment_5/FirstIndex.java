package com.dsa.assignment.assignment_5;

public class FirstIndex {
        public static int findLastIndex(int[]arr,int i,int m){
            if(i==arr.length){
                return -1;
            }
            if(arr[i]==m){
                return i;
            }
           return findLastIndex(arr, i+1, m);
        }
        public static void main(String args[]) {
            int[]arr={1,2,3,2,3};
            int m=3;
            int result=findLastIndex(arr, 0,m);
            System.out.println(result);

        }
    }


