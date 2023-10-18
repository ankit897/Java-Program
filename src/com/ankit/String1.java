package com.ankit;

public class String1 {
    public static void main(String[] args) {
        String email1 = "shashwattiwari8@gmail.com";
        String email2 = "randomAvengers@hotmail.com";
        //find the company name
        String[] a = email1.split("@");
        String[] b = email2.split("@");
        String s = a[a.length-1];
        int dotpart = s.lastIndexOf('.');
        System.out.println(s.substring(0,dotpart));

        }
    }
