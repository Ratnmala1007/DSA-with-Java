package com.dsa.practice.selfBuildLogic.array;

public class EvenOddInArr {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int[]result = findEvenOdd(arr);
        System.out.println(result[1]);
        System.out.println(result[0]);
    }
    public static int[] findEvenOdd(int[] arr) {
        int even = 0;
        int odd = 0;
        //for (int i = 0; i < arr.length; i++) {
            for(int num:arr){
            if (num % 2 == 0) {
                System.out.println("Even: " + num);

                even++;
            } else {
                System.out.println("Odd: " + num);

                odd++;
            }

        }
        return new int[]{even, odd};

    }
}
