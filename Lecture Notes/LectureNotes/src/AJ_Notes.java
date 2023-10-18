/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Notes
    Author:		AJ
    Language:	Java
    Date:		2023-09-26
    Purpose:	The purpose of this program is to practice conditional statements
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-26	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

import java.util.Scanner;


public class AJ_Notes {
    public static void main(String[] args) {
        int[] counts = new int[51]; // Array to hold the counts for each number (0 to 50)
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter integers in the range 0 to 50 (enter a number outside this range to finish): ");
        
        int input;
        while (true) {
            input = scanner.nextInt();
            
            if (input < 0 || input > 50) {
                break;
            }
            
            counts[input]++;
        }
        
        System.out.println("Numbers with entries and their counts:");
        for (int i = 0; i <= 50; i++) {
            if (counts[i] > 0) {
                System.out.println(i + ": " + counts[i] + " occurrences");
            }
        }
    }
}

