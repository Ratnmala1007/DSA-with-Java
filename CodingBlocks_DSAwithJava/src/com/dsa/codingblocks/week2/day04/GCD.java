package com.dsa.codingblocks.week2.day04;
//How to find out GCD

//Method:1
public class GCD {
    public static void main(String[] args) {

        int a = 8;
        int b = 7;
        int divident=a;
        int divisor=b;

        //int rem=divisor%divident;
        while(divisor != 0){
            int rem=divident % divisor;
            divident = divisor;
            divisor=rem;
        }
                System.out.println(divident);

    }}

//        int gcd =1;
//            int n =(a < b ? a : b);
//        for (int i = 2; i <= n;) {
//            if (a % i == 0 && b % i == 0) {
//                gcd = gcd * i;
//                a = a / i;
//                b = b / i;
//            } else {
//                i++;
//            }
//        }
//        System.out.println(gcd);
//        }
//    }
//Method:2
//while (i <= a && i <= b) {
//        if (a % i == 0 && b % i == 0) {
//        gcd = i;
//        }
//        i++;
//        }


//Method:3

//        while (b != 0) {
//            int remainder = a % b;
//            a = b;
//            b = remainder;
//        }
//
//        System.out.println("GCD = " + a);
//    }
//}