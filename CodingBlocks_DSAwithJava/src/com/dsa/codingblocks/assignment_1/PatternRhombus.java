package com.dsa.codingblocks.assignment_1;

import java.util.Scanner;

public class PatternRhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }

            // increasing numbers
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            // decreasing numbers
            num = num - 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num + " ");
                num--;
            }


            System.out.println();
        }

    }
}
