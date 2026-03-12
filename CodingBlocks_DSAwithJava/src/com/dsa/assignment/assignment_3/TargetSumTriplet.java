package com.dsa.assignment.assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumTriplet {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            int target = sc.nextInt();

            Arrays.sort(arr);

            for (int i = 0; i < N - 2; i++) {
                for (int j = i + 1; j < N - 1; j++) {
                    for (int k = j + 1; k < N; k++) {

                        if (arr[i] + arr[j] + arr[k] == target) {
                            System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
                        }
                    }
                }
            }
        }
    }

