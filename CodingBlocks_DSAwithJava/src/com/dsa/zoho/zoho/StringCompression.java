package com.dsa.zoho.zoho;

//        Start count = 1
//        Compare current char with next char
//        If same → count++
//        Else → print char + count and reset count

public class StringCompression {
    public static void main(String[] args) {
        char[]chars = {'a','b','b','c','c','c','d'};
        System.out.println(compress(chars));
    }


        public static int compress(char[] chars) {

            int index = 0; // write position
            int i = 0;

            while (i < chars.length) {

                char current = chars[i];
                int count = 0;

                // count same chars
                while (i < chars.length && chars[i] == current) {
                    i++;
                    count++;
                }

                // write character
                chars[index++] = current;

                // write count if > 1
                if (count > 1) {

                    String str = String.valueOf(count);

                    for (char ch : str.toCharArray()) {
                        chars[index++] = ch;
                    }
                }
            }

            return index;
        }
    }







