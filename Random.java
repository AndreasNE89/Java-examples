package com.company;


import java.util.ArrayList;
import java.util.Random;

public class Main {
   public static Random numbers = new Random();
    public static ArrayList storeNumber = new ArrayList();


    public static void main(String[] args) {
       for (int i = 0; i <= 100; i++){
           int randomNumber = numbers.nextInt(100);
           System.out.print(randomNumber + "\n");

          if (randomNumber == 10){
              int numberTen = 0;
                  numberTen +=1;
                  System.out.print("Number 10 stored: " + numberTen + "\n");
                  System.out.print("I found the correct number: " + randomNumber + "\n");
                  storeNumber.add(numberTen);
              System.out.print(storeNumber + "\n");

           } else if (randomNumber == 20){
              int numberTwenty = 0;
              numberTwenty +=1;
              System.out.print("Number 20 stored: " + numberTwenty + "\n");
              System.out.print("I found the correct number: " + randomNumber + "\n");
              storeNumber.add(numberTwenty);
              System.out.print(storeNumber + "\n");
          }

       }
    }

}
