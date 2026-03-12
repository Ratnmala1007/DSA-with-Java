package com.dsa.codingblocks.week1.day03;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==2){
            System.out.println("Prime");

        }
        else if(n%2==0|| n<=1){
            System.out.println("Not Prime");

        }
        else{
            System.out.println("Prime");

        }


    }

}




