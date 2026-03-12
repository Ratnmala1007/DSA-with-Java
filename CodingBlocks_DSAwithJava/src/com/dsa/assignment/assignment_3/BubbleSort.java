package com.dsa.assignment.assignment_3;

import java.util.Scanner;

public class BubbleSort {

        public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);

            int size = sc.nextInt();
            int[] n = new int[size];

            // input array
            for (int i = 0; i < size; i++) {
                n[i] = sc.nextInt();
            }

            // bubble sort
            for (int i = 0; i < size; i++) {
                for (int j = 1; j < size - i; j++) {
                    if (n[j] < n[j - 1]) {
                        int temp = n[j];
                        n[j] = n[j - 1];
                        n[j - 1] = temp;
                    }
                }
            }

            // print array
            for (int i = 0; i < size; i++) {
                System.out.println(n[i] + " ");
            }
        }
    }


