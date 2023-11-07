/*
----------------------------------------------------------------------------------------------------------
    Name:	EW_Animal
    Author:	Edward V. Weber
    Language:	Java
    Date:	2023-08-08
    Purpose:	The purpose of this program is to create an Animal abstract base class that will be use
                for specific animals to extend.
                
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    EVW		2023-08-08	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/
public abstract class EW_Animal implements EW_Adoptable{

    // initializing all variables
    protected String strAnimalName = "Unnammed";
    protected boolean blnIsAdoptable = false, blnNeedsShots = true, blnNeedsMeds = false;
    protected int intDaysInShelter = 1;

    @Override
    public boolean availableForAdoption() {
        // if this is an instance of the base class only... we do NOT adopt out untyped animals!
        return false;
    }

    @Override
    public void printAdoptionStatus() {
        System.out.println("This animal is unknown and is NOT adoptable.");
    }
    /*
     * These mutators were auto-generated... names can be confusing to a new programmer!
     */
    public void setStrAnimalName(String strAnimalName) {
        this.strAnimalName = strAnimalName;
    }
    public void setBlnIsAdoptable(boolean blnIsAdoptable) {
        this.blnIsAdoptable = blnIsAdoptable;
    }
    public void setBlnNeedsMeds(boolean blnNeedsMeds) {
        this.blnNeedsMeds = blnNeedsMeds;
    }
    public void setBlnNeedsShots(boolean blnNeedsShots) {
        this.blnNeedsShots = blnNeedsShots;
    }
    public void setIntDaysInShelter(int intDaysInShelter) {
        this.intDaysInShelter = intDaysInShelter;
    }
    /*
     * The first two accessors were auto-generated but the other three wouldn't... Hmmm....!
     */
    public String getStrAnimalName() {
        return strAnimalName;
    }
    public int getIntDaysInShelter() {
        return intDaysInShelter;
    }
    public boolean getIsAdoptable(){
        return blnIsAdoptable;
    }
    public boolean getNeedsShots(){
        return blnNeedsShots;
    }
    public boolean getNeedsMeds(){
        return blnNeedsMeds;
    }
}