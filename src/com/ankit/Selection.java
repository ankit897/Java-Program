package com.ankit;

import java.util.Arrays;

public class Selection {
       public static void bubble(int arr[]){
        for(int i =0;i<arr.length;i++){
            int last = arr.length-i-1;
            int max = getmax(arr,0,last);
            swap(arr,max,last);
        }
    }
    public static int getmax(int arr[], int start,int end){
        int max = start;
        for(int i =start;i<end;i++){
            if(max<arr[i]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int arr[], int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,5,6,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
