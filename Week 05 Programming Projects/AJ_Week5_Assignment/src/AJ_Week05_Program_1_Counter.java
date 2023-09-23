/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week05_Counter
    Author:		AJ
    Language:	Java
    Date:		2023-09-21
    Purpose:	The purpose of this program is to 
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
    
    // Click Method
    public void click(){
        intCounter = intCounter + 1;
    }
    
    // Reset Method
    public void reset() {
        intCounter = 0;
    }
    
    // getCount Method
    public int getCount(){
        return intCounter;
    }


}
