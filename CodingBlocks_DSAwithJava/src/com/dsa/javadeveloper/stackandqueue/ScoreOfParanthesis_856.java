package com.dsa.javadeveloper.stackandqueue;

import java.util.Stack;

public class ScoreOfParanthesis_856 {
    public static void main(String[] args) {
        String s = "(( )(( )))";
        System.out.println(scoreOfParentheses(s));
    }

    public static int scoreOfParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int score =0;
        for(int i =0;i<s.length();i++) {
            char c = s.charAt(i);

            if (!st.isEmpty()) {
                if (c == ')' && st.peek() == '(') {
                    //if (c == ')' && st.peek() == '(') {
                    score++;
                    // st.pop();

                } }else {
                    st.push(c);
                }
            }

        return score;
    }
}
