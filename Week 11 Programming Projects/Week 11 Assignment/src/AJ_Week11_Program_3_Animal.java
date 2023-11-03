/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week11_Program_3_AnimalNoise
    Author:		AJ
    Language:	Java
    Date:		2023-10-31
    Purpose:	The purpose of this program is to Create a base class for animals that will include
                the species name, species size and species age. It will also include a noise method 
                which describes the sounds that animals make (eg: barks, meaows, moos, etc.). This 
                class will be used by several other classes including Cat, Dog and other.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-10-31	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Creating the Base animal class
public class AJ_Week11_Program_3_Animal {
    
    // Creating and Initializing the protected variables
    protected String strSpeciesName, strSpeciesSize;
    protected int intSpeciesAge = 0;

    // Default Constructor for Animal class
    public AJ_Week11_Program_3_Animal() {
        strSpeciesName = "Unknown";
        strSpeciesSize = "Unknown";
    }
    
    // Constructor with one parameter
    public AJ_Week11_Program_3_Animal(String strNewSpeciesName) {
        strSpeciesName = strNewSpeciesName;   
    }
    
    // Constructor with two parameters
    public AJ_Week11_Program_3_Animal(String strNewSpecies, String strNewSpeciesSize) {
        strSpeciesName = strNewSpecies;
        strSpeciesSize = strNewSpeciesSize;
    }
    
    // Constructor with 3 parameters
    public AJ_Week11_Program_3_Animal(String strNewSpecies, String strNewSpeciesSize, int intNewSpeciesAge) {
        strSpeciesName = strNewSpecies;
        strSpeciesSize = strNewSpeciesSize;
        intSpeciesAge = intNewSpeciesAge;
    }

    // Accessors for species name
    public String getSpeciesName() {
        return strSpeciesName;
    }
    
    
    // Accessors for species size
    public String getSpeciesSize() {
        return strSpeciesSize;
    }
    
    // Accessors for species age
    public int getSpeciesAge() {
        return intSpeciesAge;
    }

    // Mutators for species name
    public void setSpeciesName(String strNewSpeciesName) {
        strSpeciesName = strNewSpeciesName;
    }
    
    // Mutators for species size
    public void setSpeciesSize(String strNewSpeciesSize) {
        strSpeciesSize = strNewSpeciesSize;
    }
    
    // Mutators for species age
    public void setSpeciesAge(int intNewSpeciesAge) {
        intSpeciesAge = intNewSpeciesAge;
    }

    // Print method for animal sounds
    public void printAnimalNoise() {
        System.out.println("Species name: " + strSpeciesName);
        System.out.println("Species Size: " + strSpeciesSize);
        System.out.println("The specific sound of this animal is unknown !!!");
    }

}
