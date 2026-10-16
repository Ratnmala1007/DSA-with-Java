package com.dsa.javadeveloper.stackandqueue;

import java.util.Stack;

public class RemoveOuterMostParanthesis {
    public static void main(String[] args) {
        String s = " (()())(())";
        System.out.println(removeOuterParentheses(s));
    }
        public static String removeOuterParentheses(String s) {
            Stack<Character> st = new Stack<>();
            StringBuilder sb = new StringBuilder();
            for(char c : s.toCharArray()) {

                if (c == '(') {          //( ( ) ( ) ) ( ( ) )
                    if (!st.isEmpty()) {
                        sb.append(c);     // ( ) ( )  ( )
                    }
                    st.push(c);           //
                }


                else if(c==')'){
                  st.pop();
                    if(!st.isEmpty()) {
                        sb.append(c);
                    }
                }

            }
            //sb.append(depth);
            System.out.println( st.size());
            return sb.toString();
        }
    }

