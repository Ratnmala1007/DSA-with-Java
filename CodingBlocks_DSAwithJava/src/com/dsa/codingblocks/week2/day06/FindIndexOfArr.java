package com.dsa.codingblocks.week2.day06;

import java.util.Scanner;

public class FindIndexOfArr {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int arr[] = {2, 3, 5, 6};
        System.out.println("Enter element to find");
        int num=sc.nextInt();
        int index = -1;

        for(int i=0;i<arr.length;i++){
           if (arr[i]==num){
               index=i;
              break;
            }

        }
        System.out.println("Index = " + index);

    }
}