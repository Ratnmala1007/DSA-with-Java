package com.dsa.assignment.assignment_2;

import java.util.Scanner;

public class ReplaceNum1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String n = sc.nextLine();   // read as String
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < n.length(); i++) {
                char ch = n.charAt(i);

                if (ch == '0') {
                    result.append('5');
                } else {
                    result.append(ch);
                }
            }

            System.out.println(result.toString());
        }
    }



