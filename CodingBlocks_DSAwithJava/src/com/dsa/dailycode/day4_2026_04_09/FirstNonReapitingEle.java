package com.dsa.dailycode.day4_2026_04_09;

import java.util.HashMap;

public class FirstNonReapitingEle {
    public static void main(String[] args) {
        int[]arr = { 2,1,2,3,4,5,1,3};

        HashMap<Integer,Integer> map = new HashMap<>();

boolean found = false;
        for(int num:arr) {
            if (map.containsKey(num)) {

                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);

            }
        }
        for(int num:arr) {

            if(map.get(num)==1){
                   System.out.println( "first non reapitng number is:" +" " +num);
                   found = true;
                   break;
            }

        }
        if(!found){
            System.out.println("not found num");
        }
    }
}
