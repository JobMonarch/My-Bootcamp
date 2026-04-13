package com.bootcampexercise.module8.Task_5;

import java.util.*;

public class CollectionLearn {

    ArrayList<String> list = new ArrayList<>();//array list collection
    HashSet<String> set = new HashSet<>();//hashset collection
    HashMap<Integer, String> map = new HashMap<>();//hashmap collection

    public static void main(String[] args) {

        CollectionLearn obj = new CollectionLearn();

        for (int i = 1; i <= 10; i++) {//initial 10 values
            obj.addValues(i, "Value" + i);
        }

        System.out.println("Initial Collections:");
        obj.printAll();

        System.out.println("\nAdding duplicate:"); //adds duplicate values
        obj.addValues(1, "Value1");

        System.out.println("\nAdding new value:"); //adds new values
        obj.addValues(11, "Value11");
        obj.printAll();

        System.out.println("\nRemoving values:"); //removes value 2
        obj.removeValues(2, "Value2");
        obj.printAll();

        System.out.println("\nReplacing values:"); //replaces value 3
        obj.replaceValues(3, "Value3", "ReplacedValue3");
        obj.printAll();
    }

    public void addValues(int key, String value) { // No duplicates value adding

        if (!list.contains(value)) { //Checks the list for already existing values
            list.add(value);
        } else {
            System.out.println("Duplicate in List not allowed: " + value); //'Error' message
        }

        if (!set.add(value)) { //set check
            System.out.println("Duplicate in Set not allowed: " + value); //'Error' message for duplicate
        }

        if (!map.containsKey(key) && !map.containsValue(value)) { //Checks map for both key and value
            map.put(key, value);
        } else {
            System.out.println("Duplicate in Map is not allowed: key=" + key + " value=" + value);
        }
    }

    public void removeValues(int key, String value) { // Value remover
        list.remove(value);
        set.remove(value);
        map.remove(key);
    }

    public void replaceValues(int key, String oldValue, String newValue) { //No duplicates value replacer

        if (!list.contains(newValue)) {//the new list
            int index = list.indexOf(oldValue);
            if (index != -1) {
                list.set(index, newValue);
            }
        } else {
            System.out.println("Duplicate replacement in List not allowed: " + newValue);
        }

        if (set.contains(oldValue) && !set.contains(newValue)) {//the new set
            set.remove(oldValue);
            set.add(newValue);
        } else {
            System.out.println("Duplicate replacement in Set not allowed: " + newValue);
        }

        if (map.containsKey(key) && !map.containsValue(newValue)) { //the new map
            map.put(key, newValue);
        } else {
            System.out.println("Duplicate replacement in Map not allowed: " + newValue);
        }
    }

    public void printAll() { //prints all collections

        System.out.println("\nArrayList:"); //prints array list
        for (String val : list) {
            System.out.println(val);
        }

        System.out.println("\nHashSet:"); //prints hash set
        for (String val : set) {
            System.out.println(val);
        }

        System.out.println("\nHashMap:"); //prints hash map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}