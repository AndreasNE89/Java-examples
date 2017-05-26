package com.company;


import java.util.*;

public class Main {
    static Map<String, Integer> map = new HashMap();


    public static void main(String[] args) {

        //Adding keys to map
        map.put("Andreas", 450000);
        map.put("Petter", 300000);
        map.put("Randi", 400000);
        map.put("Jostein", 200000);

        //Printing out entirety of map
        for (Map.Entry m : map.entrySet()) {
            System.out.print(" Name: " + m.getKey()  + " Salary: " + m.getValue() + "\n");

        }

        //Removing specific key
        map.remove("Andreas");
        System.out.print( "\n" +" New list after firing the expensive dude: " + ("\n"));
        for (Map.Entry m : map.entrySet()) {

            System.out.print( " Name: " + m.getKey()  + " Salary: " + m.getValue() + "\n");

        }

    }





    }









