package com.dsa.day03;


//* * * * *
//* * * *
//* * *
//* *
//*

    public class Star2 {

        public static void main(String[] args) {
            int row=5;
            while(row>=1) {
                int col=1;
                while(col<=row) {
                    System.out.print("* ");
                    col++;
                }
                System.out.println(" ");
                row--;
            }
        }

    }


