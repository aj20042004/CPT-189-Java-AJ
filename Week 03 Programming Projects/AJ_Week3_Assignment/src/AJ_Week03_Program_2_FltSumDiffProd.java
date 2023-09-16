/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Program_2_FltSumDiffProd
    Author:		AJ
    Language:	Java
    Date:		2023-09-05
    Purpose:	The purpose of this program is to calculate sum , difference and product of 2 floating numbers.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-05	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the module
import java.util.Scanner;

public class AJ_Week03_Program_2_FltSumDiffProd {
    
    // main class
    public static void main(String[] args) {
        
        // Declaring variables with appropriate data type
        float fltFirstNum;
        float fltSecondNum;
        float fltSumResult;
        float fltDiffResult;
        float fltProdResult;

        // creating a scanner 
        Scanner scan = new Scanner(System.in);
        
        // Getting first floating point number as input
        System.out.print("Enter first floating point number: ");
        fltFirstNum = scan.nextFloat();

        // Getting second floating point number as input
        System.out.print("Enter Second floating point number: ");
        fltSecondNum = scan.nextFloat();
        
        // Calculating the sum of 2 floating point numbers 
        fltSumResult = fltFirstNum + fltSecondNum;

        // Calculating the difference of floating numbers 
        fltDiffResult = fltFirstNum - fltSecondNum;

        // Calculating the product of floating numbers 
        fltProdResult = fltFirstNum * fltSecondNum;
        
        // Printing all the output
        System.out.println();
        System.out.println("The Sum of two floating point numbers is: " + fltSumResult + "\n");
        System.out.println("The Difference of two floating point numbers is: " + fltDiffResult + "\n");
        System.out.println("The Product of two floating point numbers is: " + fltProdResult + "\n");
        
        // Closing the scanner
        scan.close();


    }
}
