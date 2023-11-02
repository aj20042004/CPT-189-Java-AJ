/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week11_Program_3_AnimalNoise
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

public class AJ_Week11_Program_3_Animal {

    protected String strSpeciesName, strSpeciesSize;
    protected int intSpeciesAge = 0;

    // Default class
    public AJ_Week11_Program_3_Animal() {
        strSpeciesName = "Unknown";
        strSpeciesSize = "Unknown";
    }

    public AJ_Week11_Program_3_Animal(String strNewSpeciesName) {
        strSpeciesName = strNewSpeciesName;   
    }

    public AJ_Week11_Program_3_Animal(String strNewSpecies, String strNewSpeciesSize) {
        strSpeciesName = strNewSpecies;
        strSpeciesSize = strNewSpeciesSize;
    }

    public AJ_Week11_Program_3_Animal(String strNewSpecies, String strNewSpeciesSize, int intNewSpeciesAge) {
        strSpeciesName = strNewSpecies;
        strSpeciesSize = strNewSpeciesSize;
        intSpeciesAge = intNewSpeciesAge;
    }

    // Getters
    public String getSpeciesName() {
        return strSpeciesName;
    }

    public String getSpeciesSize() {
        return strSpeciesSize;
    }

    public int getSpeciesAge() {
        return intSpeciesAge;
    }

    // Setter
    public void setSpeciesName(String strNewSpeciesName) {
        strSpeciesName = strNewSpeciesName;
    }

    public void setSpeciesSize(String strNewSpeciesSize) {
        strSpeciesSize = strNewSpeciesSize;
    }

    public void setSpeciesAge(int intNewSpeciesAge) {
        intSpeciesAge = intNewSpeciesAge;
    }

    // Print method
    public void printAnimalNoise() {
        System.out.println("Species name: " + strSpeciesName);
        System.out.println("Species Size: " + strSpeciesSize);
        System.out.println("The specific sound of this animal is unknown !!!");
    }

}
