package com.bootcampexercise.module8.Task_1;

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

    public static void main(String[] args) {

        //Creates names list using ArrayList
        List<String> names = new ArrayList<>();
        names.add("SpongeBob");
        names.add("Shorty");
        names.add("IceCube");
        names.add("Manny");
        print(names);//Calls print method we created instead of system out print
    }

    static void print(List list) { //our print method

        for (Object name : list) { //prints the list
            System.out.println(name);
        }
    }
}
