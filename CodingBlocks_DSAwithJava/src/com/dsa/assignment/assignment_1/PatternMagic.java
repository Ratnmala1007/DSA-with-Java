package com.dsa.assignment.assignment_1;

import java.util.Scanner;
//        *******
//        *** ***
//        **   **
//        *     *
//        **   **
//        *** ***
//        *******

public class PatternMagic {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();

            int total = 2 * N - 1;

            for (int i = 0; i < total; i++) {

                int leftStars;
                int middleSpaces;

                if (i < N) {
                    leftStars = N - i;
                    middleSpaces = 2 * i - 1;
                } else {
                    leftStars = i - N + 2;
                    middleSpaces = 2 * (total - i - 1) - 1;
                }

                // FIRST & LAST ROW → ALL STARS
                if (i == 0 || i == total - 1) {
                    for (int j = 0; j < total; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    continue;
                }

                // LEFT STARS
                for (int j = 0; j < leftStars; j++) {
                    System.out.print("*");
                }

                // MIDDLE SPACES
                for (int j = 0; j < middleSpaces; j++) {
                    System.out.print(" ");
                }

                // RIGHT STARS
                for (int j = 0; j < leftStars; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
