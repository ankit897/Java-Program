package com.ankit.pattern;

public class pattern6 {
        public static void main(String[] args) {
            int n = 5;
            int totalrows;
            for(int i =0;i<2*n;i++){
                if(i>n){
                    totalrows = 2*n-i-1;
                }
                else{
                    totalrows = i;
                }
                for(int space =0;space<n-totalrows;space++){
                    System.out.print(" ");
                }
                for(int col = 0;col<totalrows;col++){
                    System.out.print("*"+" " );
                }
                System.out.println();
            }
        }
    }
