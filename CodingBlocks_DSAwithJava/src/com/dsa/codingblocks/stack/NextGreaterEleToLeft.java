package com.dsa.codingblocks.stack;

import java.util.Stack;

public class NextGreaterEleToLeft {
    private static int [] nextGreaterEleToLeft(int[]arr){
        int n = arr.length;
        int[]ans = new int[n];
        Stack<Integer>stack = new Stack<>();
        for(int i = 0;i<n;i++){
            while(!stack.isEmpty() && stack.peek() < arr[i]){
                stack.pop();

            }
            ans[i] = stack.isEmpty()?-1:stack.peek();
            stack.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr = {2,1,3,4,2,0,6};
        int n = arr.length;
        int[]ans = nextGreaterEleToLeft(arr);
        for(int an:ans){
            System.out.print(an + ", ");
        }

    }
}
