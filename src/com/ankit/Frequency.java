package com.ankit;

public class Frequency {
    public static void main(String[] args) {
        int arr[] = {20, 20, 30, 30, 40};
        int frequency = 1;
        int i =1;
        while(i<arr.length){
            while(i<arr.length && arr[i]==arr[i-1]){
                frequency++;
                i++;
            }
            System.out.println(arr[i-1]+" "+frequency);
            frequency=1;
            i++;
        }
        if(arr[i-1]!=arr[i-2]){
            System.out.println(arr[i-1]+" "+frequency);
        }

    }
}
