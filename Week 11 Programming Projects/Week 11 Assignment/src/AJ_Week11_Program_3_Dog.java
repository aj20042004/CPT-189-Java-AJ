/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week11_Program_3_Dog
    Author:		AJ
    Language:	Java
    Date:		2023-10-31
    Purpose:	The purpose of this program is to create a class that extends a basic animal class to
                include other properties for a Dog class.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-10-31	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/


// Creating the Dog class by extending the animal class
public class AJ_Week11_Program_3_Dog extends AJ_Week11_Program_3_Animal {
    
    // Creating the protected variable
    protected String strNickName;
    
    // Mutators for species nick name
    public void setNickName(String strNewNickName) {
        strNickName = strNewNickName;
    }
    
    // Accessors for species nick name
    public String getNickName(){
        return strNickName;
    }
    
    // Print method for Dog noise
    @Override
    public void printAnimalNoise() {

        System.out.println("Species Name: " + strSpeciesName);
        System.out.println("Species Size: " + strSpeciesSize);
        System.out.println("Species Nickname: " + strNickName);
        System.out.println("Sound : Barks!");
    }
    
}
