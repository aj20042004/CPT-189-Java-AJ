/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week04_Program_2_SumOfCubes
    Author:		AJ
    Language:	Java
    Date:		2023-09-12
    Purpose:	The purpose of this program is to print the sum of cubes. We are getting a two integer values 
                as a input and storing the numbers in variables intFirstNum and intSecondNum. Then, printing the 
                sum of each number raised to the third power. We are using the keyword "pow" method of the 
                math class to solve this problem. 
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-12	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the modules
import java.util.Scanner;

public class AJ_Week04_Program_2_SumOfCubes {
    
    // Main method
    public static void main(String[] args) {
        
        // Initializing the scanner
        Scanner scnr = new Scanner(System.in);
        
        // Creating the variables 
        int intFirstNum;
        int intSecondNum;
        double dblPowFirstNum;
        double dblPowSecondNum;
        
        // Getting the user input for the first number
        System.out.print("Enter the first Number: ");
        intFirstNum = scnr.nextInt();
        
        // Getting the user input for the second number
        System.out.print("Enter the second Number: ");
        intSecondNum = scnr.nextInt();
        
        // Calulating the numbers raised to 3rd power for 2 user inputs 
        dblPowFirstNum = Math.pow(intFirstNum, 3);
        dblPowSecondNum = Math.pow(intSecondNum, 3);
       
        System.out.println();

        // Printing the calculated output
        System.out.print("The sum of each value raised to the third power is: ");
        System.out.print(dblPowFirstNum + dblPowSecondNum);
        
        // Closing the Scanner
        scnr.close();
    }
}
