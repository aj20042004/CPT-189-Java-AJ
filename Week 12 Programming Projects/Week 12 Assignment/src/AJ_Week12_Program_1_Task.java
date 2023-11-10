/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week12_Program_1_Task
    Author:		AJ
    Language:	Java
    Date:		2023-11-06
    Purpose:	The purpose of this program is to create a Task abstract base class that will be use
                for specific Task to extend.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-11-06	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Creating a abstract class that implements Priority interface
public abstract class AJ_Week12_Program_1_Task implements AJ_Week12_Program_1_Priority {
    
    // Creating the protected variables
    protected int intPriorityLevel = 0;
    protected String strDescription = "Unknown";

    // Constructor with one parameter
    public AJ_Week12_Program_1_Task(String newDescription) {
        strDescription = newDescription;
    }
    
    // Override method for setPriority
    @Override
    public void setPriority(int newPriorityLevel) {
        intPriorityLevel = newPriorityLevel;
    }
    
    // Override method for getPriority
    @Override
    public int getPriority() {
        return intPriorityLevel;
    }

    // Accessors for description
    public String getDescription() {
        return strDescription;
    }

}