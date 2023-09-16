/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Program_1_AvgNums
    Author:		AJ
    Language:	Java
    Date:		2023-09-05
    Purpose:	The purpose of this program is to read and Calculate average of three numbers that support precision. 
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-05	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the module
import java.util.Scanner;

public class AJ_Week03_Program_1_AvgNums {
     
    // main class
    public static void main(String[] args) {
        
        // Declaring variables with appropriate data type
        int intFirstNum;
        int intSecondNum;
        int intThirdNum;
        float fltAvgResult;
        
        // creating a scanner 
        Scanner scan = new Scanner(System.in);
        
        // Getting input for first Integer
        System.out.print("Enter first Integer: ");
        intFirstNum = scan.nextInt();
        
        // Getting input for second Integer
        System.out.print("Enter Second Integer: ");
        intSecondNum = scan.nextInt();

        // Getting input for third Integer
        System.out.print("Enter Third Integer: ");
        intThirdNum = scan.nextInt();
        
        // Calculating average for 3 numbers 
        fltAvgResult = (intFirstNum + intSecondNum + intThirdNum) / 3f;
        
        // Printing the avg value in the output
        System.out.println("The average of 3 integer numbers are : " + fltAvgResult);
        
        // Closing the scanner
        scan.close(); 
    }
    
}
