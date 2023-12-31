/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week08_MidTerm_Program_1_PlayList
    Author:		AJ
    Language:	Java
    Date:		2023-10-09
    Purpose:	The purpose of this program is to ask the user if he/she wants to create a music playlist.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-10-09	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the Modules
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;

public class AJ_Week08_MidTerm_Program_1_PlayList {

    // Main Method
    public static void main(String[] args) {

        // Creating Scanner Object
        Scanner scnr = new Scanner(System.in);

        // Intializing the Main Loop Switch
        boolean blnMainLoopSwitch = true;

        // Starting the while loop
        while (blnMainLoopSwitch) {

            // Displaying the Title
            System.out.println("\nWelcome to Playlist App !");
            System.out
                    .println("--------------------------------------------------------------------------------------");

            // Asking user whether they want to create a playlist or not.
            System.out.print("Do you want to create a Music Play List ? Type '0' to create or type '-1' to exit: ");
            int intUsrOption = scnr.nextInt();

            // flushing the CR from buffer
            scnr.nextLine();

            // If the user does not want to create a playlist, exit the Loop and Stop
            if (intUsrOption == -1) {
                System.out.println("\nThank you !!!");
                System.out.println(
                        "---------------------------------------------------------------------------------------");
                blnMainLoopSwitch = false;
            }

            // If user wants to create a playlist
            else if (intUsrOption == 0) {

                // Prompting the user for name of the Playlist
                System.out.print("\nName of the Playlist: ");
                String strUsrPlayListName = scnr.nextLine();

                System.out.println(
                        "-----------------------------------------------------------------------------------------------");
                System.out.println(
                        "\nMinimum of 3 songs needs to be in Playlist and Maximum of 10 songs can be added to playlist.");
                System.out.println(
                        "-----------------------------------------------------------------------------------------------");

                // Prompting the user for number of songs in Playlist
                System.out.print("How many songs will be in Playlist ? \n");
                int intUsrPlayListSongCnt = scnr.nextInt();

                // flushing the CR from buffer
                scnr.nextLine();

                // If Total number of songs that user entered is less than 3
                if (intUsrPlayListSongCnt < 3) {
                    System.out.println("\nSorry ! Minimum songs needs to be stored is 3\n");
                    System.out.println(
                            "-----------------------------------------------------------------------------------------------");
                    break;
                }

                // If User entered correct number of songs (Minimim of 3 and Maximum of 10)
                else if (intUsrPlayListSongCnt >= 3 & intUsrPlayListSongCnt <= 10) {

                    // Creating the Array list for storing the song ID, song name, song artist name,
                    // song duration and song genre
                    List<Integer> intArraySongIdTracker = new ArrayList<>(intUsrPlayListSongCnt);
                    List<String> strArraySongNameTracker = new ArrayList<>(intUsrPlayListSongCnt);
                    List<String> strArraySongArtistName = new ArrayList<>(intUsrPlayListSongCnt);
                    List<Integer> intArraySongDuration = new ArrayList<>(intUsrPlayListSongCnt);
                    List<String> strArraySongGenre = new ArrayList<>(intUsrPlayListSongCnt);

                    // Creating a "for" loop for adding the songs data in an array list.
                    for (int i = 0; i < intUsrPlayListSongCnt; i++) {

                        // Counter for song Number
                        int intValCount = i + 1;

                        System.out.print("\nSong " + intValCount + " Details:\n");
                        System.out.println("-------------------------------------------------------");

                        // Adding the song id in intArraySongIdTracker array list
                        intArraySongIdTracker.add(intValCount);

                        // Getting the input for song name
                        System.out.print("\nEnter the Song Name please: ");
                        String strSongName = scnr.nextLine();

                        // Adding the song name in strArraySongNameTracker array list
                        strArraySongNameTracker.add(strSongName);

                        // Getting the input for song artist name
                        System.out.print("\nEnter the Artist Name: ");
                        String strSongArtist = scnr.nextLine();

                        // Adding the song artist name in strArraySongArtistName array list
                        strArraySongArtistName.add(strSongArtist);

                        // Getting the input for song Duration in seconds
                        System.out.print("\nEnter the Song Duration (In Seconds): ");
                        int intDurationSongData = scnr.nextInt();

                        // Adding the song duration in intArraySongDuration array list
                        intArraySongDuration.add(intDurationSongData);

                        // flushing the CR from buffer
                        scnr.nextLine();

                        // Getting the input for song genre
                        System.out.print("\nEnter the song genre (eg: Pop, Rock, Rap, Country, etc..): ");
                        String strGenreSong = scnr.nextLine();

                        // Adding the song genre in strArraySongGenre array list
                        strArraySongGenre.add(strGenreSong);

                    }

                    // Printing the songs data for the user
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("\nDetails about Your Songs:");
                    System.out.println("----------------------------------------------------------------------");

                    // Using "for" loop to iterate through diffrent array and fetch the data
                    for (int k = 0; k < intUsrPlayListSongCnt; k++) {

                        // Counter for song Number
                        int intValCount2 = k + 1;
                        System.out.println("\nSong " + intValCount2 + " Details:\n");

                        // Getting the songs data from their respective array list
                        System.out.print("Song Name: " + strArraySongNameTracker.get(k) + "\n");
                        System.out.print("Song Artist: " + strArraySongArtistName.get(k) + "\n");
                        System.out.print("Song Duration in Seconds: " + intArraySongDuration.get(k) + "\n");
                        System.out.print("Song Genre: " + strArraySongGenre.get(k) + "\n");
                        System.out.println(
                                "-----------------------------------------------------------------------------------------------------------------------");

                    }

                    // Prompting the user to ask whether they need to make any changes to the data
                    System.out.print(
                            "If you need to make any changes to songs data. Type the 'Number of the song' to make changes otherwise type '-1' to display the final songs data: ");

                    int intUsrEditOption = scnr.nextInt();

                    // Checking whether user entered the appropriate song number to edit
                    if (intArraySongIdTracker.contains(intUsrEditOption)) {

                        // Intializing the second loop switch
                        boolean blnOptionLoopSwitch = true;

                        // Creating the loop for editing options
                        while (blnOptionLoopSwitch) {

                            // Asking the user which data should be modified
                            System.out.println("\nWhat Song data needs to be changed:");
                            System.out.println("------------------------------------------------");
                            System.out.println("1. Song Name");
                            System.out.println("2. Song Artist");
                            System.out.println("3. Song Duration");
                            System.out.println("4. Song Genre");

                            // Getting the user input for option
                            System.out.println("\nEnter the Option Number: ");
                            int intUsrEditOptionNumber = scnr.nextInt();

                            // flushing the CR from buffer
                            scnr.nextLine();

                            // If user chooses option 1, we're editing the song name
                            if (intUsrEditOptionNumber == 1) {

                                // Getting the index value of the song name to change it's data
                                int intIndexValOfName = intUsrEditOption - 1;
                                System.out.println("-----------------------------------------------------");

                                // Getting user input for new song name to be updated
                                System.out.println("Enter new song name: ");
                                String strUpdatingSongName = scnr.nextLine();

                                // Updating the strArraySongNameTracker array list with the new song name data
                                strArraySongNameTracker.set(intIndexValOfName, strUpdatingSongName);
                                System.out.println("\nSuccessfully Updated the Song Name data\n");

                            }

                            // If user chooses option 2, we're editing the song artist name
                            else if (intUsrEditOptionNumber == 2) {

                                // Getting the index value of the song artist to change it's data
                                int intIndexValOfArtist = intUsrEditOption - 1;
                                System.out.println("----------------------------------------------------------");

                                // Getting user input for new song artist to be updated
                                System.out.println("Enter new Artist name: ");
                                String strUpdatingArtistName = scnr.nextLine();

                                // Updating the strArraySongArtistName array list with the new song name data
                                strArraySongArtistName.set(intIndexValOfArtist, strUpdatingArtistName);
                                System.out.println("\nSuccessfully Updated the Song Artist data\n");

                            }

                            // If user chooses option 3, we're editing the song duration
                            else if (intUsrEditOptionNumber == 3) {

                                // Getting the index value of the song duration to change it's data
                                int intIndexValOfDuration = intUsrEditOption - 1;
                                System.out.println("----------------------------------------------------------");

                                // Getting user input for new song duration to be updated
                                System.out.println("Enter new song duration in seconds: ");
                                int strUpdatingSongDuration = scnr.nextInt();

                                // flushing the CR from buffer
                                scnr.nextLine();

                                // Updating the intArraySongDuration array list with the new song name data
                                intArraySongDuration.set(intIndexValOfDuration, strUpdatingSongDuration);
                                System.out.println("\nSuccessfully Updated the Song Duration data\n");

                            }

                            // If user chooses option 4, we're editing the song genre
                            else if (intUsrEditOptionNumber == 4) {

                                // Getting the index value of the song genre to change it's data
                                int intIndexValOfGenre = intUsrEditOption - 1;
                                System.out.println("----------------------------------------------------------");

                                // Getting user input for new song genre to be updated
                                System.out.println("Enter new Genre name (eg: Pop, Rock, Rap, Country, etc..): ");
                                String strUpdatingGenreName = scnr.nextLine();

                                // Updating the strArraySongGenre array list with the new song name data
                                strArraySongGenre.set(intIndexValOfGenre, strUpdatingGenreName);
                                System.out.println("\nSuccessfully Updated the Song Genre data\n");

                            }

                            // Breaking the loop if user entered invalid number in the option
                            else {
                                System.out.println("\nInvalid Option Number");
                                break;
                            }

                            // Asking the user again whether they want to modify any other song data
                            System.out.print(
                                    "If you need to make any changes to songs data. Type the 'Number of the song' to make changes otherwise type '-1' to exit Editing: ");
                            intUsrEditOption = scnr.nextInt();

                            // If user decides not to make any changes, we're jumping out of the "while"
                            // loop
                            if (intUsrEditOption == -1) {

                                // Turning off the loop option switch
                                blnOptionLoopSwitch = false;
                            }

                        }

                    }

                    // Printing all the final songs data in the output
                    System.out.println("\n");
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Playlist Name: " + strUsrPlayListName);
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Final List of Songs data");
                    System.out.println("--------------------------------------------------------");

                    // Intializing the variable to calculate total duration of all songs in seconds
                    int intTotalSongDurationSec = 0;

                    // Printing the final songs data
                    for (int p = 0; p < intUsrPlayListSongCnt; p++) {

                        // Counter for song Number
                        int intValCount2 = p + 1;
                        System.out.println("\nSong " + intValCount2 + " Details:\n");

                        // Getting the songs data from their respective array list
                        System.out.print("Song Name: " + strArraySongNameTracker.get(p) + "\n");
                        System.out.print("Song Artist: " + strArraySongArtistName.get(p) + "\n");
                        System.out.print("Song Duration in Seconds: " + intArraySongDuration.get(p) + "\n");
                        System.out.print("Song Genre: " + strArraySongGenre.get(p) + "\n");
                        System.out.println(
                                "-----------------------------------------------------------------------------------------------------------------------");

                        // Adding the song duration data to intTotalSongDurationSec to calculate the
                        // total duration of all songs in seconds
                        intTotalSongDurationSec += intArraySongDuration.get(p);
                    }

                    // Calculating the average song duration
                    int intAvgSongDurationSec = intTotalSongDurationSec / intArraySongDuration.size();

                    // Creating a HashMap to store song count in each Genre
                    HashMap<String, Integer> hashMapGenreCounts = new HashMap<>();
                    
                    // Using "for" loop to add elements from strArraySongGenre array list to hashMapGenreCounts hashMap
                    for (int y = 0; y < strArraySongGenre.size(); y++) {
                        
                        // Capturing the data in variable strGenre
                        String strGenre = strArraySongGenre.get(y);
                        
                        // If hashMap contains the genre already, we're increasing the count by 1
                        if (hashMapGenreCounts.containsKey(strGenre)) {

                            hashMapGenreCounts.put(strGenre, hashMapGenreCounts.get(strGenre) + 1);
                        }
                        
                        // If hashMap does not contain the genre, we're adding it to the hashMap
                        else {

                            hashMapGenreCounts.put(strGenre, 1);
                        }

                    }

                    // Printing meaningful summary information about the playlist
                    System.out.println("\nYour Playlist name is " + strUsrPlayListName + ".It has total of " +
                            strArraySongNameTracker.size()
                            + " songs.\nThe Total Amount of time that this playlist would consume if all songs were played would be "
                            +
                            intTotalSongDurationSec + " second(s).\nThe average song duration would be " +
                            intAvgSongDurationSec + " second(s).\n");
                    
                    // Printing the count of songs in each genre 
                    System.out.println("The Count of Songs in each genre: ");
                    System.out.println(
                            "-----------------------------------------------------------------------------------------------------------------");

                    // Creating the "Set" and "Iterator" to get key and values from hash map
                    Set<Map.Entry<String, Integer>> setDisplay = hashMapGenreCounts.entrySet();
                    Iterator<Map.Entry<String, Integer>> iterator = setDisplay.iterator();
                    
                    // Creating the "while" loop for data retrieval from hashmap
                    while (iterator.hasNext()) {

                        Map.Entry<String, Integer> mapEntry = iterator.next();

                        // Getting the key from hash map
                        String strKeyGenreVal = mapEntry.getKey();

                        // Getting the value from hash map
                        int intCount = mapEntry.getValue();

                        // Printing the data in correct format
                        System.out.println(strKeyGenreVal + ": " + intCount);

                    }
                    
                    System.out.println(
                            "-----------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\n Thank you.");
                    System.out.println(
                            "-----------------------------------------------------------------------------------------------------------------------------");

                    // Creating a txt file to export the data
                    String strplaylistName = strUsrPlayListName.replaceAll("\\s", "_");
                    String strfileName = strplaylistName + ".txt";
                    
                    // Using Try and catch method 
                    try {

                        // Creating the FileWriter
                        FileWriter fileWriter = new FileWriter(strfileName);

                        // Creating the BufferedWriter
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                        // Writing individual song details to the txt file using "for" loop
                        for (int p = 0; p < intUsrPlayListSongCnt; p++) {
                            
                            // Calculating the song number
                            int intValCount2 = p + 1;
        
                            bufferedWriter.write("Song " + intValCount2 + " Details:");
                            bufferedWriter.newLine();
                            bufferedWriter.write("------------------------------------------------------------");
                            bufferedWriter.newLine();
                            
                            // Writing the song name to txt file
                            bufferedWriter.write("Song Name: " + strArraySongNameTracker.get(p));
                            bufferedWriter.newLine();
                            
                            // Writing the song artist name to txt file
                            bufferedWriter.write("Song Artist: " + strArraySongArtistName.get(p));
                            bufferedWriter.newLine();
                            
                            // Writing the song duration to txt file
                            bufferedWriter.write("Song Duration (Seconds): " + intArraySongDuration.get(p));
                            bufferedWriter.newLine();
                            
                            // Writing the song genre to txt file
                            bufferedWriter.write("Song Genre: " + strArraySongGenre.get(p));
                            bufferedWriter.newLine();
                            bufferedWriter.newLine();
                            bufferedWriter.write("-------------------------------------------------------------");
                            bufferedWriter.newLine();
                            bufferedWriter.newLine(); // Adding a blank line for formatting
                        }

                        // Writing the meaningful summary information about the playlist data to the txt file
                        bufferedWriter.write("Your playlist Name is " + strUsrPlayListName + ".It has a total of "
                                + strArraySongNameTracker.size() + " songs.");
                        bufferedWriter.newLine();
                        bufferedWriter.write(
                                "The Total Amount of time that this playlist would consume if all songs were played would be "
                                        + intTotalSongDurationSec + " second(s).");
                        bufferedWriter.newLine();
                        bufferedWriter
                                .write("The average song duration would be " + intAvgSongDurationSec
                                        + " second(s).");
                        bufferedWriter.newLine();
                        bufferedWriter.newLine();
                        
                        // Writing the count of songs in each genre to the txt file 
                        bufferedWriter.write("The Count of Songs in each genre: ");
                        bufferedWriter.newLine();
                        bufferedWriter.write(
                                "-------------------------------------------------------------------------------------------");
                        bufferedWriter.newLine();
                        
                        // Using "for" loop to get the data from hash map and writing to the txt file
                        for (Map.Entry<String, Integer> mapEntry1 : hashMapGenreCounts.entrySet()) {
                            String strGenreTxtFile = mapEntry1.getKey();
                            int intCountTxtFile = mapEntry1.getValue();
                            bufferedWriter.write(strGenreTxtFile + ": " + intCountTxtFile);
                            bufferedWriter.newLine();
                        }
                        
                        // Formatting the lines in txt file
                        bufferedWriter.write("-------------------------------------------------------------");
                        bufferedWriter.newLine();
                        
                        // Closing the buffered Writer
                        bufferedWriter.close();

                        System.out.println("\nPlaylist data written to file " + strfileName + " \n");

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    // Turning off the Loop Switch
                    blnMainLoopSwitch = false;

                }

                // If user enters invalid number, we're breaking the loop
                else {
                    System.out.println(
                            "\nSorry! Invalid Number Entered. Minimum of 3 songs needs to be in Playlist and Maximum of 10 songs can be added to playlist.\n");
                    System.out.println(
                            "----------------------------------------------------------------------------------------------------------------------------------------");
                    break;
                }

            } // End of Main Else if statement

            // if user enters invalid number, we're breaking the loop
            else {
                System.out.println(
                        "--------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\nSorry ! Invalid Option\n");
                System.out.println(
                        "--------------------------------------------------------------------------------------------------------------------------------------------");
                break;
            }

        } // End of While loop

        // Closing scanner object
        scnr.close();
    }

}
