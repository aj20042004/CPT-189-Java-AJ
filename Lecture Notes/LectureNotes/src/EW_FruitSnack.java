/*
----------------------------------------------------------------------------------------------------------
    Name:	EW_FruitSnack
    Author:	Edward V. Weber
    Language:	Java
    Date:	2023-08-08
    Purpose:	The purpose of this program is to create a class that extends a basic snack class
                to include other properties for a fruit snack.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    EVW		2023-08-08	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

public class EW_FruitSnack extends EW_Snack{
    protected boolean  blnNeedsPeeling = false, blnNeedsSlicing = false;

    public void setNeedsPeeling(boolean blnNewPeeling){
        blnNeedsPeeling = blnNewPeeling;
    }
    public void setNeedsSlicing(boolean blnNewSlicing){
        blnNeedsSlicing = blnNewSlicing;
    }
    public boolean getNeedsPeeling(){
        return blnNeedsPeeling;
    }
    public boolean getNeedsSlicing(){
        return blnNeedsSlicing;
    }

    @Override
    public void printSnack(){
        System.out.println("The " + intSnackServingQty + " " + strSnackColor + " " + strSnackName + 
                (blnNeedsPeeling ? " needs peeling before eating." : " is ready to eat."));
        System.out.println("" + (blnNeedsSlicing ?  "  You also need to slice this fruit." : ""));
    }
    
}