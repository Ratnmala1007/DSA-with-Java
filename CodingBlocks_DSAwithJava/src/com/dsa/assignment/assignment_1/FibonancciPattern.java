package com.dsa.assignment.assignment_1;

import java.util.Scanner;
//        0
//        1 1
//        2 3 5
//        8 13 21 34
//        55 89 144 233 377

public class FibonancciPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num1=0,num2=1;
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num1 + " ");
                int k = num1 + num2;
                num1 = num2;
                num2 = k;
            }

            System.out.println();
        }
    }
}
