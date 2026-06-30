package com.dsa.dailycode.day46_2026_06_29;

import java.util.Arrays;
import java.util.HashSet;

public class PrintDuplicate {
    public static void main(String[] args) {
        int [] arr = { 1,2,3,4,1,2,4,2,3};
        printDuplicate(arr);

    }
    public  static void printDuplicate(int[]arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i < arr.length; i++) {

            if(!set.add(arr[i])){
                System.out.print(arr[i]+" ");}
            }
        }
    }

