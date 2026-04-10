package com.dsa.dailycode.day4_2026_04_09;

import java.util.HashMap;

public class FirstNonReapitingEle {
    public static void main(String[] args) {
        int[]arr = { 2,1,2,3,1,3};

        HashMap<Integer,Integer> map = new HashMap<>();

boolean found = false;
        for(int i =0;i < arr.length;i++) {
            if (map.containsKey(arr[i])) {

                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);

            }
        }
        for(int i =0;i < arr.length;i++) {

            if(map.get(arr[i])==1){
                   System.out.println( "first non reapitng number is:" +" " +arr[i]);
                   found = true;
                   break;
            }

        }
        if(!found){
            System.out.println("not found num");
        }
    }
}
