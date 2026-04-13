package com.bootcampexercise.module8.Task_3;

import java.util.HashMap;
import java.util.Map;

public class MapActivity {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();//created hashMap key is id, value is name

        map.put("1", "Yusuf");
        map.put("2", "Pearson");
        map.put("3", "Sean");
        map.put("4", "Shawn");

        MapActivity obj = new MapActivity(); //calls the print method created below
        obj.print(map);
    }

    void print(Map map) {

        for (Object key : map.keySet()) {
            System.out.println("Key: " + key + " Value: " + map.get(key)); //prints the map with key and value pairs
        }
    }
}