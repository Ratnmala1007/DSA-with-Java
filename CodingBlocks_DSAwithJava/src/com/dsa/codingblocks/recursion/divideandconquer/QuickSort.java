package com.dsa.codingblocks.recursion.divideandconquer;

public class QuickSort {

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
            arr[start]=item;
            return start;
        }
        public static void quickSort(int[]arr,int start,int end){
            //base case
            if(start>=end){
                return;
            }
            int pivotInd = findPivot(arr,start,end);
            quickSort(arr,start,pivotInd-1);

            quickSort(arr,pivotInd+1,end);

        }
        public static void main(String[] args) {
            int[]arr = {5,7,2,1,8,3,4};
            int n=arr.length;
           // System.out.println(findPivot(arr,0,n-1));
            quickSort(arr,0,n-1);
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+",");
            }
            System.out.println();
        }
    }

