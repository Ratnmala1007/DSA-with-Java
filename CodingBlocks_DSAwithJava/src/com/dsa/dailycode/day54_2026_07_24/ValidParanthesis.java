package com.dsa.dailycode.day54_2026_07_24;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s= "()[]{}";
        System.out.println(isValid(s));
    }
        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for(int i =0;i < s.length();i++) {
                char ch = s.charAt(i);


                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }

                    char top = stack.pop();


                    if (ch == ')' && top != '(' || ch == '}' && top != '{' || ch == ']' && top != '[') {
                        return false;

                    }

                }
            }
            return stack.isEmpty();
        }
    }

