package com.dsa.assignment.assignment_5;

import java.util.Scanner;

public class LastIndex {

        public static int findLastIndex(int[]arr,int i,int m){
            if(i==arr.length){
                return -1;
            }
            int result= findLastIndex(arr, i+1, m);
            if (result != -1) {
                return result;
            }
            if(arr[i]==m){
                return i;
            }
            return -1;
        }
        public static void main(String args[]) {
            int[]arr={1,2,3,2,3};
            int m=3;
            int result=findLastIndex(arr, 0,m);
            System.out.println(result);

        }
    }

