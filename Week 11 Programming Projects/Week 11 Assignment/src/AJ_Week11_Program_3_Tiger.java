/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week11_Program_3_Tiger
    Author:		AJ
    Language:	Java
    Date:		2023-10-31
    Purpose:	The purpose of this program is to create a class that extends a basic animal class to
                include other properties for a Tiger class.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-10-31	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Creating the Tiger class by extending the animal class
public class AJ_Week11_Program_3_Tiger extends AJ_Week11_Program_3_Animal {
    
    // Creating the protected variable
    protected String strCountry;
    
    // Mutators for species country
    public void setCountry(String strNewCountry) {
        strCountry = strNewCountry;
    }

    // Accessors for species country
    public String getCountry() {
        return strCountry;
    }
    
    // Print method for Tiger noise
    @Override
    public void printAnimalNoise() {

        System.out.println("Species name: " + strSpeciesName);
        System.out.println("Species Size: " + strSpeciesSize);
        System.out.println("Species Country: " + strCountry);
        System.out.println("Sound : Roar!");
    }
    
}
