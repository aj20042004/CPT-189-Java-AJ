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

// Importing the modules
import java.util.Random;
import java.util.Scanner;

public class AJ_Week06_Program_4_HiLoGuessingGame {
    
    // Main class
    public static void main(String[] args) {
        
        // Creating Random and Scanner objects
        Random randGen = new Random();
        Scanner scnr = new Scanner(System.in);
        
        // Intializing the variables
        boolean blnSwitchLoop = true;
        int intCount = 0;

        // Generating the random numbers and storing in intRandNum
        int intRandNum = randGen.nextInt(100) + 1;

        // Printing the Title
        System.out.println();
        System.out.println("Welcome to the Hi-Lo Guessing Game !!!");
        System.out.println("-----------------------------------------");
        
        // Starting the While Loop 
        while (blnSwitchLoop){

            System.out.println();
            System.out.println("Guess a Number between 1 and 100: ");

            // Getting user input
            int intUsrGuessNum = scnr.nextInt();

            // Checking if the user input matches the computer's random value
            if (intUsrGuessNum == intRandNum) { 
                
                // Increasing the count by 1 to calculate the number of guesses.
                intCount += 1;

                System.out.println();
                System.out.println("You Guessed the correct Number ! You win ... \n");
                System.out.println("Number of Attempts for Guess: " + intCount);
                System.out.println();
                System.out.println();
                
                // Checking Whether user wants to play again or not.
                System.out.println("Do you want to Play again , press '1' to play a new game or press '0' to leave the game ? ");
                int intUsrNewGame = scnr.nextInt();

                // Resetting and generating a new random value when user wants to play a new game
                if (intUsrNewGame == 1){
                    intCount = 0;
                    System.out.println("-----------------------------------------------------------------------------------------------------");
                    System.out.println("\nWelcome to the Hi-Lo Game !!! \n");
                    intRandNum = randGen.nextInt(100) + 1;
                    
                }
                
                // Ending the loop when user wants to quit
                else{
                    System.out.println("Bye !!! ");
                    blnSwitchLoop = false;
                }

            }

            
            // Checking if the user input is greater than computer's random value
            else if(intUsrGuessNum > intRandNum){
                System.out.println("Your Guessed Number is higher than the opponent number\n");
                intCount += 1;

                // Option for user to continue or exit the game
                System.out.print("To guess an another number (type '0') or press '-1' to quit the game: ");
                int intUsrInput = scnr.nextInt();
                
                if (intUsrInput == -1) { 
                    System.out.println("Thank You !!!");
                    blnSwitchLoop = false;
                }

            }
            
            // Using "else" statement when user input is lower than computer's random value
            else {
                intCount += 1;
                System.out.println("Your Guessed Number is lower than the opponent Number\n");

                // Option for user to continue or exit the game
                System.out.print("To guess an another number (type '0') or press '-1' to quit the game: ");
                int intUsrInput = scnr.nextInt();

                if (intUsrInput == -1) { 
                    System.out.println("Thank You !!!");
                    blnSwitchLoop = false;
                }

            }
                         
        }

        // Closing the Scanner object
        scnr.close();

    }
    
}
