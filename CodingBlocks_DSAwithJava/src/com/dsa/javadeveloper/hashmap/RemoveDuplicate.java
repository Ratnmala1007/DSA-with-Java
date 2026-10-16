package com.dsa.javadeveloper.hashmap;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {


            String s = "programming";

            Set<Character> seen = new HashSet<>();
            StringBuilder result = new StringBuilder();

            // Write your logic here
        for(int i =0;i< s.length();i++){
            char ch = s.charAt(i);
            if(!seen.contains(ch)){
                result = result.append(ch);
            }
            seen.add(ch);
        }

            System.out.println(result);
        }
    }

