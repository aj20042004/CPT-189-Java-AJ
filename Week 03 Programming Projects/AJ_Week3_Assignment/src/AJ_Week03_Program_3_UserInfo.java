/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Program_3_UserInfo
    Author:		AJ
    Language:	Java
    Date:		2023-09-05
    Purpose:	The purpose of this program is to store the user input in variables strUsrName, intUsrAge, 
                strUsrCollege and strUsrPetname. Then, output a paragraph substituting the user's input for the appropriate data.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-05	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the module
import java.util.Scanner;

public class AJ_Week03_Program_3_UserInfo {
    
    // Main class
    public static void main(String[] args) {
        
        // Declaring variables with appropriate data type
        String strUsrName;
        int intUsrAge;
        String strUsrCollege;
        String strUsrPetName;
        
        // Creating the scanner
        Scanner scan = new Scanner(System.in);
        
        // getting input for name
        System.out.print("Please enter your Name: ");
        strUsrName = scan.next();
        
        // getting input for age
        System.out.print("Please enter your Age: ");
        intUsrAge = scan.nextInt();
        scan.nextLine();
        
        // getting input for college name
        System.out.print("Please enter your college name: ");
        strUsrCollege = scan.next();
        
        // getting input for pet name
        System.out.print("Please enter your pet name: ");
        strUsrPetName = scan.next();
        
        // Printing the output
        System.out.println();
        System.out.println("Hello, my name is " + strUsrName + " and I am " + intUsrAge + 
                         " years\nold. I'm enjoying my time at " + strUsrCollege + ", though\nI miss my pet " + 
                           strUsrPetName + " very much!");
        
        // Closing the scanner
        scan.close();
    }
    
}
