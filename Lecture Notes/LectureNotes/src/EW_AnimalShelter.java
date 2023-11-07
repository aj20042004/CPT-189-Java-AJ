/*
----------------------------------------------------------------------------------------------------------
    Name:	EW_AnimalShelter
    Author:	Edward V. Weber
    Language:	Java
    Date:	2023-08-08
    Purpose:	The purpose of this program is to be the driver class for an Animal Shelter program. This
                will create several instances of Dogs and manipulate them.  You can easily imagine making
                more classes like Dog (i.e. Cat, Bird, Reptile, Rodent, etc.) and *really* populate this
                shelter!
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    EVW		2023-08-08	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

import java.util.Random;
import java.util.Scanner;

public class EW_AnimalShelter {

    static Scanner scnKbd = new Scanner(System.in);
    static Random rngGenerator = new Random();

    public static void main(String[] args) {
        String[] strDogBreeds = {"Shi Tzu", "German Shepherd", "Boxer", "Pitbull", "Chow-Chow", "Poodle", "Mutt"};
        String[] strDogColors = {"Black", "Brown", "Tan", "Gray", "White", "Brindle","Mixed"};
        String strDrVet = "Dr. Ima Vet", strMrNot = "Mr. Hugh R. Not";

        /*
         * This driver program will create an animal shelter with a random number of dogs (1 - 20) and
         * set their various properties.
         */
        System.out.println("Welcome to Ed's Animal Shelter.  Right now, we are only authorized to");
        System.out.println("  take in Dogs, but soon we will be able to take in Cats, Birds, Reptiles,");
        System.out.println("  Rodents and many more!  (...as soon as we build the other classes!)");
        waitForUser();
        System.out.println("We just heard that the next town over flooded and so we are taking in their");
        System.out.println("  overflow dogs... I'm not sure how many we will get, but they said it would");
        System.out.println("  be no more than our max capacity of 20...  Let's go check them in!");
        System.out.println("(Checking in new dogs...)");
        waitForUser();
        int intCountOfDogs = rngGenerator.nextInt(1,21);
        System.out.println("There were " + intCountOfDogs + " dogs checked in... Here is what we know about them as of now:");
        EW_Dog[] dogAllDogs = new EW_Dog[intCountOfDogs];
        int intNewDogNumber = 1;
        for (EW_Dog dogOneDog : dogAllDogs){
            System.out.println("Now processing new dog intake # " + intNewDogNumber);
            dogOneDog = new EW_Dog();
            dogOneDog.setStrBreed(strDogBreeds[rngGenerator.nextInt(0, strDogBreeds.length)]);
            dogOneDog.setStrColor(strDogColors[rngGenerator.nextInt(0, strDogColors.length)]);
            dogOneDog.printAdoptionStatus();
            dogAllDogs[intNewDogNumber - 1] = dogOneDog;
            intNewDogNumber++;
            System.out.println("-".repeat(40));
        }
        waitForUser();
        System.out.println("Our resident veterinarian, " + strDrVet + ", and her assistant, " + strMrNot);
        System.out.println("      ...   (... wait for it ...)   ... ");
        System.out.println("  ... only has time to check out the first " + Math.min(5, intCountOfDogs) + " right now.");
        System.out.println("  ... So, " + strDrVet + " and " + strMrNot + " will look the dogs over now...");
        waitForUser();
        String[] strNewDogNames = {"Bear", "Bogey", "Gizmo", "Widget", "Spot"};
        int intAdoptableDogs = 0;
        for (intNewDogNumber = 0; intNewDogNumber < Math.min(5,intCountOfDogs); intNewDogNumber++){
            EW_Dog dogTempDog = dogAllDogs[intNewDogNumber];
            dogTempDog.setStrAnimalName(strNewDogNames[intNewDogNumber]);   // set the next dog name
            dogTempDog.setBlnNeedsMeds(rngGenerator.nextBoolean());     // flip the coin for needing meds
            dogTempDog.setBlnNeedsShots(rngGenerator.nextBoolean());    // flip the coin for needing shots
            if(dogTempDog.getNeedsShots() || dogTempDog.getNeedsMeds()){
                // if either shots or meds needed - dog is NOT adoptable
                dogTempDog.setBlnIsAdoptable(false);
            } else {
                dogTempDog.setBlnIsAdoptable(true); // YAY! Adoptable
                intAdoptableDogs++;
            }
            dogAllDogs[intNewDogNumber] = dogTempDog;
            System.out.println("Dog # " + (intNewDogNumber + 1) + " has been checked by " + 
                    strDrVet + " and " + strMrNot + ".");
            dogAllDogs[intNewDogNumber].printAdoptionStatus();
            System.out.println("-".repeat(40));
        }
        waitForUser();
        System.out.println("That is all we have time to process tonight... Sleep well puppies!");
        System.out.println("At the close of the day, we now have " + dogAllDogs.length + " dogs in");
        System.out.println("  the shelter and " + intAdoptableDogs + " of them are " +
            (intAdoptableDogs>0 ? "ADOPTABLE NOW!" : "adoptable now."));

    }
    public static void waitForUser(){
        System.out.println("-".repeat(80));
        System.out.println("Hit the  key when ready to continue...");
        scnKbd.nextLine();
    }
    
}
