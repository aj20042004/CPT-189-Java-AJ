/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week12_Program_1_Priority
    Author:		AJ
    Language:	Java
    Date:		2023-11-06
    Purpose:	The purpose of this program is to create an interface that will be used by the base class
                Task. This interface will define the abstract methods for setPriority, and
                getPriority.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-11-06	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Creating the interface
public interface AJ_Week12_Program_1_Priority {
    
    // Creating the abstract method for setPriority
    abstract void setPriority(int newPriority);
   
    // Creating the abstract method for getPriority
    abstract int getPriority();

}