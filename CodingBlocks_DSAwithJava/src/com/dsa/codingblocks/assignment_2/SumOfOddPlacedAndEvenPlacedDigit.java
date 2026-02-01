package com.dsa.codingblocks.assignment_2;

import java.util.Scanner;

public class SumOfOddPlacedAndEvenPlacedDigit {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int even=0;
            int odd=0;
            int pos=0;
            while(n>0){
                int digit = n%10;

                if(pos % 2 == 0){
                    even+=digit;

                } else{
                    odd+=digit;
                }
                n = n/10;
                pos++;
            }
            System.out.println(odd);

            System.out.println(even);






        }
    }

