/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week12_Program_1_Task
    Author:		AJ
    Language:	Java
    Date:		2023-11-06
    Purpose:	The purpose of this program is to 
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-11-06	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

public abstract class AJ_Week12_Program_1_Task implements AJ_Week12_Program_1_Priority {

    protected int intPriorityLevel = 0;
    protected String strDescription = "Unknown";

    // Constructor
    public AJ_Week12_Program_1_Task(String newDescription) {
        strDescription = newDescription;
    }

    @Override
    public void setPriority(int newPriorityLevel) {
        intPriorityLevel = newPriorityLevel;
    }

    @Override
    public int getPriority() {
        return intPriorityLevel;
    }

    // getters
    public String getDescription() {
        return strDescription;
    }

}