package com.dsa.zoho.zoho;

public class MissingNum {
    public static void main(String[] args) {
int[] arr = { 3,2,0};
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
