package com.dsa.dailycode.day44_2026_06_27;

public class CountVowelCons {
    public static void main(String[] args) {
        String s= "Hi,I am a Java developer";

        int vowel = 0;
        int consonant = 0;

        for(int i =0;i < s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vowel++;
            }
            else if(s.charAt(i) >'a'||s.charAt(i)<'z'){
                consonant++;
            }

        }
        System.out.println("vowel:"+ vowel );
        System.out.println("consonant:"+consonant);
    }
}
