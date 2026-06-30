package com.dsa.zoho;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {


        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
        private static int maxProfit(int[]prices){
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int price : prices) {

            if (price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
return maxProfit;
    }

}