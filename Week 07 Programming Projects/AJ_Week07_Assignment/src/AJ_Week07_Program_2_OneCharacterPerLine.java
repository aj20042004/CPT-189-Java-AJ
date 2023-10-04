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

import java.util.Scanner;

public class AJ_Week07_Program_2_OneCharacterPerLine {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.print("\nPlease Type a String: ");
        String strUsrInput = scnr.next();
        System.out.println(strUsrInput);
        
        System.out.println("\nYour characters: ");
        for (int i = 0; i < strUsrInput.length(); i++) { 

            System.out.println(strUsrInput.charAt(i));
        }

        scnr.close();
        
    }
    
}
