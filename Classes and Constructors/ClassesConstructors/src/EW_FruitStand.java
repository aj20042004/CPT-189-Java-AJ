/*
----------------------------------------------------------------------------------------------------------
    Name:	EW_FruitStand
    Author:	Edward V. Weber
    Language:	Java
    Date:	2023-08-05
    Purpose:	The purpose of this program is to be the DRIVER program to be run to create and manipulate
                multiple instances of Fruit objects. 
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    EVW		2023-08-05	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/
import java.util.Scanner;

public class EW_FruitStand {

    public static Scanner scnKbd = new Scanner(System.in);   // defined outside of the methods to be reusable

    public static void main(String[] args) {
        /*
         * First build some basic objects using different constructor methods
         */
        System.out.println("Welcome to our fruit stand!");
        waitForUser();                               // calls the single method so we don't duplicate code
        EW_Fruit frtFruit1 = new EW_Fruit();                     // creates a basic - generic fruit;
        EW_Fruit frtFruit2 = new EW_Fruit("Apple");   // creates fruit with a known name;
        EW_Fruit frtFruit3 = new EW_Fruit("Banana","Green");     // uses a different constructor;
        System.out.println("Here are the first three fruit objects as they were added:");
        System.out.println(frtFruit1);  // It's going to use toString() function from EW_Fruit
        System.out.println(frtFruit2);
        System.out.println(frtFruit3);
        waitForUser();
        /*
         * Next, use some mutator methods to update the objects
         */
        System.out.println("Next, we will use the mutator methods to update our fruit objects...");
        frtFruit1.setFruitName("Peach");
        frtFruit1.setFruitColor("Orange");
        frtFruit1.setFruitWeight(7.5f);
        frtFruit1.setPeelNeeded(false);
        System.out.println("After updating fruit #1, here is what it looks like now:");
        System.out.println(frtFruit1);
        frtFruit2.setFruitColor("Red");
        frtFruit2.setFruitWeight(9.25f);
        frtFruit2.setPeelNeeded(false);
        System.out.println("After updating fruit #2, here is what it looks like now:");
        System.out.println(frtFruit2);
        frtFruit3.setFruitColor("Yellow");
        frtFruit3.setFruitWeight(4.33f);
        frtFruit3.setPeelNeeded(true);
        System.out.println("After updating fruit #3, here is what it looks like now:");
        System.out.println(frtFruit3);
        waitForUser();
        /*
         * Finally, use some accessor methods to get individual properties from the objects
         */
        System.out.println("Finally, let's imagine that a customer wants to know how much\n" +
                "weight all three pieces of fruit will be in her bag when she buys them all:");
        System.out.println("The weight of the " + frtFruit1.getFruitColor() + " " +
                frtFruit1.getFruitName() + " is " + frtFruit1.getFruitWeight() + " ounces.");                
        System.out.println("The weight of the " + frtFruit2.getFruitColor() + " " +
                frtFruit2.getFruitName() + " is " + frtFruit2.getFruitWeight() + " ounces.");                
        System.out.println("The weight of the " + frtFruit3.getFruitColor() + " " +
                frtFruit3.getFruitName() + " is " + frtFruit3.getFruitWeight() + " ounces.");
        System.out.println("So, all together, the three pieces of fruit weigh " + 
                (frtFruit1.getFruitWeight() + frtFruit2.getFruitWeight() + frtFruit3.getFruitWeight()) + " ounces.");
    }
    
    public static void waitForUser(){
        System.out.println("-".repeat(80));
        System.out.println("Press [the enter key] to continue...");
        scnKbd.nextLine();
    }
    
}
