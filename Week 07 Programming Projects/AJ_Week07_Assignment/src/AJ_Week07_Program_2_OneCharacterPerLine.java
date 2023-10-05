/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week07_Program_3_multiplicationTable
    Author:		AJ
    Language:	Java
    Date:		2023-10-03
    Purpose:	The purpose of this program is to read a string from user input and print it one
                character per line.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-10-03	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the module
import java.util.Scanner;

public class AJ_Week07_Program_2_OneCharacterPerLine {
    
    // Main method
    public static void main(String[] args) {
        
        // Creating a Scanner object
        Scanner scnr = new Scanner(System.in);
        
        // Getting an user input
        System.out.print("\nPlease Type a String: ");
        String strUsrInput = scnr.next();
        
        // Printing each character on each line using "for" loop
        System.out.println("\nYour characters: ");
        System.out.println("-----------------------------");
        for (int i = 0; i < strUsrInput.length(); i++) { 
            System.out.println(strUsrInput.charAt(i));
        }
        
        // Closing the scanner object
        scnr.close();
        
    }
    
}
