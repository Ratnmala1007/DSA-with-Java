package com.dsa.dailycode.day1_2026_04_06;

public class PalindromeArr {
    public static void main(String[] args) {
int[] arr = {3,1,2,1,3};
        System.out.println(isPalindrome(arr));
    }

    private static boolean isPalindrome(int[]arr) {
boolean ispalindrome = false;

int left = 0;
int right = arr.length-1;

while(left < right ){
    if(arr[left] != arr[right]){
        return false;
    }
    left++;
    right--;
}
return true;
    }
}