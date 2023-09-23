/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week05_Program_3_Dog
    Author:		AJ
    Language:	Java
    Date:		2023-09-22
    Purpose:	The purpose of this program is to define a Dog class that will be used by other programs 
                and will have constructors, accessors, and mutators
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-22	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

public class AJ_Week05_Program_3_Dog {

    // Private variables
    private String strDogName;
    private int intDogAge;
    
    // Default constructor (No parameters)
    public AJ_Week05_Program_3_Dog() {

        strDogName = "Unknown";
        intDogAge = 0;
    }

    // Overloaded Constructor - 1 string parameter
    public AJ_Week05_Program_3_Dog(String strNewDogName) {

        strDogName = strNewDogName;
        intDogAge = 0;
    }
    
    // Constructor with 1 integer parameter
    public AJ_Week05_Program_3_Dog(int intNewDogAge){

        strDogName = "Unknown";
        intDogAge = intNewDogAge;
    }
    
    // Constructor with 1 string parameters and 1 integer parameters
    public AJ_Week05_Program_3_Dog(String strNewDogName, int intNewDogAge) {

        strDogName = strNewDogName;
        intDogAge = intNewDogAge;
    }
        
    // Getter method for dog name
    public String getDogName() { 
        return strDogName;
    }
    
    // Getter method for dog age
    public int getDogAge(){
        return intDogAge;
    }
    
    // Setter method for dog name
    public void setDogName(String strNewDogName){
        strDogName = strNewDogName;
    }
    
    // Setter method for dog age
    public void setDogAge(int intNewDogAge){
        intDogAge = intNewDogAge;
    }


    // Method convertDgToHumanYrs() for calculating the dog years in terms of Human years 
    public int convertDgToHumanYrs(){

        int intHumanYears = intDogAge * 7;     
        return intHumanYears;
    }
    
    // toString() method to provide some output when an object is used in a print command
    public String toString(){
        String strPrintedDetails = "The Dog Name is " + strDogName + " and Dog's Age is " + intDogAge;
        return strPrintedDetails;
    }

    
}
