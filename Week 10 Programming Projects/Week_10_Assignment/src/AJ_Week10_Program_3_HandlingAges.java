/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week10_Program_3_HandlingAges
    Author:		AJ
    Language:	Java
    Date:		2023-10-24
    Purpose:	The purpose of this program is to asks for information about 5 students. For each student,
                we're going to ask for their name and age. By using try/catch block, we're going to handle
                non-numeric input for ages and for handling ages less than 1 and more than 110. Finally,
                reporting the average of student ages.
                
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-10-24	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the modules
import java.util.Scanner;
import java.util.InputMismatchException;

public class AJ_Week10_Program_3_HandlingAges {
    
    // main method
    public static void main(String[] args) {
        
        // Initializing the scanner object
        Scanner scnr = new Scanner(System.in);

        // Initializing the variables
        int intCount = 0;                 // For counting the number of iteration
        int intUsrAge = 0;                // For storing user input age
        double dblAverageTracker = 0;     // For calculating the average age
        String strUsrName;                // For storing user input name
        int intStudentAgeTracker;         // For storing the number of students

        System.out.println("\nWelcome !");
        System.out.println("-------------------------------------------------");
        
        // Creating a "while" loop to run the program 5 times to collect the user input data
        while (intCount < 5) {
            
            // Calculting the number of students
            intStudentAgeTracker = intCount + 1;
            System.out.println("\nStudent " + intStudentAgeTracker + " Details");
            System.out.println("----------------------------------------------");
            
            // Getting an user input for name
            System.out.print("Please enter your name: ");
            strUsrName = scnr.nextLine();
            
            // Creating the second loop switch
            boolean blnLoopSwitch = true;
            
            // Creating the second "while" loop
            while (blnLoopSwitch) {
                
                System.out.print("Please enter your age: ");
                
                // Using try block to handle the exceptions
                try {
                    
                    // Getting an user input for age
                    intUsrAge = scnr.nextInt();
                    scnr.nextLine();
                    
                    // If the user input for age is less than 1 or greater than 110, we're throwing an error message.
                    if ((intUsrAge < 1) || (intUsrAge > 110)) {
                        throw new Exception("\nSorry! User Age cannot be less than 1 or greater than 110. ");

                    }
                    
                    // If user entered correct age, we're turning off the switch
                    blnLoopSwitch = false;

                }
                
                // Using catch block to handle InputMismatchException error
                catch (InputMismatchException excpt) {
                    
                    // Prompting the uesr that they entered a wrong data type
                    System.out.println("\nExpected a number as input");
                    System.out.println("Cannot compute the average, Please try again.\n");

                    // flushing the CR from buffer
                    scnr.nextLine();
                }
                
                // Using catch block to handle the wrong input (age < 1 or age > 110)
                catch (Exception excpt) {
                    
                    // Printing the error message
                    System.out.println(excpt.getMessage());
                    System.out.println("Cannot compute the average, Please try again.\n");
                }

            }
            
            // When user enter the correct age, we're adding the user ages to the intAverageTracker
            dblAverageTracker += intUsrAge;
            
            // When intCount is 4, the loop will reach the final iteration 
            if (intCount == 4) {
                System.out.println("--------------------------------------------- ");
                  
                // calculating the average age by dividing intAverageTracker by 5 
                System.out.println("The average students age is: " + dblAverageTracker / 5); 
                System.out.println("");

            }
            
            // Adding 1 to intCount for every iteration
            intCount += 1;

        }
        
        // Closing the scanner object
        scnr.close();

    }

}
