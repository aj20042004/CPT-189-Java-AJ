/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week06_Program_4_HiLoGuessingGame
    Author:		AJ
    Language:	Java
    Date:		2023-09-26
    Purpose:	The purpose of this program is to play Hi-Lo guessing game with numbers. This program 
                will pick a random number between 1 and 100, then recursively prompts the user to 
                guess the number. On each guess, we are going to report whether the number was greater
                or lower. We are using a sentinel value to determine whether user wants to play or quit.

----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-26	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

import java.util.Random;
import java.util.Scanner;

public class AJ_Week06_Program_4_HiLoGuessingGame {

    public static void main(String[] args) {

        Random randGen = new Random();
        Scanner scnr = new Scanner(System.in);

        boolean blnSwitchLoop = true;
        int intCount = 0;
        int intRandNum = randGen.nextInt(100) + 1;
        System.out.println();
        System.out.println("Welcome to the Hi-Lo Guessing Game !!!");
        System.out.println("-----------------------------------------");
        


        while (blnSwitchLoop){

            System.out.println();
            System.out.println("Guess a Number between 1 and 100: ");
            int intUsrGuessNum = scnr.nextInt();

        
            if (intUsrGuessNum == intRandNum) { 
                
                intCount += 1;
                System.out.println();
                System.out.println("You Guessed the correct Number ! You win ... \n");
                System.out.println("Number of Attempts for Guess: " + intCount);
                System.out.println();
                System.out.println();

                System.out.println("Do you want to Play again , press '1' to play a new game or press '0' to leave the game ? ");
                int intUsrNewGame = scnr.nextInt();
                if (intUsrNewGame == 1){
                    intCount = 0;
                    System.out.println("-----------------------------------------------------------------------------------------------------");
                    System.out.println("\nWelcome to the Hi-Lo Game !!! \n");
                    intRandNum = randGen.nextInt(100) + 1;
                    
                }

                else{
                    System.out.println("Bye !!! ");
                    blnSwitchLoop = false;
                }

            }


            else if(intUsrGuessNum > intRandNum){
                System.out.println("Your Guessed Number is higher than the opponent number\n");
                intCount += 1;
                System.out.print("To guess an another number (type '0') or press '-1' to quit the game: ");
                int intUsrInput = scnr.nextInt();
                
                if (intUsrInput == -1) { 
                    System.out.println("Thank You !!!");
                    blnSwitchLoop = false;
                }

            }

            else{
                intCount += 1;
                System.out.println("Your Guessed Number is lower than the opponent Number\n");
                System.out.print("To guess an another number (type '0') or press '-1' to quit the game: ");
                int intUsrInput = scnr.nextInt();
                
                if (intUsrInput == -1) { 
                    System.out.println("Thank You !!!");
                    blnSwitchLoop = false;
                }

            }
                         
        }

        scnr.close();
    }
    
}
