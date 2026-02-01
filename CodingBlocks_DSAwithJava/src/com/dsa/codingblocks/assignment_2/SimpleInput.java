package com.dsa.codingblocks.assignment_2;

import java.util.Scanner;

public class SimpleInput {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int sum = 0;

            while (true) {
                int num = sc.nextInt();
                sum += num;

                if (sum < 0) {
                    break;
                }

                System.out.print(num + " ");
            }
        }
    }


