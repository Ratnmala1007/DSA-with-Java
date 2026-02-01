package com.dsa.codingblocks.assignment_2;

import java.util.Scanner;

public class PrintSeries {

        public static void printSeries(int N1, int N2) {
            int count = 0;
            int n = 1;

            while (count < N1) {
                int term = 3 * n + 2;

                if (term % N2 != 0) {
                    System.out.println(term);
                    count++;
                }

                n++;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int N1 = sc.nextInt();
            int N2 = sc.nextInt();

            printSeries(N1, N2);
        }
    }



