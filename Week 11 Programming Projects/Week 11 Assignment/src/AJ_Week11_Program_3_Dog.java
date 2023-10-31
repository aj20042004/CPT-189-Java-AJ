/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week11_Program_3_Dog
    Author:		AJ
    Language:	Java
    Date:		2023-10-31
    Purpose:	The purpose of this program is to 
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-10-31	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/



public class AJ_Week11_Program_3_Dog extends AJ_Week11_Program_3_Animal {

    @Override
    public void printAnimalNoise() {

        System.out.println("Species name: " + strSpeciesName);
        System.out.println("Species Size: " + strSpeciesSize);
        System.out.println("Sound : Barks!");
    }
    
}
