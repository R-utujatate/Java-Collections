package com.java.collection.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        //List allows you to add duplicate elements
        list.add("Rutuja");
        list.add("Rajashri");
        list.add("Rutuja");
        list.add("Rajashri");
        System.out.println(list);

        //List allows you to add null elements
        list.add(null);
        list.add("Kishori");
        list.add(null);
        System.out.println(list);

        //maintain insertion order
        List<Integer>number=new ArrayList<>();
        number.add(10);
        number.add(30);
        number.add(50);
        number.add(40);
        System.out.println(number);

        //Access elements from the list
        System.out.println(list.get(0));
        System.out.println(list.get(5));
        System.out.println(number.get(2));
        System.out.println(number.get(0));



    }
}
