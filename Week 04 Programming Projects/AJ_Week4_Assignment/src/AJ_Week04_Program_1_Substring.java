/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week04_Program_1_Substring
    Author:		AJ
    Language:	Java
    Date:		2023-09-12
    Purpose:	The purpose of this program is to get user input in variables strUsrFirstName and strUsrSecondName. Then,
                printing a string composed of the first letter of the user's first name, followed by first five characters 
                of the user's last name, followed by a random number from range 10 to 99. We are using random of the math
                class to genrate random numbers. 
                
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-12	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the modules
import java.util.Scanner;
import java.util.Random;

public class AJ_Week04_Program_1_Substring {
    
    // Main Method
    public static void main(String[] args) {
        
        // Intializing the Random
        Random ranGen = new Random();

        // Intializing the Scanner
        Scanner scnr = new Scanner(System.in);
        
        // Creating the variables
        String strUsrFirstName;
        String strUsrSecondName;
        int intRandom;
        
        // Generating the random numbers and storing in intRandom
        intRandom = ranGen.nextInt(90) + 10;
        
        // Getting user input for first name
        System.out.print("Enter your first name: ");
        strUsrFirstName = scnr.nextLine();
        
        // Getting user input for last name
        System.out.print("Enter your last name: ");
        strUsrSecondName = scnr.nextLine();
        
        /* Generating the password using the first letter of first name and first 5 letters of the last name,
        followed by a random number generated within range 10 - 99   */     
        System.out.println("Your Password would be: ");
        System.out.println(strUsrFirstName.substring(0,1) 
        + strUsrSecondName.substring(0,5) + intRandom);
        
        // Closing the scanner
        scnr.close();

    }
    
}
