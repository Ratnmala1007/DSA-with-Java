package com.dsa.codingblocks.week1.day03;

//*
//* *
//* * *
//* * * *
//* * * * *

        public class Star1 {

            public static void main(String[] args) {
                int row=1;

                while(row<=5) {
                    int col=1;
                    while(col<=row) {
                        System.out.print("* ");

                        col++;

                    }
                    System.out.println(" ");

                    row++;


                }

            }
        }

