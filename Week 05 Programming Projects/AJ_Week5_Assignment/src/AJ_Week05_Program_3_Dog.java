/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week05_Program_3_Dog
    Author:		AJ
    Language:	Java
    Date:		2023-09-22
    Purpose:	The purpose of this program is to 
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-22	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

public class AJ_Week05_Program_3_Dog {


    private String strDogName;
    private int intDogAge;

    public AJ_Week05_Program_3_Dog() {

        strDogName = "Unknown";
        intDogAge = 0;


    }

    public AJ_Week05_Program_3_Dog(String strNewDogName) {

        strDogName = strNewDogName;
        intDogAge = 0;

    }

    public AJ_Week05_Program_3_Dog(int intNewDogAge){

        strDogName = "Unknown";
        intDogAge = intNewDogAge;
    

    }

    public AJ_Week05_Program_3_Dog(String strNewDogName, int intNewDogAge) {

        strDogName = strNewDogName;
        intDogAge = intNewDogAge;

    }
    
    // Getters
    public String getDogName() { 

        return strDogName;
    }

    public int getDogAge(){

        return intDogAge;
    }
    
    // Setters
    public void setDogName(String strNewDogName){
        strDogName = strNewDogName;
    }

    public void setDogAge(int intNewDogAge){
        intDogAge = intNewDogAge;
    }

    public String toString(){
        String strPrintedDetails = "Dog Name is" + strDogName + " and Dog's Age is " + intDogAge;
        return strPrintedDetails;
    }

    
}
