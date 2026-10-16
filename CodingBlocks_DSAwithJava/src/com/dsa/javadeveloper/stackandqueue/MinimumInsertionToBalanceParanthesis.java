package com.dsa.javadeveloper.stackandqueue;

import java.util.Stack;

public class MinimumInsertionToBalanceParanthesis {
    public static void main(String[] args) {
String s = "(()))";
        System.out.println(minInsertions(s));

    }
        public static int minInsertions(String s) {
            Stack<Character> st =new Stack<>();
            int paranthesis = 0;
            for(char c : s.toCharArray()){
                if(c=='('){

                    st.push(c);
                    // paranthesis++;
                }
                else{
                    paranthesis++;
                    if(!st.isEmpty() && paranthesis > 2){
                  st.pop();
                    }
                       //(()))

                }
            }
return st.size();
        }

}
