/*
----------------------------------------------------------------------------------------------------------
    Name:	EW_Adoptable
    Author:	Edward V. Weber
    Language:	Java
    Date:	2023-08-08
    Purpose:	The purpose of this program is to create an interface that will be used by the base class
                animal.  This interface will define the abstract methods for availableForAdoption, and
                printAdoptionStatus.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    EVW		2023-08-08	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/
public interface EW_Adoptable {

    abstract boolean availableForAdoption();     // the abstract method that every animal that implements must override

    abstract void printAdoptionStatus();         // abstract method to tell details about the adoptability of an animal
}