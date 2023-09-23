/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week05_Program_3_Kennel
    Author:		AJ
    Language:	Java
    Date:		2023-09-22
    Purpose:	The purpose of this program is to be the DRIVER program to be run to create and manipulate
                multiple instances of Dog objects.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-22	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

public class AJ_Week05_Program_3_Kennel {
    
    // Main Class
    public static void main(String[] args) {
        
        // Creating and Initializing the objects
        AJ_Week05_Program_3_Dog dgDogObject1 = new AJ_Week05_Program_3_Dog();
        AJ_Week05_Program_3_Dog dgDogObject2 = new AJ_Week05_Program_3_Dog("Jack");
        AJ_Week05_Program_3_Dog dgDogObject3 = new AJ_Week05_Program_3_Dog(4);
        AJ_Week05_Program_3_Dog dgDogObject4 = new AJ_Week05_Program_3_Dog("Ryan",5);
         
        // Printing the default details about the dogs using objects
        System.out.println();
        System.out.println("Here are the first three dog ojects as they were added:\n");
        System.out.println(dgDogObject1);
        System.out.println(dgDogObject2);
        System.out.println(dgDogObject3);
        System.out.println(dgDogObject4);
        System.out.println();

        System.out.println("Next, we will use the mutator methods to update our dog objects !!! \n");

        
        // Updating the first Object
        dgDogObject1.setDogName("Nolan");
        dgDogObject1.setDogAge(3);

        // Updating the second Object
        dgDogObject2.setDogName("Gibbs");
        dgDogObject2.setDogAge(6);

        // Updating the third Object
        dgDogObject3.setDogName("William");
        dgDogObject3.setDogAge(10);

        // Updating the fourth Object
        dgDogObject4.setDogName("Thomas");
        dgDogObject4.setDogAge(2);
        
        // Printing a line of text using getters methods and convertDgToHumanYrs method
        System.out.println(dgDogObject1.getDogName() + " age is " + dgDogObject1.getDogAge() + 
                          " which is equal to " + dgDogObject1.convertDgToHumanYrs() + " human years !!!");

        System.out.println(dgDogObject2.getDogName() + " age is " + dgDogObject2.getDogAge() + 
                          " which is equal to " + dgDogObject2.convertDgToHumanYrs() + " human years !!!");

        System.out.println(dgDogObject3.getDogName() + " age is " + dgDogObject3.getDogAge() + 
                          " which is equal to " + dgDogObject3.convertDgToHumanYrs() + " human years !!!");

        System.out.println(dgDogObject4.getDogName() + " age is " + dgDogObject4.getDogAge() + 
                          " which is equal to " + dgDogObject4.convertDgToHumanYrs() + " human years !!!\n");

    }
    
}
