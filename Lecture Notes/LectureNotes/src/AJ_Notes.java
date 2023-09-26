/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Notes
    Author:		AJ
    Language:	Java
    Date:		2023-09-26
    Purpose:	The purpose of this program is to practice conditional statements
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-26	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

import java.util.Scanner;

public class AJ_Notes {

    public static void main(String[] args) {
        
        // Input
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String usrInput = scnr.nextLine();

        // if , else if and else statements 
        if (usrInput.equals("hi")) {
            System.out.println("You said Hi to me");
        }
        else if (usrInput.equals("bye")){
            System.out.println("Bye ! Have a great day");
        }
        else{
            System.out.println("Nice to meet you !!");
        }
        
        System.out.println();

        // For loop
        for(int j = 0; j < 4; j++) {
            System.out.println("Sucess using For loop....");
        }
        
        System.out.println();
        System.out.println();

        // While loop
        int k = 0;
        boolean switchOne = true;
        while (switchOne){
            System.out.println("Success using While loop");
            k++;
            if (k==4){
                switchOne=false;
            }
        }
        
        // Closing the scanner
        scnr.close();

    }
    
}
