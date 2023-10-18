package com.ankit.pattern;

public class pattern9 {
    public static void main(String[] args) {
        int n = 5;
        int original = n;
        n = 2*n;
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                int AteveryIndex = original-Math.min(Math.min(i,j),Math.min((n-i),(n-j)));
                System.out.print(AteveryIndex+" ");
            }
            System.out.println();
        }
    }
}
