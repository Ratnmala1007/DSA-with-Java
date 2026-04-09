package com.dsa.codingblocks.stack;

import java.util.Stack;

public class ValidParanthesis {
    private static boolean isValid(String s){
        Stack <Character> st = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);

            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else if(ch==')'&& st.peek()!='('){
                    return false;
                }
                else if(ch==']'&& st.peek()!='['){
                    return false;
                }
                else if(ch=='}'&& st.peek()!='{'){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String s = "{[()]}";
        System.out.println(isValid(s));
    }
}
