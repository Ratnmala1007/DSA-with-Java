package com.dsa.dailycode.day8_2026_04_16;

import java.util.HashMap;

public class Count_Subarrays_with_Equal_0s_and_1s {
    public static void main(String[] args) {


        int[] arr = {0, 1, 0, 1, 1, 0};
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        //Base case
        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            //convert 0 -> -1
            if (arr[i] == 0) {
                sum+= -1;
            } else  {
                sum+=  1;
            }

                 // Check if sum already exists
            if (map.containsKey(sum)) {
                count += map.get(sum);
            }
            // Update map frequency

            map.put(sum, map.getOrDefault(sum, 0) + 1);
            //System.out.println(sum);

        }
        System.out.println("Total subarrays = " + count);
    }

}