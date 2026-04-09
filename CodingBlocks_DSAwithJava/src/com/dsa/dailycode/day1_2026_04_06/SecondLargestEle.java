package com.dsa.dailycode.day1_2026_04_06;

public class SecondLargestEle {
    public static void main(String[] args) {
        int []arr={8,7,9,5};
        SecondLargestEle.secondLargest(arr);
      //int result =secondLargest(arr);

        //System.out.println(secondLargest(arr));
    }
    private static int secondLargest(int []arr) {
        int secondLargest = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        //int n = arr.length ;
        for (int num : arr) {
            if (num > max) {
                secondLargest = max;
                max=num;
            } else if (num > secondLargest && num !=  max) {
                secondLargest =num;
            }

        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(secondLargest);}
        if(secondLargest==Integer.MIN_VALUE){
            System.out.println("No second largest");
        }
        else{
            System.out.println(secondLargest);}
       return  secondLargest;


    }
}
