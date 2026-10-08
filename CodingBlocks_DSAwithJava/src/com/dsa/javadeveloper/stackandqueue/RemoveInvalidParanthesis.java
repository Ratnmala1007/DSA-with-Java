package com.dsa.javadeveloper.stackandqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoveInvalidParanthesis {
    public static void main(String[] args) {
String s = "()())()";
        System.out.println(removeInvalidParentheses(s));
    }
    public static List<String> removeInvalidParentheses(String s) {
        Stack<Character> st = new Stack<>();
        List<String> ans = new ArrayList<>();

        for(char c : s.toCharArray())
        {
            if(c=='('){
                st.push(c);
            }
            else {
                if(!st.isEmpty()&& st.peek()=='('){
                   st.pop();
                }
                else{
                    st.push(c);
                }
            }
        }
return ans ;
    }
}