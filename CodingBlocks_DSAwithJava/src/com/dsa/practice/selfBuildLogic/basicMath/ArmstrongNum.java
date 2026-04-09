package com.dsa.practice.selfBuildLogic.basicMath;

public class ArmstrongNum {
    public static void main(String[] args) {
        int num =153;
        int count =0;
        int temp = num;
        int sum = 0;

    while(temp > 0){
        count++;
        temp/=10;
    }
    temp=num;
    while(temp>0){
        int digit = temp % 10;
        int pow=1;
        for(int i=1;i<=count;i++){
           pow = pow * digit;
        }
           sum = sum + pow;
           temp/=10;

        }
        if(sum == num){
            System.out.println("Armstrong num");
        }
        else{
            System.out.println("not Armstrong num");
        }
    }
    }


