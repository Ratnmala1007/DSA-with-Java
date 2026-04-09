package com.dsa.practice.selfBuildLogic.basicMath;

public class CountEvenOdd {
    public static void main(String[] args) {
        int num = 24631;
        String even = "";
        String odd = "";
       int evenCnt = 0;
       int oddCnt = 0;

        int temp = num;

        while(temp > 0){
            int digit = temp % 10;
            if(digit % 2 == 0){
                even = digit + " " + even;

                evenCnt++;
            }
            else{
                odd = digit + " " + odd;
                oddCnt++;

            }
            temp/=10;

        }

        System.out.println("Even digits: " + even);
        System.out.println("Odd digits: " + odd);
    }
}
