package com.dsa.assignment.assignment_1;

import java.util.Scanner;
//               *
//             * * *
//           * * * * *
//             * * *
//               *
public class MirrorStarPattern {
    public static void main(String args[]) {
        // Your Code Here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int mid = (n + 1) / 2;

// upper half (including middle)
        for (int i = 1; i <= mid; i++) {

            for (int s = i; s < mid; s++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

// lower half (excluding middle)
        for (int i = mid - 1; i >= 1; i--) {

            for (int s = mid; s > i; s--) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    }
