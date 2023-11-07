/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week12_Program_1_ToDoList
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

import java.util.ArrayList;
import java.util.List;

public class AJ_Week12_Program_1_ToDoList {

    public static void main(String[] args) {

        List<AJ_Week12_Program_1_Task> arrTaskList = new ArrayList<>();

        
        AJ_Week12_Program_1_Task objTask1 = new AJ_Week12_Program_1_Task("Complete the Java Assignment") {
        };
        objTask1.setPriority(1);

        AJ_Week12_Program_1_Task objTask2 = new AJ_Week12_Program_1_Task("Workout") {
        };
        objTask2.setPriority(2);

        AJ_Week12_Program_1_Task objTask3 = new AJ_Week12_Program_1_Task("Cooking Dinner") {
        };
        objTask3.setPriority(3);

        arrTaskList.add(objTask1);
        arrTaskList.add(objTask2);
        arrTaskList.add(objTask3);

        System.out.println("\nTasks in the To-Do List");
        System.out.println("------------------------------------------------------------------------------");

        for (int i = 0; i < arrTaskList.size(); i++) {
        
            System.out.println("Description of the Task: " + arrTaskList.get(i).getDescription());
            System.out.println("Priority Level: " + arrTaskList.get(i).getPriority());
            System.out.println("------------------------------------------------------------------------------");
        }


    }

}
