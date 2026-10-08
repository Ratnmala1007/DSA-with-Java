package com.dsa.leetcode.slidingWindow;

public class MaximumPointsYouCanObtainfromCards_1423 {
    public static void main(String[] args) {
        int[] cardPoints = {1,2,3,4,5,6,1};
        int k = 3;
        System.out.println(maxScore(cardPoints, k));
    }

    public static int maxScore(int[] cardPoints, int k) {
        int maxscore = 0;

        int right =cardPoints.length-1;
        int sum =0;
        for(int left = 0;left< k; left++) {
            sum += cardPoints[left];

        }
        maxscore =sum;
        for (int left = k-1;left >=0; left--) {
            sum = sum - cardPoints[left];
            sum = sum + cardPoints[right];

            maxscore = Math.max(sum, maxscore);
            right--;
        }
        return maxscore;
    }
}