/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week06_Program_5_slotMachine
    Author:		AJ
    Language:	Java
    Date:		2023-09-26
    Purpose:	The purpose of this program is to design a simple slot machine in which three numbers 
                between 0 and 9 are randomly selected and printed side by side. If all three numbers or 
                any two numbers matched, we are printing an appropriate print statement.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-26	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

import java.util.Scanner;
import java.util.Random;

public class AJ_Week06_Program_5_slotMachine {

    public static void main(String[] args) {
        
        Random randGen = new Random();
        Scanner scnr = new Scanner(System.in);
        
        System.out.println();
        System.out.println("Welcome to the slot machine Game !!! ");
        System.out.println();

        boolean blnSwitchLoop = true;

        while (blnSwitchLoop){
            
            int intRandNum1 = randGen.nextInt(10);
            int intRandNum2 = randGen.nextInt(10);
            int intRandNum3 = randGen.nextInt(10);

            if (intRandNum1 == intRandNum2 & intRandNum1 == intRandNum3 && intRandNum2 == intRandNum3) {

                System.out.println("Here are your Numbers !!!\n");
                System.out.println(intRandNum1 + " | " + intRandNum2 + " | " + intRandNum3 + "|\n");
                System.out.println("The Numbers matched !!! Congratulations... You Won.\n");


            }


            else if (intRandNum1 == intRandNum3) {

                System.out.println("Here are your Numbers !!!\n");
                System.out.println(intRandNum1 + " | " + intRandNum2 + " | " + intRandNum3 + "|\n");
                System.out.println("Two Numbers matched !!!\n");

            }


            else if (intRandNum1 == intRandNum2) {

                System.out.println("Here are your Numbers !!!\n");
                System.out.println(intRandNum1 + " | " + intRandNum2 + " | " + intRandNum3 + "|\n");
                System.out.println("Two Numbers matched !!!\n");

            }


            else if (intRandNum2 == intRandNum3) {

                System.out.println("Here are your Numbers !!!\n");
                System.out.println(intRandNum1 + " | " + intRandNum2 + " | " + intRandNum3 + "|\n");
                System.out.println("Two Numbers matched !!!\n");

            }


            else {

                System.out.println("Here are your Numbers !!!\n");
                System.out.println(intRandNum1 + " | " + intRandNum2 + " | " + intRandNum3 + " |\n");
                System.out.println("Sorry the Numbers did not match.\n");

            }


            System.out.print("To Continue playing the game (type '0') or press '-1' to quit the game: ");
            int intUsrInput = scnr.nextInt();
            System.out.println();

            if (intUsrInput == -1) { 
                System.out.println("Thank You !!!");
                blnSwitchLoop = false;
            }

        
        }

        scnr.close();
        
    }

}
