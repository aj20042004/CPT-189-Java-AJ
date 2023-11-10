/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week12_Program_1_ToDoList
    Author:		AJ
    Language:	Java
    Date:		2023-11-06
    Purpose:	The purpose of this program is to be the driver class for an To-Do-List program. This
                will create instances of Tasks and manipulate them. Displaying all the description and 
                priority data by using getDescription and getDescription method.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-11-06	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the modules
import java.util.ArrayList;
import java.util.List;

// Creating a ToDoList class
public class AJ_Week12_Program_1_ToDoList {
    
    // main method
    public static void main(String[] args) {
        
        // Creating a Array list to store Task objects
        List<AJ_Week12_Program_1_Task> arrTaskList = new ArrayList<>();

        // Creating Task object 1
        AJ_Week12_Program_1_Task taskObj1 = new AJ_Week12_Program_1_Task("Complete the Java Assignment") {
        };
        
        // Using the setPriority method to set priority level
        taskObj1.setPriority(3);
        
        // Creating Task object 2
        AJ_Week12_Program_1_Task taskObj2 = new AJ_Week12_Program_1_Task("Workout") {
        };

        // Using the setPriority method to set priority level
        taskObj2.setPriority(1);
        
        // Creating Task object 3
        AJ_Week12_Program_1_Task taskObj3 = new AJ_Week12_Program_1_Task("Cooking Dinner") {
        };

        // Using the setPriority method to set priority level
        taskObj3.setPriority(2);
 
        // Adding the objects: taskObj1, taskObj2, taskObj3 to the array list
        arrTaskList.add(taskObj1);
        arrTaskList.add(taskObj2);
        arrTaskList.add(taskObj3);
        
        System.out.println("\nTasks in the To-Do List");
        System.out.println("------------------------------------------------------------------------------");
        
        // Creating a "for" loop to display the data
        for (int i = 0; i < arrTaskList.size(); i++) {
            
            // Using getDescription method to display the data associated with each objects
            System.out.println("Description of the Task: " + arrTaskList.get(i).getDescription());

            // Using getPriority method to display the dsata associated with each objects
            System.out.println("Priority Level: " + arrTaskList.get(i).getPriority());
            System.out.println("------------------------------------------------------------------------------");
        }


    }

}
