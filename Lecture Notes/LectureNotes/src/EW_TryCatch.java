/*
----------------------------------------------------------------------------------------------------------
    Name:	EW_TryCatch
    Author:	Edward V. Weber
    Language:	Java
    Date:	2023-08-08
    Purpose:	The purpose of this program is to demonstrate how the Try/Catch blocks work
                for handling program exceptions.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    EVW		2023-08-08	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class EW_TryCatch {
    public static void main(String[] args) {
        Scanner scnKbd = new Scanner(System.in);
        int intBoneheadLevel = 0;                  // to determine how big of an idiot we are dealing with...
        System.out.println("The purpose of this program is very simple:  We want the user to enter");
        System.out.println("  a numeric value that represents their own age.  Normally, we would");
        System.out.println("  expect the user to enter a single, whole number between 1 and, some high");
        System.out.println("  number like 110 for the oldest age.  But any other kind of input is");
        System.out.println("  going to be considered \"invalid\"!\n");
        System.out.println("Remember, a programmer's goal is to create an 'idiot-proof' program!  However...,");
        System.out.println("  ... Nature always has a way of creating a 'bigger idiot'!\n");
        System.out.println("  So... let's begin the test.");

        /*
         * We will now create a loop to stay in until we get a valid answer from the user... this may take a while!
         */
        boolean blnValidAnswer = false;         // assume we have a bad answer ... until we have a good answer
        boolean blnIQuit = false;               // we won't quit just yet!
        int intUserAge = 0;
        while (! blnValidAnswer){               // notice the ! for NOT
            try {
                //  Your prompts to the user should always try to minimize their possibility of giving WRONG answers!
                System.out.print("\nPlease enter your age (should be a whole # between 1 and 110): ");
                intUserAge = scnKbd.nextInt();
                if ((intUserAge <= 0) || (intUserAge > 110)) {
                    throw (new Exception("AgeOutOfRange"));
                }
                if((!blnIQuit) && (intUserAge > 0)){
                    blnValidAnswer = true;
                }
            } 
            catch (InputMismatchException e){
                // this person doesn't know what a whole number is!
                System.out.println("... I'm sorry, but that is incorrect input.  You must enter a whole number!");
                intBoneheadLevel++;
                scnKbd.nextLine();              // flush out the user's last, incorrect input.
            }
            catch (Exception e){
                // this will catch if the user entered an age < 0 or > 110
                System.out.println("... I'm sorry, but you must enter an age between 1 and 110!");
                intBoneheadLevel++;
                intUserAge = 0;
            }
            //  if we get down here, we have to still validate that we didn't quit!
            switch(intBoneheadLevel){
                case 3:
                    System.out.println("     (... get a load of this guy...)");
                    break;
                case 4:
                    System.out.println("     (... really?! ...)");
                    break;
                case 5:
                    System.out.println("\nOK - this doesn't look like this is going to work...  Let's try again later!");
                    blnIQuit = true;                // we give up!
            }  
            if(blnIQuit){
                System.out.println("... We gave you " + intBoneheadLevel + " chances to tell us your age...");
                System.out.println("    and it appears you were unable to complete this first task.");
                System.out.println("... Alas, ... Nature wins again... ");
                break;                          // get us out of the while loop
            }
        }
        if(!blnIQuit){
            System.out.println("Excellent!  Your age is " + intUserAge + " so now the program can continue!");
        }
        scnKbd.close();
    }    
}
