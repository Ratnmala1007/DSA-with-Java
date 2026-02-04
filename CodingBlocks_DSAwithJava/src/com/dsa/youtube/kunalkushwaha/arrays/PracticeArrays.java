package com.dsa.youtube.kunalkushwaha.arrays;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class PracticeArrays {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
      // int[] arr = new int[6];
//        arr[0] = 20;
//        arr[1] = 260;
//        arr[2] = 45;
//        arr[3] = 210;
//        arr[4] = 200;
//
//        System.out.println(arr[4]);
        int[] arr = {71, 3, 4, 6, 7, 8, 9};
        //arr= new int[]{1, 3, 4, 6, 7, 8, 9};
        //int n=arr.length;
        //System.out.println(arr[2]);
        System.out.print(Arrays.toString(arr));

        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr){
        arr[0] =99;
        //String

//        String[] str = new String[4];
//        for (int i = 0; i < str.length; i++) {
//            str[i] = in.next();
//        }
//
//        System.out.println(Arrays.toString(str));
}
}
