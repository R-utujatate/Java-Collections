package com.java.collections.arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysToIterateOverTheList {
    public static void main(String[] args) {
        List<String>states= Arrays.asList("Maharashtra","Goa","Punjab","Gujarat");
        //basic for loop
        for(int i=0;i<states.size();i++)
        {
            System.out.println(states.get(i));
        }

        //Enhanced for each loop
        for(String state: states){
            System.out.println(state);
        }

        //Basic loop with iterator
        for(Iterator iterator= states.iterator(); iterator.hasNext();){
            String state = (String) iterator.next();
            System.out.println(state);
        }

        //iterator with while loop
        Iterator<String> iterator= states.iterator();
        while (iterator.hasNext()){
            String state= (String) iterator.next();
            System.out.println(state);
        }

        //stream + lambda example
        states.stream().forEach(state -> System.out.println(states));

       //forEach + lambda
        states.forEach((state) -> System.out.println(state));




    }
}
