package com.dsa.practice.selfBuildLogic.basicMath;

public class SwapNum {
    public static void main(String[] args) {
        int a =10;
        int b = 20;
        System.out.println("Before swap:"+'\n'+"a="+a+'\n'+"b="+b );
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap:"+'\n'+"a="+a+'\n'+"b="+b );
    }
}
