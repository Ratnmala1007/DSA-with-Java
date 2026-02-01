package com.dsa.codingblocks.assignment_1;

import java.util.Scanner;

public class PatternHourGlass {


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;

        // UPPER PART (including middle)
        for (i = n; i >= 0; i--) {

            // spaces
            for (j = 0; j < (n - i) * 2; j++) {
                System.out.print(" ");
            }

            // left numbers (i to 0)
            for (j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }

            // right numbers (1 to i)
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        // LOWER PART
        for (i = 1; i <= n; i++) {

            // spaces
            for (j = 0; j < (n - i) * 2; j++) {
                System.out.print(" ");
            }

            // left numbers
            for (j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }

            // right numbers
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}



