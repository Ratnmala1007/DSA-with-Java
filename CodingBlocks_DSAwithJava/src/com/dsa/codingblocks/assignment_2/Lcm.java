package com.dsa.codingblocks.assignment_2;

import java.util.Scanner;

public class Lcm {


        static int gcd(int a, int b) {
            while (b != 0) {
                int rem = a % b;
                a = b;
                b = rem;
            }
            return a;
        }

        static int lcm(int n1, int n2) {
            return (n1 * n2) / gcd(n1, n2);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            System.out.println(lcm(n1, n2));
        }
    }


