package com.dsa.codingblocks.binarysearch;

public class UpperbBound {


        static int upperBound(int[] arr , int x, int n){
            int lo = 0;
            int hi = n-1;
            int lb = n;
            while(lo<=hi){
                int mid = (lo+hi)/2;
                if(arr[mid]>x){
                    lb=mid;
                    hi=mid-1;
                }else{
                    lo=mid+1;
                }
            }
            return lb;
        }
        public static void main(String[] args) {
            int[] arr = {2,3,4,5,6,7,7,7,8,9,10};
            int n = arr.length;
            int x = 6;
            System.out.println(upperBound(arr, 6, n));
        }
    }

