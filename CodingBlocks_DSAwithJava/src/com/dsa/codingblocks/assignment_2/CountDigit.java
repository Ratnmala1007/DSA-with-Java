package com.dsa.codingblocks.assignment_2;

public class CountDigit {
        public static int countDigit(int num,int digit){
            int count = 0;

            while(num>0){
                int lastDigit = num % 10;

                if(lastDigit == digit){
                    count++;
                }
                num = num/10;
            }
            return count;
        }
        public static void main(String args[]) {
//            Scanner sc = new Scanner(System.in);
//            int num = sc.nextInt();
//            int digit = sc.nextInt();

            int result=CountDigit.countDigit(4737, 7);
            System.out.println(result);

        }

        }


