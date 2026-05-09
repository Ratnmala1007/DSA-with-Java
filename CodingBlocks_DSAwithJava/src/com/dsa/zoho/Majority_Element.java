package com.dsa.zoho;

public class Majority_Element {
    public static void main(String[] args) {
        int[] arr = {1, 2,2,3,1,2};
        System.out.println(majorityEle(arr));
    }

    public static int majorityEle(int[] arr) {
        int count = 0;
        int candidate = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }

        }
        int count1 = 0;
        for(int num : arr){
            if(num == candidate) count++;
        }
        if(count > arr.length/2) return candidate;
        else return -1;

}
}
