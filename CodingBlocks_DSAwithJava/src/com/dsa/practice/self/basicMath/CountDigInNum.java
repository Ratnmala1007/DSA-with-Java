package com.dsa.practice.self.basicMath;

public class CountDigInNum {
    public static void main(String[] args) {
        int num = 1234;
        int count = 0;
        while(num > 0){
            count++;
            num/= 10;
        }
        System.out.println(count);
    }
}
