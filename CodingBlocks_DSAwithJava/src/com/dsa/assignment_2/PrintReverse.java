package com.dsa.assignment_2;

import java.util.Scanner;

public class PrintReverse {
    public static void main(String args[]) {
        // Your Code Here
        int rev = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            rev = rev * 10 + rem;
            //System.out.print(ans);

        }
        System.out.print(rev);

    }
    }
