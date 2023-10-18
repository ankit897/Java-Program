package com.ankit;

public class Main {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("physics");
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            s.setCharAt(i,s.charAt(j));
            s.setCharAt(j, s.charAt(i));
            i++;
            j--;
        }
        System.out.print(s);

    }
}
