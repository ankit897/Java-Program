package com.ankit;

public class LSRecursion {
    public static void main(String[] args) {
        int arr[] = {3,4,56,78,6};
        int target = 56;
        System.out.println(Ls(arr,target,0));
    }
    public static boolean Ls(int arr[], int target, int i){
        if(i== arr.length){
            return false;
        }
           if(arr[i]==target){
               return true;
           }
        return Ls(arr,target,i+1);
    }
}
