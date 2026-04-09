package com.dsa.codingblocks.recursion.string;

import java.util.Scanner;

public class Paranthesis {

        static void solve(int open, int close, int n, String ans) {
            // Base case: when we have a complete sequence
            if (ans.length() == 2 * n) {
                System.out.println(ans); // Each sequence on a new line
                return;
            }

            // If we can still add '(', do it first (to ensure lexicographical order)
            if (open < n) {
                solve(open + 1, close, n, ans + "(");
            }

            // If we can add ')', do it (only if it balances with open)
            if (close < open) {
                solve(open, close + 1, n, ans + ")");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); // Number of pairs of parentheses
            solve(0, 0, n, "");
        }
    }

