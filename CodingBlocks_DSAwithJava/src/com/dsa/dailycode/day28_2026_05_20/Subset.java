package com.dsa.dailycode.day28_2026_05_20;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        List<Integer> list = new ArrayList<>();
        subset(  arr , 0,list);
    }
    public static void subset(int[]arr , int i, List<Integer>list){
        if(i == arr.length){
            System.out.println(list);
            return;
        }
        //take
        list.add(i);
        subset(arr,i+1,list);
        //not take
        list.remove(list.size()-1);
        subset(arr,i+1,list);


    }
}
