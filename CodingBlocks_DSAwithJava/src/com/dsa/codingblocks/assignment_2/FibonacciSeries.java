package com.dsa.codingblocks.assignment_2;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int num1 = 0;
    int num2 = 1;
    int ans = 0;

      for(int i = 2;i<=n;i++)

    {

        ans = num1 + num2;
        num1 = num2;
        num2 = ans;

    }
                System.out.print(num2);
}

}
