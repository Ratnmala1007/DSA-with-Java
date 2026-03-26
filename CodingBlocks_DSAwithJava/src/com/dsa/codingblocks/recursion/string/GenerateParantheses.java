package com.dsa.codingblocks.recursion.string;

public class GenerateParantheses {

        static void solve(int open, int close, int n, String ans) {

            // base case
            if (ans.length() == 2 * n) {
                System.out.println(ans);
                return;
            }

            // add '('
            if (open < n) {
                solve(open + 1, close, n, ans + "(");
            }

            // add ')'
            if (close < open) {
                solve(open, close + 1, n, ans + ")");
            }
        }

        public static void main(String[] args) {

            int n = 3;
            solve(0, 0, n, "");
        }
    }

