/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week05_CounterTest
    Author:		AJ
    Language:	Java
    Date:		2023-09-21
    Purpose:	The purpose of this program is to be the DRIVER program to be run to create and manipulate
                multiple instances of Counter objects. 
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-21	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

public class AJ_Week05_Program_1_CounterTest {
    
    // Main class
    public static void main(String[] args) {
        
        // Counter object for Male ages from 25-50
        AJ_Week05_Program_1_Counter cntCounter1 = new AJ_Week05_Program_1_Counter();  

        // Counter object for Male ages from 15-24
        AJ_Week05_Program_1_Counter cntCounter2 = new AJ_Week05_Program_1_Counter(); 

        // Counter object for Female ages from 25-50
        AJ_Week05_Program_1_Counter cntCounter3 = new AJ_Week05_Program_1_Counter();  

        // Counter object for Female ages from 15-24
        AJ_Week05_Program_1_Counter cntCounter4 = new AJ_Week05_Program_1_Counter(); 
        
        // Counting the male ages from 25 - 50
        cntCounter1.click();
        cntCounter1.click();
        cntCounter1.click();
        cntCounter1.click();

        // Counting the male ages from 15 - 24
        cntCounter2.click();
        cntCounter2.click();
        cntCounter2.click();
        cntCounter2.click();
        cntCounter2.click();
        cntCounter2.click();

        // Counting the Female ages from 25 - 50
        cntCounter3.click();
        cntCounter3.click();

        // Counting the Female ages from 15 - 24
        cntCounter4.click();
        cntCounter4.click();
        cntCounter4.click();
        cntCounter4.click();
        cntCounter4.click();
        cntCounter4.click();
        cntCounter4.click();
        cntCounter4.click();
        
        // Printing the current count for different age groups
        System.out.println();
        System.out.println("The Total Number of Male ages from 25 - 50 are: " + cntCounter1.getCount());
        System.out.println("The Total Number of Male ages from 15 - 24 are: " + cntCounter2.getCount());
        System.out.println("The Total Number of Female ages from 25 - 50 are: " + cntCounter3.getCount());
        System.out.println("The Total Number of Female ages from 15 - 24 are: " + cntCounter4.getCount());
        
        System.out.println();
        System.out.println("We're going to reset the Counter now !!!\n");
       
        // Reset the counter ojects to 0
        cntCounter1.reset();
        cntCounter2.reset();
        cntCounter3.reset();
        cntCounter4.reset();
        
        // Printing the updated counter values
        System.out.println("The Counter for calculating the Male ages from 25 - 50 was successfully reset: " + cntCounter1.getCount());
        System.out.println("The Counter for calculating the Male ages from 15 - 24 was successfully reset: " + cntCounter2.getCount());
        System.out.println("The Counter for calculating the Female ages from 25 - 50 was successfully reset: " + cntCounter3.getCount());
        System.out.println("The Counter for calculating the Female ages from 15 - 24 was successfully reset: " + cntCounter4.getCount());

        
    }
  
}
