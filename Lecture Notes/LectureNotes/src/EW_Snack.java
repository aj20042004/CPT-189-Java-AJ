/*
----------------------------------------------------------------------------------------------------------
    Name:	EW_Snack
    Author:	Edward V. Weber
    Language:	Java
    Date:	2023-08-08
    Purpose:	The purpose of this program is to Create a base class for snacks that will include
                the snack name, snack color, serving quantity, and if any preparation is needed 
                before eating the snack.  It will be used by several other classes including FruitSnack,
                CandySnack, and others.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    EVW		2023-08-08	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/
public class EW_Snack {

    protected String strSnackName, strSnackColor;
    protected int intSnackServingQty = 1;         // always assume 1 qty per snack

    /*
     * Create all of the constructors for a basic snack object
     */
    public EW_Snack(){
        strSnackName = "Unknown";
        strSnackColor = "Unknown";
    }
    public EW_Snack(String strNewName){
        strSnackName = strNewName;
        strSnackColor = "Unknown";
    }
    public EW_Snack(String strNewName, String strNewColor){
        strSnackName = strNewName;
        strSnackColor = strNewColor;
    }
    
    /*
     * Create the accessors
     */
    public String getSnackName(){
        return strSnackName;
    }
    public String getSnackColor(){
        return strSnackColor;
    }
    public int getSnackServingQty(){
        return intSnackServingQty;
    }
    /*
     * Create Mutators
     */
    public void setSnackName(String strNewName){
        strSnackName = strNewName;
    }
    public void setSnackColor(String strNewColor){
        strSnackColor = strNewColor;
    }
    public void setServingQty(int intNewQty){
        intSnackServingQty = intNewQty;
    }

    public void printSnack(){
        System.out.println("This snack is a " + strSnackName + " with a color of " + strSnackColor);
        System.out.println("  It contains " + intSnackServingQty + " serving quantity." );
    }
}