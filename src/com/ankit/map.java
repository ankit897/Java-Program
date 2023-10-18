package com.ankit;
import java.util.*;

public class map {
    static void hash() {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Akash", 21);
        hm.put("Ankit",23);
        System.out.println(hm.get("Ankit"));
    }

    public static void main(String[] args) {
        map m = new map();
        m.hash();
    }

}
