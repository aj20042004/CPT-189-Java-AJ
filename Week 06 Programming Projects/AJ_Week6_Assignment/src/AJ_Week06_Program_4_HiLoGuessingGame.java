/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week06_Program_4_HiLoGuessingGame
    Author:		AJ
    Language:	Java
    Date:		2023-09-26
    Purpose:	The purpose of this program is to play Hi-Lo guessing game. 

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

        int intRandNum = randGen.nextInt(100) + 1;

        boolean blnSwitchLoop = true;

        int intCount = 0;

        System.out.println(intRandNum);

        while (blnSwitchLoop){
            
            System.out.println();
            System.out.print("Welcome to the Hi-Lo Game !!! \n");
            System.out.println();
            
            System.out.println("Guess a Number between 1 and 100: ");
            int intUsrGuessNum = scnr.nextInt();

            

            if (intUsrGuessNum == intRandNum) { 
                
                intCount += 1;
                System.out.println();
                System.out.println("You Guessed the correct Number ! You win ... \n");
                System.out.println("Number of Attempts for Guess: " + intCount);
                blnSwitchLoop = false;
                
                System.out.println();
                System.out.println();

                System.out.println("Do you want to Play again , press '1' to play a new game or press '0' to leave the game ? ");
                int intUsrNewGame = scnr.nextInt();
                if (intUsrNewGame == 1){
                    blnSwitchLoop = true;
                }
                else{
                    System.out.println("Bye !!! ");
                    blnSwitchLoop = false;
                }

            }

            else if(intUsrGuessNum > intRandNum){
                System.out.println("Your Guessed Number is higher than the opponent number");
                intCount += 1;
                
                System.out.println();
                System.out.print("To guess an another number (type '0') or press '-1' to quit the game: ");
                int intUsrInput = scnr.nextInt();
                
                if (intUsrInput == -1) { 
                    System.out.println("Thank You !!!");
                    blnSwitchLoop = false;
                }

            }

            else{
                intCount += 1;
                System.out.println("Your Guessed Number is lower than the opponent Number");

                System.out.println();
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
