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

import java.util.Scanner;
import java.util.InputMismatchException;

public class AJ_Week10_Program_3_HandlingAges {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int intCount = 0;
        int intUsrAge = 0;
        int intAverageTracker = 0;
        String strUsrName;
        int intStudentAgeTracker;

        System.out.println("\nWelcome !");
        System.out.println("-------------------------------------------------");

        while (intCount < 5) {

            intStudentAgeTracker = intCount + 1;
            System.out.println("\nStudent " + intStudentAgeTracker + " Details");
            System.out.println("----------------------------------------------");

            System.out.print("Please enter your name: ");
            strUsrName = scnr.nextLine();

            boolean blnLoopSwitch = true;

            while (blnLoopSwitch) {

                System.out.print("Please enter your age: ");

                try {

                    intUsrAge = scnr.nextInt();
                    scnr.nextLine();

                    if ((intUsrAge < 1) || (intUsrAge > 110)) {
                        throw new Exception("\nSorry! User Age cannot be less than 1 or greater than 110. ");

                    }

                    blnLoopSwitch = false;

                }

                catch (InputMismatchException excpt) {

                    System.out.println("\nExpected a number as input");
                    System.out.println("Cannot compute the average, Please try again.\n");
                    scnr.nextLine();
                }

                catch (Exception excpt) {
                    System.out.println(excpt.getMessage());
                    System.out.println("Cannot compute the average, Please try again.\n");
                }

            }

            intAverageTracker += intUsrAge;

            if (intCount == 4) {
                System.out.println("--------------------------------------------- ");
                // Is Average age needs to be double ? 
                System.out.println("The average students age is: " + intAverageTracker / 5); 
                System.out.println("");

            }

            intCount += 1;

        }

        scnr.close();

    }

}
