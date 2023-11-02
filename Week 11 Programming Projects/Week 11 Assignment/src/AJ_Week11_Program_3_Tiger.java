/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week11_Program_3_Tiger
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

public class AJ_Week11_Program_3_Tiger extends AJ_Week11_Program_3_Animal {
    
    protected String strCountry;

    public void setCountry(String strNewCountry) {
        strCountry = strNewCountry;
    }

    public String getCountry() {
        return strCountry;
    }

    @Override
    public void printAnimalNoise() {

        System.out.println("Species name: " + strSpeciesName);
        System.out.println("Species Size: " + strSpeciesSize);
        System.out.println("Species Country: " + strCountry);
        System.out.println("Sound : Roar!");
    }
    
}
