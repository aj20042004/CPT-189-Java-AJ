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
    
    protected String strNickName;

    public void setNickName(String strNewNickName) {
        strNickName = strNewNickName;
    }

    public String getNickName(){
        return strNickName;
    }
    
    @Override
    public void printAnimalNoise() {

        System.out.println("Species Name: " + strSpeciesName);
        System.out.println("Species Size: " + strSpeciesSize);
        System.out.println("Species Nickname: " + strNickName);
        System.out.println("Sound : Barks!");
    }
    
}
