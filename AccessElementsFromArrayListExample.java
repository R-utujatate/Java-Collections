package com.java.collections.arraylist;
/*
How to check if an Arraylist is empty using the isEmpty() method.
How to find the size of an Arraylist using the size() method.
How to access the element at a particular index in an Arraylist using the get() method.
How to modify the element at a particular index in an Arraylist using the set() method.
 */

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String>topProgrammingLanguages = new ArrayList<>();
        System.out.println("Is the topProgrammingLanguages list empty? : "
                + topProgrammingLanguages.isEmpty());
        topProgrammingLanguages.add("C");
        topProgrammingLanguages.add("C#");
        topProgrammingLanguages.add("Java");
        topProgrammingLanguages.add("NodeJS");
        topProgrammingLanguages.add("Python");

        System.out.println("Here are the top "+topProgrammingLanguages.size()+" programming languages in the world");

        //Retrieve elements at the given index
        String bestProgrammingLanguage = topProgrammingLanguages.get(3);
        System.out.println("BestProgramming Language -> "+bestProgrammingLanguage);
        String secondProgrammingLanguage = topProgrammingLanguages.get(2);
        System.out.println("Second Best Programming language -> "+secondProgrammingLanguage);

        //Modify elements at a given index
        topProgrammingLanguages.set(0,"Java Script");
        topProgrammingLanguages.set(1,"SQL");
        System.out.println(topProgrammingLanguages);









    }
}
