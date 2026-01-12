package com.dsa.day03;

import java.net.SocketOption;

public class PrimeNum {
    public static void main(String[] args) {


        int num = 10;
        int c = 2;
        while (c < num) {
            if(num%c==0){
                System.out.println("not prime");
            }
else {
                c = c + 1;
            }

            }
        }

    }

