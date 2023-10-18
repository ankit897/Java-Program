package com.ankit;

public class Armstrong {
        public static int arms(int n){
            if(n==0){
                return 0;
            }
            return arms(n/10)+(n%10)*(n%10)*(n%10);
        }

        public static void main(String[] args) {
            int num = 3714;
            int arms1 = arms(num);
            if(arms1==num){
                System.out.println("true");
            }
            else
                System.out.println("false");
        }
    }

