package com.ankit.pattern;

public class Pattern8 {
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
            for(int col = totalrows;col>=1;col--){
                System.out.print(col);
            }
            for(int col = 2;col<=totalrows;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
