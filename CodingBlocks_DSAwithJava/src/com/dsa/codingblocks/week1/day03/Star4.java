package com.dsa.codingblocks.week1.day03;



//*
//**
//***
//****
//*****

    public class Star4 {
        public static void main(String[] args) {
            int row=1;
            int n=5;
            while(row<=n) {
                int space=1;
                while(space <= n-row) {
                    System.out.print(" ");

                    space++;

                }
                int col=1;
                while(col<=row) {
                    System.out.print("*");

                    col++;

                }

                System.out.println(" ");
                row++;
            }
        }
    }
