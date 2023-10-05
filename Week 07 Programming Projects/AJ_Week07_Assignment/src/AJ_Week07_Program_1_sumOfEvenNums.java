/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week07_Program_1_sumOfEvenNums
    Author:		AJ
    Language:	Java
    Date:		2023-10-03
    Purpose:	The purpose of this program is to read an integer value and calculate the sum of all
                even numbers between 2 and the user input value. We are using "Scanner" object to get an input 
                from user. 
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-10-03	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the modules
import java.util.Scanner;

public class AJ_Week07_Program_1_sumOfEvenNums {
    
    // Main method
    public static void main(String[] args) {
        
        // Intializing the Scanner objects
        Scanner scnr = new Scanner(System.in);

        // Getting the user input
        System.out.print("\nEnter an Integer Value greater than 2: ");
        int intUsrVal = scnr.nextInt();
        System.out.println("----------------------------------------");
        
        // Intializing the variables
        int intDefaultValue = 2;
        int intSumOfEvenNum = 0;
        boolean blnLoopSwitch = true;
        
        // Creating a do-while loop
        do {
            
            // Checking if the user input value is greater than or equal to 2
            if (intUsrVal < 2){

                System.out.println("Error ! Input value cannot be less than 2.");
                blnLoopSwitch = false;

                /*  Question here Optional step "Prompting user whether he wants to continue or not" */
                System.out.print("Do you want to try again ? (Type '0' to try again or type '-1' to exit): ");
                int intToContinue = scnr.nextInt();

                if (intToContinue == 0){
                    blnLoopSwitch = true;
                    System.out.print("\nEnter an Integer Value: ");
                    intUsrVal = scnr.nextInt();
                    System.out.println("----------------------------------------");

                }

                else if (intToContinue == -1) { 
                    System.out.println("\nThank you !");
                    System.out.println("--------------------------------------------");
                }

                else{
                    System.out.println("\nSorry! Invalid Number Entered in option"); 
                    System.out.println("--------------------------------------------------");
                    break; 
                }   

                
            }

            else { 

                System.out.print(intDefaultValue + " ");
                
                //  Calculating the sum
                intSumOfEvenNum += intDefaultValue;
                
                // Adding 2 to the intDefaultValue until it is greater than intUsrVal
                intDefaultValue += 2;
                
                // breaking the loop when intDefaultValue is greater than intUsrVal
                if (intDefaultValue > intUsrVal) { 
                    System.out.println("\n");
                    System.out.println("Sum of All Even Numbers between 2 and user input number is: " + intSumOfEvenNum);
                    System.out.println("-----------------------------------------------------------------------------------");
                    System.out.println("");
                    blnLoopSwitch = false;
                }

            }

        } while (blnLoopSwitch);


        // Closing the scanner object
        scnr.close();
    }
    
}
