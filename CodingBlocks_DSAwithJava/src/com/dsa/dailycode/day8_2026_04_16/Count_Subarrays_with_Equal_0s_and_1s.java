package com.dsa.dailycode.day8_2026_04_16;

import java.util.HashMap;

public class Count_Subarrays_with_Equal_0s_and_1s {
    public static void main(String[] args) {


        int[] arr = {0, 1, 0, 1, 1, 0};
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = -1;
            } else if (arr[i] == 1) {
                arr[i] = 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
        for (int num : arr) {
            sum += num;
            if (map.containsKey(sum)) {
                count += map.get(sum);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            //System.out.println(sum);

        }
        System.out.println(count);
    }

}