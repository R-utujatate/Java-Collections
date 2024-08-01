package com.java.collections.arraylist;
/*
remove()
removeAll()
clear()
 */

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsArrayList {
    public static void main(String[] args) {
        List<String>fruits =new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Pineapple");
        System.out.println(fruits);

        fruits.remove(2);
        System.out.println("After removing the element at 2nd index: "+fruits);

        fruits.remove("Pineapple");
        System.out.println("After removing the another object :"+fruits);

        //remove all the elements that exist in a given collection
        List<String>subfruitslist = new ArrayList<>();
        subfruitslist.add("Apple");
        subfruitslist.add("Banana");
        fruits.removeAll(subfruitslist);
        System.out.println(fruits);

        fruits.clear();
        System.out.println(fruits);

    }
}
