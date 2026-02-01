package com.dsa.codingblocks.assignment_1;

//                     5                   5
//                     5 4               4 5
//                     5 4 3           3 4 5
//                     5 4 3 2       2 3 4 5
//                     5 4 3 2 1   1 2 3 4 5
//                     5 4 3 2 1 0 1 2 3 4 5
//                     5 4 3 2 1   1 2 3 4 5
//                     5 4 3 2       2 3 4 5
//                     5 4 3           3 4 5
//                     5 4               4 5
//                     5                   5


public class PatternInvertedHourGlass {

        public static void main(String[] args) {


                    int N = 5;
                    int totalRows = 2 * N + 1;

                    int i = 0;
                    while (i < totalRows) {

                        int dist;
                        if (i <= N) {
                            dist = N - i;
                        } else {
                            dist = i - N;
                        }

                        // LEFT PART (N → dist)
                        int j = N;
                        while (j >= dist) {
                            System.out.print(j + " ");
                            j--;
                        }

                        // MIDDLE SPACES
                        int spaces = dist * 2 - 1;
                        int s = 0;
                        while (s < spaces) {
                            System.out.print("  ");
                            s++;
                        }

                        // RIGHT PART
                        if (dist != 0) {
                            j = dist;
                        } else {
                            j = 1;   // avoid double 0
                        }

                        while (j <= N) {
                            System.out.print(j + " ");
                            j++;
                        }

                        System.out.println();
                        i++;
                    }
                }
            }
