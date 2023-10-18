/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week09_Program_1_ArbitraryNumOfInts
    Author:		AJ
    Language:	Java
    Date:		2023-10-16
    Purpose:	The purpose of this program is to 
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-10-16	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashMap;

public class AJ_Week09_Program_1_ArbitraryNumOfInts {

    public static void main(String[] args) {
        
        ArrayList<Integer> arrListStoreNums = new ArrayList<>();
        HashMap<Integer,Integer> HshMapStoreFrequency = new HashMap<>();
        Scanner scnr = new Scanner(System.in);
        System.out.println("\nEnter an Integer number within the range (0 - 50) inclusive to continue or Enter a number outside the given range to exit: ");
        int numOfRandInts = scnr.nextInt();
        while (numOfRandInts >= 0 && numOfRandInts <= 50) { 

            arrListStoreNums.add(numOfRandInts);
            System.out.println("Enter an Integer number within the range (0 - 50) inclusive to continue or Enter a number outside the given range to exit: ");
            numOfRandInts = scnr.nextInt();

        }
        
        System.out.println("\nList of Numbers:");
        System.out.println("--------------------------------------------------------------------");
        System.out.print("The numbers you entered are: ");

        for (int k = 0; k < arrListStoreNums.size(); k++) {
            
    
            int intFrequencyNums = Collections.frequency(arrListStoreNums, arrListStoreNums.get(k));
            
            if (!HshMapStoreFrequency.containsKey(arrListStoreNums.get(k))) { 

                HshMapStoreFrequency.put(arrListStoreNums.get(k), intFrequencyNums);

            }

            System.out.print(arrListStoreNums.get(k) + " ");
 
        }
        System.out.println("\n");
        System.out.println("The Number of Occurrences of each element are:");
        System.out.println("--------------------------------------------------------------------");
    
        // Sort the keys
        ArrayList<Integer> sortedKeys = new ArrayList<>(HshMapStoreFrequency.keySet());
        Collections.sort(sortedKeys);

        // Iterate over sorted keys
        for (Integer key : sortedKeys) {
            System.out.println(key + " : " + HshMapStoreFrequency.get(key) + " Occurrences");
        }
        
        System.out.println("-----------------------------------------------------------------------");
        scnr.close();
    }
    
}
