package com.dsa.dailycode.day4_2026_04_09;

import java.util.HashMap;

public class BasicHashmapOperation {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,100);
        map.put(1,200);
        map.put(2,300);
        map.put(3,400);
        map.put(4,500);


        System.out.println(map.get(3));
       if( map.containsKey(1)){
           System.out.println(true);
       }
       else{
           System.out.println(false);
       }
        System.out.println(map);

    }
}
