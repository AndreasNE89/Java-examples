package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Main {

    public static ArrayList store = new ArrayList();
    public static ArrayList storeType = new ArrayList();

    public static void main(String[] args) {
        new multiply(10, 10);
        new divide(10, 3);
        new add(10,10);
        new sub(5,3);


        System.out.print(store + "\n");
        System.out.print(storeType + "\n");

    }

    public static class multiply{
        private final int x;
        private final int y;

        public multiply(int x, int y){
            this.x = x;
            this.y = y;
            int result = x * y;
            String multiType ="Multiplication";
            storeType.add(multiType);
            store.add(result);
            System.out.print(result + "\n");
        }

    }

    public static class divide{
        private final int x;
        private final int y;

        public divide(int x, int y){
            this.x = x;
            this.y = y;
            int div = x / y;
            String divideType ="Divition";
            storeType.add(divideType);
            store.add(div);
            System.out.print(div + "\n");
        }

    }

    public static class add{
        private final int x;
        private  final int y;

        public add(int x, int y){
            this.x = x;
            this.y = y;
            int addition = x + y;
            String addType ="Addition";
            storeType.add(addType);
            store.add(addition);
            System.out.print(addition + "\n");
        }
    }

    public static class sub{
        final private int x;
        final private int y;

        public sub(int x, int y){
            this.x = x;
            this.y = y;
            int subtra = x - y;
            String subType ="Subtract";
            storeType.add(subType);
            store.add(subtra);
            System.out.print(subtra + "\n");

        }
    }

}

