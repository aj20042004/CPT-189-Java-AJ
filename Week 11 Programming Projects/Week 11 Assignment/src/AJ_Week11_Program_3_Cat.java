/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week11_Program_3_Cat
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

public class AJ_Week11_Program_3_Cat extends AJ_Week11_Program_3_Animal{
    
    protected String strSkills;

    public void setSkills(String strNewSkills) {
        strSkills = strNewSkills;
    }

    public String getSkills() { 
        return strSkills;
    }
    
    @Override
    public void printAnimalNoise() {
        
        System.out.println("Species Name: " + strSpeciesName);
        System.out.println("Species Size: " + strSpeciesSize);
        System.out.println("Species Skills: " + strSkills);
        System.out.println("Sound : Meows!");
    }
}
