/*
----------------------------------------------------------------------------------------------------------
    Name:	EW_RestockFruitStand
    Author:	Edward V. Weber
    Language:	Java
    Date:	2023-09-22
    Purpose:	The purpose of this program is to demonstrate the program flow using 
                the while iterator and also the if/then/else constructs.  Comparison 
                operators and methods will be reviewed as well.  Also, the concept of
                breaks and sentinels will be covered.

                The program will suppose a crate of fruit has arrived and we will be
                restocking the fruit stand with fruit from the crate.  We can only take a 
                maximum of 10 fruits, but the crate might have between 5 and 15 fruits
                to choose from.  We don't know the exact count in the crate (random number).

                When we go to restock the fruit stand, we will need to keep taking fruit
                until one of two conditions become true:  either the crate runs out of fruit
                or we have taken 10 new fruits... whichever happens first.  We will be reaching
                our hand into the crate without looking so we will be getting 'random' fruits.
                Our program then will need to fill in the rest of the information about the fruit.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    EVW		2023-09-22	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

import java.util.Random;
import java.util.Scanner;

public class EW_RestockFruitStand {

    static Scanner scnKbd = new Scanner(System.in);    // used in multiple methods
    static boolean blnCrateStillHasFruit = true; // condition to be tested in the loop
    static final int MAXFRUITS = 10;            // set the other condition to be tested
    static int intFruitsRestocked = 0;          // count fruits restocked
    static EW_Fruit frtFruit01, frtFruit02, frtFruit03, frtFruit04,
            frtFruit05, frtFruit06, frtFruit07, frtFruit08,
            frtFruit09, frtFruit10;             // defined 10 possible fruits
    static Random rndGenerator = new Random();         // used in multiple methods
    static int intFruitInCrate = rndGenerator.nextInt(5, 11);  // we don't know!


    public static void main(String[] args) {
        System.out.println("Welcome to the restocking of our fruit stand!");
        System.out.println("\nWe will be restocking the fruit stand by selecting up to 10");
        System.out.println("  random pieces of fruit from the fruit-truck crate.");
        System.out.println("  The fruit truck crate has an unknown (random) number of");
        System.out.println("  pieces of fruit between 5 and 15 pieces... so, although");
        System.out.println("  we *want* 10 pieces, the crate may run out before we get as");
        System.out.println("  many as we want.");
        System.out.println("\nThe actual number of fruit in the crate is " + intFruitInCrate + ".");
        System.out.println("\nWhen we select the fruit, we will be reaching in blindly");
        System.out.println("  (randomly) and picking a piece of fruit.  Then, the program");
        System.out.println("  will use random numbers to determine the type of fruit, the");
        System.out.println("  color of the fruit, and the weight of the fruit.");
        System.out.println("\nOnce the fruit has been determined, then the fruit will be");
        System.out.println("  placed into the fruit stand in its designated spot.");
        waitForUser();

        while ((blnCrateStillHasFruit) &&   // two conditions being tested - notice the
                (intFruitsRestocked < MAXFRUITS)){   // parenthesis and the && operator
            selectNextRandomFruit();        // just call this routine each time.
            intFruitInCrate--;              // decrement because we just took one
            if(intFruitInCrate <= 0){
                blnCrateStillHasFruit = false;  // change this sentinel
            }
        }
        System.out.println("\nThe Fruit Stand has been restocked.");
    }



    public static void selectNextRandomFruit(){
        /*
         * This method builds a new 'random' fruit by reaching into the crate
         * blindly and pulling out a fruit.  It demonstrates if/then/else logic to
         * set the values for this random fruit.
         */
        EW_Fruit frtRandomFruit = new EW_Fruit();   // use the blank constructor
        int intRandFruitNumber = rndGenerator.nextInt(1,5);  // random fruit number 1-4
        if(intRandFruitNumber == 1){
            // a random fruit number of 1 is an Apple
            frtRandomFruit.setFruitName("Apple");
            int intRandomAppleColor = rndGenerator.nextInt(3);
            if(intRandomAppleColor==0){
                frtRandomFruit.setFruitColor("Red");
            } else if(intRandomAppleColor==1){
                frtRandomFruit.setFruitColor("Green");
            } else {
                frtRandomFruit.setFruitColor("Yellow");
            }
            frtRandomFruit.setFruitWeight(rndGenerator.nextFloat(4.0f,8.5f));
            frtRandomFruit.setPeelNeeded(false);
        } else if(intRandFruitNumber == 2){
            // a random fruit number of 2 is an Orange
            frtRandomFruit.setFruitName("Orange");
            frtRandomFruit.setFruitColor("Orange");
            frtRandomFruit.setFruitWeight(rndGenerator.nextFloat(4.0f,8.5f));
            frtRandomFruit.setPeelNeeded(true);
        } else if(intRandFruitNumber == 3){
            // a random fruit number of 3 is an Peach
            frtRandomFruit.setFruitName("Peach");
            int intRandomPeachColor = rndGenerator.nextInt(2);
            if(intRandomPeachColor==0){
                frtRandomFruit.setFruitColor("Yellow");
            } else {
                frtRandomFruit.setFruitColor("White");
            }
            frtRandomFruit.setFruitWeight(rndGenerator.nextFloat(4.0f,8.5f));
            frtRandomFruit.setPeelNeeded(false);
        } else if(intRandFruitNumber == 4){
            // a random fruit number of 4 is an Banana
            frtRandomFruit.setFruitName("Banana");
            int intRandomBananaColor = rndGenerator.nextInt(3);
            if(intRandomBananaColor==0){
                frtRandomFruit.setFruitColor("Yellow");
            } else if(intRandomBananaColor==1){
                frtRandomFruit.setFruitColor("Green");
            } else {
                frtRandomFruit.setFruitColor("Brown");
            }
            frtRandomFruit.setFruitWeight(rndGenerator.nextFloat(3.0f,7.0f));
            frtRandomFruit.setPeelNeeded(true);
        }
        intFruitsRestocked++;       // increment the number of fruit being restocked
        /*
         * Now, we will place the new fruit in it's designated spot in our fruit stand.
         * In a week or so, we will be going over Arrays which make this code a lot 
         * simpler.  But for now, it will be used to help us understand more if/then/else
         * logic.
         */
        if(intFruitsRestocked == 1){
            // This will be frtFruit01
            frtFruit01 = frtRandomFruit;
            System.out.println("\nThe fruit placed in position # " + intFruitsRestocked +
                " in the Fruit Stand is:");
            System.out.println(frtFruit01);
        } else if(intFruitsRestocked == 2){
            // This will be frtFruit02
            frtFruit02 = frtRandomFruit;
            System.out.println("\nThe fruit placed in position # " + intFruitsRestocked +
                " in the Fruit Stand is:");
            System.out.println(frtFruit02);
        } else if(intFruitsRestocked == 3){
            // This will be frtFruit03
            frtFruit03 = frtRandomFruit;
            System.out.println("\nThe fruit placed in position # " + intFruitsRestocked +
                " in the Fruit Stand is:");
            System.out.println(frtFruit03);
        } else if(intFruitsRestocked == 4){
            // This will be frtFruit04
            frtFruit04 = frtRandomFruit;
            System.out.println("\nThe fruit placed in position # " + intFruitsRestocked +
                " in the Fruit Stand is:");
            System.out.println(frtFruit04);
        } else if(intFruitsRestocked == 5){
            // This will be frtFruit05
            frtFruit05 = frtRandomFruit;
            System.out.println("\nThe fruit placed in position # " + intFruitsRestocked +
                " in the Fruit Stand is:");
            System.out.println(frtFruit05);
        } else if(intFruitsRestocked == 6){
            // This will be frtFruit06
            frtFruit06 = frtRandomFruit;
            System.out.println("\nThe fruit placed in position # " + intFruitsRestocked +
                " in the Fruit Stand is:");
            System.out.println(frtFruit06);
        } else if(intFruitsRestocked == 7){
            // This will be frtFruit07
            frtFruit07 = frtRandomFruit;
            System.out.println("\nThe fruit placed in position # " + intFruitsRestocked +
                " in the Fruit Stand is:");
            System.out.println(frtFruit07);
        } else if(intFruitsRestocked == 8){
            // This will be frtFruit08
            frtFruit08 = frtRandomFruit;
            System.out.println("\nThe fruit placed in position # " + intFruitsRestocked +
                " in the Fruit Stand is:");
            System.out.println(frtFruit08);
        } else if(intFruitsRestocked == 9){
            // This will be frtFruit09
            frtFruit09 = frtRandomFruit;
            System.out.println("\nThe fruit placed in position # " + intFruitsRestocked +
                " in the Fruit Stand is:");
            System.out.println(frtFruit09);
        } else {
            // This will be frtFruit10
            frtFruit10 = frtRandomFruit;
            System.out.println("\nThe fruit placed in position # " + intFruitsRestocked +
                " in the Fruit Stand is:");
            System.out.println(frtFruit10);
        }
        waitForUser();
    }


    public static void waitForUser(){
        System.out.println("-".repeat(70));
        System.out.print("Press the [Enter Key] to continue...");
        scnKbd.nextLine();
    }

    
}