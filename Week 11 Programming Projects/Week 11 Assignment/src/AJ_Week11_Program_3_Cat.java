/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week11_Program_3_Cat
    Author:		AJ
    Language:	Java
    Date:		2023-10-31
    Purpose:	The purpose of this program is to create a class that extends a basic animal class to
                include other properties for a Cat class.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-10-31	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Creating the Cat class by extending the animal class
public class AJ_Week11_Program_3_Cat extends AJ_Week11_Program_3_Animal{
    
    // Creating the protected variable
    protected String strSkills;
    
    // Mutators for species skills
    public void setSkills(String strNewSkills) {
        strSkills = strNewSkills;
    }
    
    // Accessors for species skills
    public String getSkills() { 
        return strSkills;
    }
    
    // Print method for Cat noise
    @Override
    public void printAnimalNoise() {
        
        System.out.println("Species Name: " + strSpeciesName);
        System.out.println("Species Size: " + strSpeciesSize);
        System.out.println("Species Skills: " + strSkills);
        System.out.println("Sound : Meows!");
    }
}
