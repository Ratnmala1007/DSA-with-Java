package com.dsa.codingblocks.assignment_2;

import java.util.Scanner;

public class ReplaceNum {

       public static int replaceZeroWithFive(int num) {
           // Edge case
           if (num == 0) {
               // return 5;
               System.out.println(5);
           }

          long result = 0;
          long place = 1;

           while (num > 0) {
              long digit = num % 10;

               if (digit == 0) {
                   digit = 5;
               }

               result = digit * place + result;
               place = place * 10;
               num = num / 10;
           }

           return (int) result;

       }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            System.out.println(replaceZeroWithFive(n));
        }
    }


