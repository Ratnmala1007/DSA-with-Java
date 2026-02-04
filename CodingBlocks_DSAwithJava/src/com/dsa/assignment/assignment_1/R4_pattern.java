package com.dsa.assignment.assignment_1;

//        *
//        **
//        ***
//        ****
//        *****
import java.util.Scanner;

public class R4_pattern {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

