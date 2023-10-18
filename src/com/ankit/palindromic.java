package com.ankit;
public class palindromic {
    public static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        return(s.charAt(start)==s.charAt(end)&& isPalindrome(s,start+1,end-1));
        }
        public static void main (String[]args){
            String str = "abcdba";

            System.out.println(isPalindrome(str,0,str.length()-1));
        }
    }
