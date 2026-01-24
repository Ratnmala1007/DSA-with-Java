package com.dsa.assignment_1;

import java.util.Scanner;

//                            *****
//                           *   *
//                          *   *
//                         *   *
//                        *****
public class HollowRhombusPattern {
    public static void main(String[] args) {



                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int rows=0;
                int stars=n;
                int j=n-1;
                while(rows<n){
                    int k = 0;
                    while(k<j){
                        System.out.print(" ");
                        k++;
                    }
                    int star = 0;
                    while(star<n){
                        if(rows == 0|| rows == n-1|| star == 0|| star == n-1){
                            System.out.print("*");

                        }
                        else{
                            System.out.print(" ");

                        }
                        star++;
                    }
                    System.out.println();
                    rows++;
                    j--;

                }

            }
        }