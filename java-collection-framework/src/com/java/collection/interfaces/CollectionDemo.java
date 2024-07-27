package com.java.collection.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        //Created collection object
        Collection<String> fruitCollection=new ArrayList<>();

        //add() method to add new elements to the collection
        fruitCollection.add("Banana");
        fruitCollection.add("Apple");
        fruitCollection.add("Mango");
        System.out.println(fruitCollection);

        //remove() to remove any element from the collection
        fruitCollection.remove("Banana");
        System.out.println(fruitCollection);

        /*contains() method checks is the element present
        is present in the collection or not
         */
        System.out.println(fruitCollection.contains("Apple"));

        /*
        forEach() method displays all the present
         elements in the collection
         */

        fruitCollection.forEach((element) -> {
            System.out.println(element);
        });

        //clear() method clears all the elements in the collection
        fruitCollection.clear();
        System.out.println(fruitCollection);


    }
}
