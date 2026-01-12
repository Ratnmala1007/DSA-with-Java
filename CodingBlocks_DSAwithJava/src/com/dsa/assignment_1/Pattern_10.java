package com.dsa.assignment_1;

import java.util.Scanner;

public class Pattern_10 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 0;

        while (row < n) {
            int col = 0;

            while (col < n) {

                if (row == 0 || row == 8) {
                    System.out.print("*");
                } else if (row == 1 || row == 7) {
                    if (col == 4) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else if (row == 2 || row == 6) {
                    if (col == 3 || col == 4 || col == 5) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else if (row == 3 || row == 5) {
                    if (col == 0 || col == 1 || col == 7 || col == 8) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (row == 4) {
                    if (col == 0 || col == 8) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
    }
