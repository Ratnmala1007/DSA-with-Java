package com.dsa.assignment.assignment_5;

public class CountOcurrences {

        public static void countOcurrences(int[]arr,int i,int m){
            if(i==arr.length){
                return ;
            }
            if(arr[i]==m){
                System.out.print(i+" ");
               // return i;
            }
             countOcurrences(arr, i+1, m);
        }
        public static void main(String args[]) {
            int[]arr={1,2,3,2,3};
            int m=3;
           countOcurrences(arr, 0,m);
            //System.out.println(countOcurrences(arr,0,m));

        }
    }



