package com.dsa.assignment.assignment_3;

import java.util.Scanner;

public class InverseArr {

    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int[]arr=new int[N];
        int[]inv=new int[N];
        for(int i = 0; i < N;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < N;i++){
            inv[arr[i]] = i;
        }
        for(int i = 0; i < N;i++){
            System.out.print(inv[i] + " ");
        }
    }
}

