package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
        private static boolean isCounting = false;
        private static boolean foundNumber = false;
        private static Random counter = new Random();
        private static ArrayList storage = new ArrayList();
        private static ArrayList storeOther = new ArrayList();
        private static int storageNumber = storage.size();
        private static int storeWrongNumbers = storeOther.size();

    public static void main(String[] args) {
	    search();
        System.out.print("\n" + "Number 10 found: " + storageNumber  + "\n");
        System.out.print("Other numbers found: " + storeWrongNumbers  + "\n"  );

    }

    public static void search(){
        for (int i = 1; i <= 100; i ++){
             int getRandom = counter.nextInt(100);

            if (getRandom == 10){
                foundNumber = true;
                storage.add(getRandom);
                storageNumber +=1;


            }else if(getRandom != 10){
                foundNumber = false;
                storeOther.add(getRandom);
                storeWrongNumbers +=1;
                System.out.print("This is not the number " + getRandom + "\n" );

            }
        }
        }

    }

