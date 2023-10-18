package com.ankit;
import java.util.*;
public class Hash {
    public static void main(String[] args) {
        int arr[] = {1,1,3,4,1};
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i= 0;i<arr.length;i++){
            if(!freq.containsKey(arr[i])){
                freq.put(arr[i],1);
            }
            else{
                freq.put(arr[i],freq.get(arr[i])+1);
            }
        }
        System.out.println(freq.entrySet());
        int max = 0;
        int anskey = -1;
        for(var key:freq.entrySet()){
            if(key.getValue()>max){
                max = key.getValue();
                anskey = key.getKey();
            }
        }
        System.out.println(anskey);
    }
}
