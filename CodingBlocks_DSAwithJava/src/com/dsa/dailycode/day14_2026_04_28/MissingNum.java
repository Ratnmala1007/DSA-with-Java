package com.dsa.dailycode.day14_2026_04_28;

public class MissingNum {
    public static void main(String[] args) {
int[] arr = { 1,2,3,4,5,0,7};
        System.out.println(missingNum(arr));
    }
    public static int missingNum(int[]arr){
        int xor = 0;

        for (int i = 0;i <= arr.length;i++){
            xor ^= i;
        }
        for (int num:arr){
            xor ^= num;
        }
        return xor;
    }
}
