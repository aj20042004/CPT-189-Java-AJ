/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week09_Program_1_ArbitraryNumOfInts
    Author:		AJ
    Language:	Java
    Date:		2023-10-16
    Purpose:	The purpose of this program is to read an arbitrary number of integers that are in the range
                ( 0 to 50) inclusive and counts how many occurrences of each integer value exists. We are using
                a sentinel value which is outside the range (0 to 50) to break the loop and print all the 
                numbers that had one or more occurrences.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-10-16	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the modules
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashMap;

public class AJ_Week09_Program_1_ArbitraryNumOfInts {

    // main method
    public static void main(String[] args) {

        // Creating an array list arrListStoreNums to store all the user input data
        ArrayList<Integer> arrListStoreNums = new ArrayList<>();

        /*
         * Creating a Hash map to store the data in key:value pairs, so that it
         * makes it easier to calculate number of occurrences
         */
        HashMap<Integer, Integer> HshMapStoreFrequency = new HashMap<>();

        // Intializing the scanner object
        Scanner scnr = new Scanner(System.in);

        System.out.println("\nEnter an Integer number within the range (0 - 50) inclusive to continue or Enter a number outside the given range to exit: ");

        // Getting an user input using scanner
        int intNumOfRands = scnr.nextInt();
        
        // Intializing the Loop Switch
        boolean blnLoopSwitch = true;
        
        // Creating a "while" loop to process the data
        while (blnLoopSwitch) {
            
            // if the user entered number is outside the range (0 to 50)
            if (intNumOfRands < 0 || intNumOfRands > 50) {

                System.out.println("\nSorry! There is no any numbers to process.");
                System.out.println("---------------------------------------------------------");
                System.out.println("Thank you");
                System.out.println("----------------------------------------------------------");

                // Turning off the loop switch by setting it to "false"
                blnLoopSwitch = false;

            }
            
            // if the user entered number is in the range (0 to 50)
            else {

                // Adding all the elements to the array list
                arrListStoreNums.add(intNumOfRands);

                System.out.println("Enter an Integer number within the range (0 - 50) inclusive to continue or Enter a number outside the given range to exit: ");

                // Getting an user input using scanner util user enters a sentinel value 
                intNumOfRands = scnr.nextInt();
                
                // If user enters a sentinel value
                if (intNumOfRands < 0 || intNumOfRands > 50) {

                    // Displaying all the numbers
                    System.out.println("\nList of Numbers:");
                    System.out.println("--------------------------------------------------------------------");
                    System.out.print("The numbers you entered are: ");

                    // Creating a "for" loop for adding elements in hash map and counting number of occurrences
                    for (int k = 0; k < arrListStoreNums.size(); k++) {

                        // Counting the number of occurrences using "Collection.frequency()"
                        int intFrequencyNums = Collections.frequency(arrListStoreNums, arrListStoreNums.get(k));

                        // If the user input value is not in hash map, we are adding the data
                        if (!HshMapStoreFrequency.containsKey(arrListStoreNums.get(k))) {

                            // "Key" would be user entered value and "value" would be number of occurrences
                            HshMapStoreFrequency.put(arrListStoreNums.get(k), intFrequencyNums);

                        }

                        // Displaying the user entered values
                        System.out.print(arrListStoreNums.get(k) + " ");

                    }
                    
                    System.out.println("\n");
                    System.out.println("The Number of Occurrences of each element are:");
                    System.out.println("-----------------------------------------------------------------------");

                    // Creating an array list "arrSortedKeys" to store sorted "key" values.
                    ArrayList<Integer> arrSortedKeys = new ArrayList<>(HshMapStoreFrequency.keySet());
                    Collections.sort(arrSortedKeys);

                    // Using "for" loop to iterate over the arrSortedKeys array list and printing
                    // the elements and number of occurrences
                    for (Integer intKey : arrSortedKeys) {
                        System.out.println(intKey + " : " + HshMapStoreFrequency.get(intKey) + " Occurrences");
                    }

                    System.out.println("-----------------------------------------------------------------------");

                    // Turning off the loop switch by setting it to "false"
                    blnLoopSwitch = false;

                }

            }

        }

        // Closing the scanner object
        scnr.close();
    }

}