/*
----------------------------------------------------------------------------------------------------------
    Name:	EW_Fruit
    Author:	Edward V. Weber
    Language:	Java
    Date:	2023-08-05
    Purpose:	The purpose of this program is to define a Fruit class that will be used by other programs
                and will have constructors, accessors, and mutators.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    EVW		2023-08-05	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/
public class AJ_Fruit {
    //  First - notice that there is NO main method in this class!
    /*
     * Define the properties of this class
     */
    private String strFruitName, strFruitColor;
    private boolean blnNeedsPeeling;
    private float fltFruitWeightInOunces;
    
    /*
     * The following are all constructors for the EW_Fruit class.  They all have the exact same name, but what
     * is different is the number, data type, and order of the parameters that are used by each constructor.
     * Not all combinations of constructors will typically be created.
     */
    public AJ_Fruit() {                     // default constructor - no parameters sent in
        strFruitName = "Unknown";
        strFruitColor = "Unknown";
        blnNeedsPeeling = false;
        fltFruitWeightInOunces = 0.0f;
    }
    public AJ_Fruit(String strNewName) {    // overloaded constructor - 1 string parameter
        strFruitName = strNewName;
        strFruitColor = "Unknown";
        blnNeedsPeeling = false;
        fltFruitWeightInOunces = 0.0f;
    }
    public AJ_Fruit(String strNewName, String strNewColor) {  // constructor with 2 string parameters
        strFruitName = strNewName;
        strFruitColor = strNewColor;
        blnNeedsPeeling = false;
        fltFruitWeightInOunces = 0.0f;
    }
    public AJ_Fruit(String strNewName, String strNewColor, float fltNewWeight) {  // constructor with 2 strings and 1 float
        strFruitName = strNewName;
        strFruitColor = strNewColor;
        blnNeedsPeeling = false;
        fltFruitWeightInOunces = fltNewWeight;
    }

    /*
     * Next we will create the accessor methods also known as 'Getters' because they 'get' the private data and return it
     * to the calling program.  Very often - getters are single line functions.
     */
    public String getFruitName(){
        return strFruitName;
    }
    public String getFruitColor(){
        return strFruitColor;
    }
    public float getFruitWeight(){
        return fltFruitWeightInOunces;
    }
    public boolean needsPeeling(){
        return blnNeedsPeeling;
    }

    /*
     * Finally, we will create mutator methods also known as 'Setters' because they 'set' the private data based on
     * the data that was passed into it.
     */
    public void setFruitName(String strNewFruitName){
        strFruitName = strNewFruitName;
    }
    public void setFruitColor(String strNewFruitColor){
        strFruitColor = strNewFruitColor;
    }
    public void setFruitWeight(float fltNewFruitWeight){
        fltFruitWeightInOunces = fltNewFruitWeight;
    }
    public void setPeelNeeded(boolean blnMustPeelBeforeEating){
        blnNeedsPeeling = blnMustPeelBeforeEating;
    }
    /*
     * The following method called toString is used by EVERY object to provide some output when an object is 
     * used in a print command.
     */
    @Override
    public String toString(){
        String strFruitPrinted = "Fruit Name: " + strFruitName + "\tFruit Color: " + strFruitColor +
                "\n  Weight (oz.): " + fltFruitWeightInOunces + "\t  Needs Peeling?: " + blnNeedsPeeling;
        return strFruitPrinted;
    }
}
