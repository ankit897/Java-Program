package com.ankit.kunal;

public class SumOfDigits {
    public static void main(String[] args) {
        int n0 = 1234;
        System.out.println(fun(n0));
    }
    public static int fun(int n){
        if((n>=0) && (n<=9)){
            return n;
        }
        return fun(n/10)+n%10;
    }

}
