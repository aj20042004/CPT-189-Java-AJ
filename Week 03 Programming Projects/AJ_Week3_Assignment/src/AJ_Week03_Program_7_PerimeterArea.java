/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Program_7_PerimeterArea
    Author:		AJ
    Language:	Java
    Date:		2023-09-05
    Purpose:	The purpose of this program is to get length of the square as an user input and by using the input, we are
                calculating the perimeter and area of a square.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-05	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the module
import java.util.Scanner;

public class AJ_Week03_Program_7_PerimeterArea {
    
    // Main class
    public static void main(String[] args) {
        
        // Creating the scanner
        Scanner scan = new Scanner(System.in);

         // Declaring variables with appropriate data type
        int intLengthOfSqare; 
        int intPerimeterSquare;
        int intAreaSquare; 

        // Getting an input for length of the square
        System.out.print("Please enter the length of a square: ");
        intLengthOfSqare = scan.nextInt();
        
        // Calculating the perimeter and area of square
        intPerimeterSquare = intLengthOfSqare * 4;
        intAreaSquare = intLengthOfSqare * intLengthOfSqare;
        
        // Printing all the output
        System.out.println();
        System.out.println("Your Perimeter of square is: " + intPerimeterSquare);
        System.out.println();
        System.out.println("Your area of square is: " + intAreaSquare);
        
        // Closing the scanner
        scan.close();
    
    }
    
}
