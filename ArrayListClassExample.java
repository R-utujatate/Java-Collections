package com.java.collections.arraylist;
/*
  How to create an Arraylist using the Arraylist() constructor
  And new elements to an Arraylist using the add() method
*/

import java.util.ArrayList;
import java.util.List;

public class ArrayListClassExample {
    public static void main(String[] args) {
        //we can assign the size to the arraylist also as given below
        //   List<String> cars = new ArrayList<>(25);

        List<String> cars = new ArrayList<>();
        cars.add("XUV700");
        cars.add("BMW");
        cars.add("Range Rover");
        cars.add("Swift");
        cars.add("Marcadies");
        cars.add("Thar");

        System.out.println(cars);


    }

}
