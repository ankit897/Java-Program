package com.ankit;

public class ascii {
    public static void main(String[] args) {
        String s = "abcd";
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            int ascii = (int) ch;
            System.out.println(ascii);
        }
    }
}
