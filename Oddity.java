import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Andreas on 04.06.2017.
 */
public class Oddity {
    private static ArrayList storeNames = new ArrayList();
    private static ArrayList newList = new ArrayList();

    public static void main(String [] args) {
        //Adds more people to ArrayList
        new people();
        System.out.print("Objects stored in List: " + "\n" + storeNames.size() + "\n");
    }

        private static class people {

                public people(){
                    //Scanner in for text input
                    Scanner addName = new Scanner(System.in);
                    Scanner addNumber = new Scanner(System.in);
                    Scanner addTitle = new Scanner(System.in);

                    System.out.println("Add person name: ");
                    String name = addName.nextLine();

                    System.out.print("Add person age: ");
                    int age = addNumber.nextInt();

                    System.out.print("Add job title: ");
                    String title = addTitle.nextLine();
                    String person = " Name: " + name + "\n" + " Age: " + age + "\n" + " Job title: " + title + "\n" + "\n";

                    //Check amount of people stored in list
                    storeNames.add("\n" + "This ArrayList contains: " + " \n" + person);

                    //Add more people
                    System.out.print(person);
                    Scanner addMore = new Scanner(System.in);
                    System.out.print("Would you like to add more people? ");
                    String answer = addMore.nextLine();

                    //Yes will add more people, anything else will close program
                    if (answer.equals("Yes")){
                        System.out.print("\n" + "There are currently: " + storeNames.size() + " People stored in this list " + "\n");
                        askAgain();
                    } else {
                        addMore.close();
                    }

                }
        }
        //Allows for adding more people
        private static void askAgain(){
        new people();

        }

    }




