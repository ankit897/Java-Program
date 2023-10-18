package com.ankit.kunal;

import java.util.Arrays;

public class ArrayList {
    public static class List{
        int arr[] = new int[2];
        int idx = 0;
        int size =0;
        public void add(int ele){
            if(size == arr.length){
                int brr[]= Arrays.copyOf(arr,arr.length*2);
                arr = new int[brr.length];
                arr = Arrays.copyOf(brr,brr.length);
            }
            arr[idx] = ele;
            idx++;
            size++;

        }

    }
    public static void main(String[] args) {
        List l = new List();
        l.add(5);
        l.add(456);
        l.add(67);
        System.out.println(l.size);



    }
}
