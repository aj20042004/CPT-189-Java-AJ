/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week13_Program_1_MostFrequentNumbers
    Author:		AJ
    Language:	Java
    Date:		2023-11-13
    Purpose:	The purpose of this program is to 
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-11-13	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Listing the numbers

// Importing the modules
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.HashMap;
import java.util.Collections;

public class AJ_Week13_Program_1_MostFrequentNumbers {

    public static List<Integer> arrStoreNumbers = new ArrayList<Integer>();
    public static HashMap<Integer, Integer> HshMapStoreFrequency = new HashMap<>();
    public static List<Integer> removingNumIndexes = new ArrayList<Integer>();

    public static void main(String[] args) {

        System.out.println();

        AddRandomNumbers(10);

        printArrayListNums();

        HighestNumOccurrences();

        int intLoopCount = 0;

        while (intLoopCount < 4) {

            AddRandomNumbers(10);

            printArrayListNums();

            HighestNumOccurrences();

            intLoopCount++;
        }

        removeElementsFromArray(40);

        System.out.println("\nYour Final Array: ");
        System.out.println("------------------------------");
        printArrayListNums();
        HighestNumOccurrences();

        System.out.println("Thank You !!!\n");
    }

    public static void printArrayListNums() {

        for (int j = 0; j < arrStoreNumbers.size(); j++) {
    
            System.out.print(arrStoreNumbers.get(j) + "  ");
        
            if ((j == 19) || (j == 39)){
                System.out.println();
            }
        }
    }

    public static void AddRandomNumbers(int intRandNumParameter) {

        Random randGen = new Random();

        for (int i = 0; i < intRandNumParameter; i++) {

            int intRandomNum = randGen.nextInt(21);

            arrStoreNumbers.add(intRandomNum);

        }
    }

    public static void HighestNumOccurrences() {

        for (int k = 0; k < arrStoreNumbers.size(); k++) {

            int intFrequencyNums = Collections.frequency(arrStoreNumbers, arrStoreNumbers.get(k));

            if ((!HshMapStoreFrequency.containsKey(arrStoreNumbers.get(k))) ||
                    (HshMapStoreFrequency.containsKey(arrStoreNumbers.get(k)))) {

                // "Key" would be user entered value and "value" would be number of occurrences
                HshMapStoreFrequency.put(arrStoreNumbers.get(k), intFrequencyNums);
            }
        }

        int maxValue = Collections.max(HshMapStoreFrequency.values());

        System.out.println();
        System.out.println("\nHighest Occurring numbers:");
        System.out.println("--------------------------------");
        for (Map.Entry<Integer, Integer> entry : HshMapStoreFrequency.entrySet()) {

            if (entry.getValue().equals(maxValue)) {
                int intfoundKey = entry.getKey();
                System.out.println("Value : " + intfoundKey + " Occurrences : " + HshMapStoreFrequency.get(intfoundKey));
            }
        }
        System.out.println();
    }

    public static void removeElementsFromArray(int intRemoveParameter) {

        Random randGen1 = new Random();

        for (int l = 0; l < intRemoveParameter; l++) {

            int count1 = l + 1;

            int intRemoveIndex = randGen1.nextInt(arrStoreNumbers.size());

            if (!arrStoreNumbers.isEmpty()) {

                arrStoreNumbers.remove(intRemoveIndex);
                System.out.println(count1 + ". The number at index ---> " + intRemoveIndex + " was removed");

            }
        }
    }
}
