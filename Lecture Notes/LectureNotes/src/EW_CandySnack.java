/*
----------------------------------------------------------------------------------------------------------
    Name:	EW_CandySnack
    Author:	Edward V. Weber
    Language:	Java
    Date:	2023-08-08
    Purpose:	The purpose of this program is to create a class that extends a basic snack class
                to include other properties for a candy snack.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    EVW		2023-08-08	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

public class EW_CandySnack extends EW_Snack{
    protected String strFlavorType;
    protected boolean blnShareable;

    public void setFlavorType(String strNewFlavor){
        strFlavorType = strNewFlavor;
    }
    public void setShareable(boolean blnNewShareable){
        blnShareable = blnNewShareable;
    }
    public String getFlavorType(){
        return strFlavorType;
    }
    public boolean getShareable(){
        return blnShareable;
    }

    @Override
    public void printSnack(){
        System.out.println("Enjoy your " + strFlavorType + " candy " + strSnackName + "!");
        System.out.println("" + (blnShareable ?  "  Remember you can share this candy!" : ""));
    }
    
}