package com.dsa.dailycode.day39_2026_06_18;

public class Power {
    public static void main(String[] args) {
        double x = 2;
int n = 10;
        System.out.println(myPow(x,n));
    }
        public static double myPow(double x, int n) {
        double x1=1;
        for(int i=1;i <=n;i++) {
            x1 = x1 * x;
        }
        return x1;
        }

    }

