package com.dsa.codingblocks.recursion.string;

public class ZeroOneKnapsack {
    private static void solve(int[] coins, int sum, int i, StringBuilder sb) {
        //base case
        System.out.println(sum+","+sb);

        int n = coins.length;

        if (sum == 0) {
            System.out.println(sb);
            return;
        }
        if (i >= n || sum < 0)
            return;

//take
        sb.append(coins[i]);
        solve(coins, sum - coins[i], i + 1, sb);
        //backtrack
        sb.deleteCharAt(sb.length()-1);

        solve(coins, sum, i + 1, sb);


    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        int[] coins ={1,4,2};
        int sum=6;
        solve(coins,sum,0,sb);

    }
    }