package com.dsa.dailycode.day47_2026_07_04;

public class ArrayInEvenPos {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        //Even position Element
        for(int i = 1;i < arr.length; i+=2){
            System.out.println("Even position ele is:"+arr[i]+" ");
        }
        //odd position element
        System.out.println( );
        for(int i = 0;i < arr.length; i+=2){
            System.out.println("odd position ele is:"+arr[i]+" ");
        }
    }
}
