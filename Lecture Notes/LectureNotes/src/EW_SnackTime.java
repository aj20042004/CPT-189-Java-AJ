/*
----------------------------------------------------------------------------------------------------------
    Name:	EW_SnackTime
    Author:	Edward V. Weber
    Language:	Java
    Date:	2023-08-08
    Purpose:	The purpose of this program is to be the driver class for a snack time program.  This
                driver will create several snack objects including fruit and candy.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    EVW		2023-08-08	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

import java.util.Random;

public class EW_SnackTime {
    public static void main(String[] args) {
        Random rndGen = new Random();
        String[] strFruitNames = {"Apple", "Orange", "Grapes", "Banana", "Watermellon"};
        String[] strFruitColors = {"Red", "Orange", "Purple", "Yellow", "Pink"};
        String[] strCandyNames = {"Snickers", "Twix", "Starbursts", "Tootsie Rolls", "Sourballs", "M&Ms"};

        System.out.println("It's Snacktime!  Let's create some random snacks for everybody.");
        EW_Snack[] snkAllSnacks = new EW_Snack[30];
        int intSnackCounter = 0;
        for (EW_Snack snkNextSnack : snkAllSnacks){
            boolean blnSnackType = rndGen.nextBoolean();
            if(blnSnackType) {
                // a true will be a fruit and a false will be a candy
                EW_FruitSnack snkSingleSnack = new EW_FruitSnack();
                int intWhichFruit = rndGen.nextInt(5);
                snkSingleSnack.setSnackName(strFruitNames[intWhichFruit]);
                snkSingleSnack.setSnackColor(strFruitColors[intWhichFruit]);
                snkSingleSnack.setServingQty(1);    // this is the default for all to start
                switch(intWhichFruit){
                    case 0:                     // apple needs nothing
                        break;
                    case 1:                     // orange and banana need peeling
                    case 3:                     // 
                        snkSingleSnack.blnNeedsPeeling = true;
                        break;
                    case 2:                     // grapes 25 per snack
                        snkSingleSnack.setServingQty(25);
                        break;
                    case 4:                     // watermellon 10 chunks per snack, needs peeling and slicing
                        snkSingleSnack.setServingQty(10);
                        snkSingleSnack.setNeedsPeeling(true);
                        snkSingleSnack.setNeedsSlicing(true);
                        break;
                }
                snkAllSnacks[intSnackCounter] = snkSingleSnack;     // replace the blank snack with the newly create snack
            } else {
                // a false will make a Candy Snack
                EW_CandySnack snkSingleSnack = new EW_CandySnack();
                int intWhichCandy = rndGen.nextInt(6);
                snkSingleSnack.setSnackName(strCandyNames[intWhichCandy]);
                snkSingleSnack.setServingQty(1);                    // this is the default for all to start
                snkSingleSnack.setFlavorType("Sweet");          // this is the default flavor
                snkSingleSnack.setShareable(false);          // this is the default flavor
                switch(intWhichCandy){
                    case 0:                     // snickers needs nothing
                    case 1:                     // twix needs nothing
                        break;
                    case 2:                     // starbursts
                        snkSingleSnack.setFlavorType("Tart");
                        snkSingleSnack.setShareable(true);
                        break;
                    case 3:                     // tootsie rolls
                        snkSingleSnack.setShareable(true);
                        break;
                    case 4:                     // sourballs
                        snkSingleSnack.setFlavorType("Sour");
                        snkSingleSnack.setShareable(true);
                        break;
                }
                snkAllSnacks[intSnackCounter] = snkSingleSnack;     // replace the blank snack with the newly create snack
            }
            intSnackCounter++;
        }
        System.out.println("-".repeat(80));        
        System.out.println("All snacks have been created!  Let's see what we have!");
        intSnackCounter = 0;
        for (EW_Snack snkSingleSnack : snkAllSnacks) {
            intSnackCounter++;
            System.out.println("*** Snack # " + intSnackCounter);
            snkSingleSnack.printSnack();
            System.out.println("-".repeat(40));        
        }
    }
}