/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week11_Program_3_Kennel
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

public class AJ_Week11_Program_3_Kennel {

    public static void main(String[] args) {

        AJ_Week11_Program_3_Cat animalObjCat = new AJ_Week11_Program_3_Cat();
        AJ_Week11_Program_3_Dog animalObjDog = new AJ_Week11_Program_3_Dog();
        AJ_Week11_Program_3_Tiger animalObjTiger = new AJ_Week11_Program_3_Tiger();

        // Setting the name
        animalObjCat.setSpeciesName("Cat");
        animalObjCat.setSpeciesSize("Small");
        animalObjCat.setSkills("Super-quick feet");
        animalObjCat.setSpeciesAge(2);

        animalObjDog.setSpeciesName("Dog");
        animalObjDog.setSpeciesSize("Medium");
        animalObjDog.setNickName("Jack");
        animalObjDog.setSpeciesAge(5);

        animalObjTiger.setSpeciesName("Tiger");
        animalObjTiger.setCountry("USA");
        animalObjTiger.setSpeciesSize("Big");
        animalObjTiger.setSpeciesAge(6);
        
        System.out.println("\n------------------------------------------------------");
        System.out.println("        Report on the Animals in the Kennel");
        System.out.println("------------------------------------------------------");
        animalObjCat.printAnimalNoise();
        System.out.println("------------------------------------------------------");
        animalObjDog.printAnimalNoise();
        System.out.println("------------------------------------------------------");
        animalObjTiger.printAnimalNoise();
        System.out.println("------------------------------------------------------");


    }

}
