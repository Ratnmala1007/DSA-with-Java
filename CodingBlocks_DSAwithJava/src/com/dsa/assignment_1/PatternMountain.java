package com.dsa.assignment_1;

import java.util.Scanner;

public class PatternMountain {
        public static void main(String[] args) {
            int stars=1;
            int rows=0;
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int space=2*n-3;
            while(rows<n){

            int i=0;
            while(stars>i){
                System.out.print((i+1)+ "\t");
                i++;
            }
                i=0;
            while(space>i){
                System.out.print("\t");
              i++;
            }
            i=stars;
            if(rows==n-1){
                i-=1;
            }
            while(i>=1){
                System.out.print((i)+"\t");
                i--;
            }
            rows++;
            space=space-2;
            stars=stars+1;
                System.out.println();

            }

//            for (int i = 1; i <= n; i++) {
//
//                // left side
//                for (int j = 1; j <= i; j++) {
//                    System.out.print(j + " ");
//                }
//
//                // middle spaces
//                for (int s = 1; s <= 2 * (n - i); s++) {
//                    System.out.print("  ");
//                }
////                if (i == 1) {
////                    System.out.print("1 ");
////                } else {
//                    // right side
//                    for (int j = i ; j >= 1; j--) {
//                        System.out.print(j + " ");
//                   // }
//                }
//                System.out.println();
//            }


                }
            }



