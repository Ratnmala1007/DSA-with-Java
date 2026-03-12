package com.dsa.codingblocks.recursion.string;

public class StaireClimbing {



        public static void ways(int n, String path) {

            if (n == 0) {
                System.out.println(path);
                return;
            }

            if (n < 0) {
                return;
            }

            ways(n - 1, path + "1 ");
            ways(n - 2, path + "2 ");
            ways(n - 3, path + "3 ");

        }

        public static void main(String[] args) {
            ways(4, "");
        }
    }