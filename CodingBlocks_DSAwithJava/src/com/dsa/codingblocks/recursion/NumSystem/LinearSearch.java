package com.dsa.codingblocks.recursion.NumSystem;

public class LinearSearch {
    static boolean Linearsearch(int[]arr,int n,int item){
        if(n==0)
            return false;
      boolean smallerAns = Linearsearch(arr,n-1,item);

      boolean largerAns = (arr[n-1]==item) ||
smallerAns;
    return largerAns;
    }

    public static void main(String[] args) {
int n=8;
int[]arr = {2,1,3,6,4,7,5,9};
int item = 5;
        System.out.println(Linearsearch(arr,n,item));
    }
}
