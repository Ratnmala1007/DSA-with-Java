package com.dsa.javadeveloper.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FirstNonReapeating {


    public static void main(String[] args) {
        String s = "Java";
        System.out.println(nonReapeating(s));
    }

    public  static Character nonReapeating(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
           // if (!map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                // Update the frequency of ch here

}
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(map.get(ch)==1){
    return ch;
}

        }
       return '\0';
    }
}


