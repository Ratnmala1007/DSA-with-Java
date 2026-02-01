package com.dsa.codingblocks.assignment_2;

import java.util.Scanner;

public class BinToDecimal {
        public static int binToDecimal(int binary){
            int decimal = 0;
            int base = 1; // 2^0

            while (binary > 0) {
                int lastDigit = binary % 10;
                decimal = decimal + lastDigit * base;
                base = base * 2;
                binary = binary / 10;
            }
            return decimal;

        }


        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int decimal=binToDecimal(n);
            System.out.println(decimal);

        }
    }

