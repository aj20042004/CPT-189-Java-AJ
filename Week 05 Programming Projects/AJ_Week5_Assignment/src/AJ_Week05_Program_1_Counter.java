/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week05_Counter
    Author:		AJ
    Language:	Java
    Date:		2023-09-21
    Purpose:	The purpose of this program is to define a Counter class that will be used by other programs 
                and will have constructors, accessors, and mutators 
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-21	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/


public class AJ_Week05_Program_1_Counter {
    
    // Private variable Counter
    private int intCounter;
    
    // Default Constructor
    public AJ_Week05_Program_1_Counter() {
        intCounter = 0;
    }
    
    // Click Method for adding 1 to the counter
    public void click(){
        intCounter = intCounter + 1;
    }
    
    // Reset Method for setting the counter to 0
    public void reset() {
        intCounter = 0;
    }
    
    // getCount Method
    public int getCount(){
        return intCounter;
    }


}
