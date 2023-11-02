/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week11_Program_3_Kennel
    Author:		AJ
    Language:	Java
    Date:		2023-10-31
    Purpose:	The purpose of this program is to be the driver class for an Animal sounds program. This
                driver will create several animal objects including cat, Dog and Tiger 
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-10-31	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Creating the Kennel class
public class AJ_Week11_Program_3_Kennel {
    
    // Main method
    public static void main(String[] args) {
        
        // Creating the animals objects
        AJ_Week11_Program_3_Cat animalObjCat = new AJ_Week11_Program_3_Cat();
        AJ_Week11_Program_3_Dog animalObjDog = new AJ_Week11_Program_3_Dog();
        AJ_Week11_Program_3_Tiger animalObjTiger = new AJ_Week11_Program_3_Tiger();

        // Setting the species name
        animalObjCat.setSpeciesName("Cat");

        // Setting the species size
        animalObjCat.setSpeciesSize("Small");

        // Setting the species skills
        animalObjCat.setSkills("Super-quick feet");

        // Setting the species age
        animalObjCat.setSpeciesAge(2);
        
        // Setting the species name
        animalObjDog.setSpeciesName("Dog");

        // Setting the species size
        animalObjDog.setSpeciesSize("Medium");

        // Setting the species nick name
        animalObjDog.setNickName("Jack");

        // Setting the species age
        animalObjDog.setSpeciesAge(5);
        
        // Setting the species name
        animalObjTiger.setSpeciesName("Tiger");

        // Setting the species country
        animalObjTiger.setCountry("USA");

        // Setting the species size
        animalObjTiger.setSpeciesSize("Big");

        // Setting the species age
        animalObjTiger.setSpeciesAge(6);
        
        // Displaying the report on the animals in the Kennel uing noise methods in Cat , Dog and Tiger class.
        System.out.println("\n------------------------------------------------------");
        System.out.println("        Report on the Animals ins the Kennel");
        System.out.println("------------------------------------------------------");
        animalObjCat.printAnimalNoise();
        System.out.println("------------------------------------------------------");
        animalObjDog.printAnimalNoise();
        System.out.println("------------------------------------------------------");
        animalObjTiger.printAnimalNoise();
        System.out.println("------------------------------------------------------");

    }

}
