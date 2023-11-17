/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week13_Program_1_MostFrequentNumbers
    Author:		AJ
    Language:	Java
    Date:		2023-11-13
    Purpose:	The purpose of this program is to create a several reusable methods that accomplish the following:

                1. adds 10 additional random numbers (between 0 and 20 inclusive) to the end of the ArrayList.
                2. prints out all of the elements of the array as rows of 20 numbers at a time per line.
                3. determines and prints out the number that is repeated the most frequently in the list.

                Then, we're looping 4 times to perform the following operations:
                1. Add 10 new numbers
                2. print the array
                3. find the most frequent item

                Then, we're removing 40 random elements from the list and displaying the final array of 10. Also, returning the
                new most frequent item.

----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-11-13	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the modules
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.HashMap;
import java.util.Collections;

// Creating the class
public class AJ_Week13_Program_1_MostFrequentNumbers {
    
    // Creating private variable ( An array - arrStoreNumbers )
    public static List<Integer> arrStoreNumbers = new ArrayList<Integer>();
   
    // Main method
    public static void main(String[] args) {
 
        System.out.println();
        
        // Using AddRandomNumbers method to add 10 random integers between (0 - 20)
        AddRandomNumbers(10);
        
        // Using the printArrayListNums method to display all the elements from array
        printArrayListNums();
        
        // Using HighestNumOccurrences method to display the number that repeated the most
        HighestNumOccurrences();
        
        // Initializing the variable intLoopCount
        int intLoopCount = 0;
        
        // Creating the "while" loop
        while (intLoopCount < 4) {
            
            // Using AddRandomNumbers method to add 10 random integers between (0 - 20)
            AddRandomNumbers(10);
            
            // Using the printArrayListNums method to display all the elements from array
            printArrayListNums();
            
            // Using HighestNumOccurrences method to display the number that repeated the most
            HighestNumOccurrences();
            
            // Increasing the intLoopCount by 1 for every iteration
            intLoopCount++;
        }
         
        // Using the removeElementsFromArray method to remove 40 random integers from the array
        removeElementsFromArray(40);
        
        // Displaying the final array
        System.out.println("\nYour Final Array: ");
        System.out.println("------------------------------");

        // Using the printArrayListNums method to display all the elements from array
        printArrayListNums();

        // Using HighestNumOccurrences method to display the number that repeated the most
        HighestNumOccurrences();

        System.out.println("Thank You !!!\n");
    }
    
    // Creating printArrayListNums method to display all the elements from an array
    public static void printArrayListNums() {
        
        // Iterating through the array 
        for (int j = 0; j < arrStoreNumbers.size(); j++) {
             
            // Printing each element
            System.out.print(arrStoreNumbers.get(j) + "  ");
            
            // Creating a new line to display the elements of the array as rows of 20 numbers at a time per line.
            if (( (j+1) % 20 == 0)){
                System.out.println();
            }
        }
    }
    
    // Creating the AddRandomNumbers method to add random integers
    public static void AddRandomNumbers(int intRandNumParameter) {
        
        // Initializing the random object
        Random randGen = new Random();
        
        // Using loop to add intRandNumParameter number of elements in the array
        for (int i = 0; i < intRandNumParameter; i++) {
            
            // Generating random numbers between (0-20)
            int intRandomNum = randGen.nextInt(21);
            
            // Adding the values to the array
            arrStoreNumbers.add(intRandomNum);

        }
    }
    
    // Creating the HighestNumOccurrences method to display the number that repeated the most
    public static void HighestNumOccurrences() {        
        
        // Creating the hashMap "hshMapStoreFrequency" 
        HashMap<Integer, Integer> hshMapStoreFrequency = new HashMap<>();

        /*  Creating the "for" loop to calculate the number of occurrences of each node and 
            storing the node and frequency as key:value pairs in HashMap. */
        for (int k = 0; k < arrStoreNumbers.size(); k++) {
            
            // Calculating the frequency of node
            int intFrequencyNums = Collections.frequency(arrStoreNumbers, arrStoreNumbers.get(k));

            /*  If the node did not exist in hashMap, we're appending,
                if the node exists, we're updating the new frequency of that node  */
            if ((!hshMapStoreFrequency.containsKey(arrStoreNumbers.get(k))) ||
                    (hshMapStoreFrequency.containsKey(arrStoreNumbers.get(k)))) {

                // "Key" would be the node and "value" would be number of occurrences
                hshMapStoreFrequency.put(arrStoreNumbers.get(k), intFrequencyNums);
            }
        }
        
        // Calculating the Highest frequency in the hashMap by using Collections.max 
        int intMaxValue = Collections.max(hshMapStoreFrequency.values());
        
        // Displaying the highest occurring numbers
        System.out.println();
        System.out.println("\nHighest Occurring numbers:");
        System.out.println("--------------------------------");
        
        // Using "for" loop to iterate through hashMap
        for (Map.Entry<Integer, Integer> mapEntry : hshMapStoreFrequency.entrySet()) {
            
            /* If the frequency value of the node matches the maxValue, we're displaying 
               the node and frequency value since it's the highest occurring number */
            if (mapEntry.getValue().equals(intMaxValue)) {

                // Getting the node ("key") value
                int intfoundKey = mapEntry.getKey();

                // Displaying the output
                System.out.println("Value : " + intfoundKey + " Occurrences : " + hshMapStoreFrequency.get(intfoundKey));
            }
        }
        System.out.println();
    }
    
    // Creating the removeElementsFromArray method to remove random integers from the array
    public static void removeElementsFromArray(int intRemoveParameter) {
        
        // Initializing the random object
        Random randGen1 = new Random();
        
        // Creating the "for" loop to remove the nodes
        for (int l = 0; l < intRemoveParameter; l++) {
            
            // Creating intCount1 variable 
            int intCount1 = l + 1;
            
            // Generating random index value to remove nodes from array
            int intRemoveIndex = randGen1.nextInt(arrStoreNumbers.size());
            
            // If array is not empty, we're removing the elements
            if (!arrStoreNumbers.isEmpty()) {
                
                // Removing the node asssociated with index value intRemoveIndex
                arrStoreNumbers.remove(intRemoveIndex);

                System.out.println(intCount1 + ". The number at index ---> " + intRemoveIndex + " was removed");               

            }
        }
    }
}
