import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Map;

public class ArrayListProgram {

    private static final int ARRAY_SIZE = 50;

    public static void main(String[] args) {
        // Create an empty ArrayList
        List<Integer> arrayList = new ArrayList<>();

        // Call reusable methods
        addRandomNumbers(arrayList, 10);
        printArrayList(arrayList);
        printMostFrequentItem(arrayList);

        // Run a loop 4 times
        for (int i = 0; i < 4; i++) {
            addRandomNumbers(arrayList, 10);
            printArrayList(arrayList);
            printMostFrequentItem(arrayList);
        }

        // Remove 40 random elements from the list
        removeRandomElements(arrayList, 40);

        // Print the final array of 10
        printArrayList(arrayList);

        // Find the new most frequent item of the remaining 10
        printMostFrequentItem(arrayList.subList(0, 10));
    }

    // Method to add random numbers to the ArrayList
    private static void addRandomNumbers(List<Integer> arrayList, int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            arrayList.add(random.nextInt(21));
        }
    }

    // Method to print the elements of the ArrayList in rows of 20
    private static void printArrayList(List<Integer> arrayList) {
        System.out.println("ArrayList:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Method to find and print the most frequent item in the ArrayList
    private static void printMostFrequentItem(List<Integer> arrayList) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arrayList) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mostFrequentItem = Collections.max(frequencyMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        int frequency = frequencyMap.get(mostFrequentItem);

        System.out.println("Most frequent item: " + mostFrequentItem + " (Occurrences: " + frequency + ")");
        System.out.println();
    }

    // Method to remove a specified number of random elements from the ArrayList
    private static void removeRandomElements(List<Integer> arrayList, int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int randomIndex = random.nextInt(arrayList.size());
            arrayList.remove(randomIndex);
        }
    }
}
