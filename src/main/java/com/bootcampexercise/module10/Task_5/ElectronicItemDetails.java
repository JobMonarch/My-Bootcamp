package com.bootcampexercise.module10.Task_5;

import java.util.HashMap;

public class ElectronicItemDetails {
    HashMap<String, Double> itemHashMap = new HashMap<String, Double>();

    public double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name) {
        return itemHashMap.get(name);
    }

    public static void main(String[] args) {
        ElectronicItemDetails electronicItemDetails = new ElectronicItemDetails();

        electronicItemDetails.itemHashMap.put("TV", 759.99);
        electronicItemDetails.itemHashMap.put("Fridge", 1599.99);
        electronicItemDetails.itemHashMap.put("Washing Machine", 499.99);
        electronicItemDetails.itemHashMap.put("PC", 1999.99);

        System.out.println("Price of TV is " + electronicItemDetails.returnPriceOfItem(electronicItemDetails.itemHashMap, "TV"));
    }
}