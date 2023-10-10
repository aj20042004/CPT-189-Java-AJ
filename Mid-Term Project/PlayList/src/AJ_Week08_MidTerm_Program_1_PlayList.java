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

// Notes:
// Shift + Alt + F (To Align the code)

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AJ_Week08_MidTerm_Program_1_PlayList {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        boolean blnMainLoopSwitch = true;

        while (blnMainLoopSwitch) {

            System.out.println("\nWelcome to Playlist App !");
            System.out
                    .println("--------------------------------------------------------------------------------------");
            System.out.print("Do you want to create a Music Play List ? Type '0' to create or type '-1' to exit: ");       // Need to clarify
                                                                                                                                                                                                                                         
            int intUsrOption = scnr.nextInt();
            scnr.nextLine();

            if (intUsrOption == -1) {
                System.out.println("\nThank you !!!");
                System.out.println(
                        "---------------------------------------------------------------------------------------");
                blnMainLoopSwitch = false;
            }

            else if (intUsrOption == 0) {

                System.out.print("\nName of the Playlist: ");
                String strUsrPlayListName = scnr.nextLine();
                System.out.println(
                        "-----------------------------------------------------------------------------------------------");
                System.out.println(
                        "\nMinimum of 3 songs needs to be in Playlist and Maximum of 10 songs can be added to playlist.");
                System.out.println(
                        "--------------------------------------------------------------------------------------------");
                System.out.print("How many songs will be in Playlist ? \n");
                int intUsrPlayListSongCnt = scnr.nextInt();
                scnr.nextLine();

                if (intUsrPlayListSongCnt < 3) {
                    System.out.println("Sorry ! Minimum songs needs to be stored is 3");
                    break;
                }

                else if (intUsrPlayListSongCnt >= 3 & intUsrPlayListSongCnt <= 10) {

                    // Creating the List
                    List<String> strArraySongNameTracker = new ArrayList<>(intUsrPlayListSongCnt);
                    List<String> strArraySongArtistName = new ArrayList<>(intUsrPlayListSongCnt);
                    List<Integer> intArraySongDuration = new ArrayList<>(intUsrPlayListSongCnt);
                    List<String> strArraySongGenre = new ArrayList<>(intUsrPlayListSongCnt);

                    for (int i = 0; i < intUsrPlayListSongCnt; i++) {

                        int intValCount = i + 1;
                        System.out.print("\nSong " + intValCount + " Details:\n");
                        System.out.println("-----------------------------------------");

                        // Song name
                        System.out.print("\nEnter the Song Name please: ");
                        String strSongName = scnr.nextLine();
                        strArraySongNameTracker.add(strSongName);

                        // Artist name
                        System.out.print("\nEnter the Artist Name: ");
                        String strSongArtist = scnr.nextLine();
                        strArraySongArtistName.add(strSongArtist);

                        // Song Duration
                        System.out.print("\nEnter the Song Duration (In Seconds): "); // Need to clarify the minutes or
                                                                                      // seconds ?
                        int intDurationSongData = scnr.nextInt();
                        intArraySongDuration.add(intDurationSongData);
                        scnr.nextLine();

                        // Song Genre
                        System.out.print("\nEnter the song genre (eg: Pop, Rock, Rap, Country, etc..): ");
                        String strGenreSong = scnr.nextLine();
                        strArraySongGenre.add(strGenreSong);

                    }

                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("\nDetails about Your Songs:");
                    System.out.println("----------------------------------------------------------------------");

                    // Printing all the data
                    for (int k = 0; k < intUsrPlayListSongCnt; k++) {

                        int intValCount2 = k + 1;

                        System.out.println("\nSong " + intValCount2 + " Details:\n");

                        System.out.print("Song Name: " + strArraySongNameTracker.get(k) + "\n");
                        System.out.print("Song Artist: " + strArraySongArtistName.get(k) + "\n");
                        System.out.print("Song Duration in Seconds: " + intArraySongDuration.get(k) + "\n");
                        System.out.print("Song Genre: " + strArraySongGenre.get(k) + "\n");
                        System.out.println(
                                "-----------------------------------------------------------------------------------------------------------------------");

                    }

                    System.out.print(
                            "If you need to make any changes to songs data. Type the 'name of the song' to make changes otherwise press 'Enter': ");
                    String strUsrEditOption = scnr.nextLine();

                    // Need to check the options

                    if (strArraySongNameTracker.contains(strUsrEditOption)) {

                        System.out.println("\nWhat Song data needs to be changed:");
                        System.out.println("------------------------------------------------");
                        System.out.println("1. Song Name");
                        System.out.println("2. Song Artist");
                        System.out.println("3. Song Duration");
                        System.out.println("4. Song Genre");

                        System.out.println("\nEnter the Option Number: ");
                        int intUsrEditOptionNumber = scnr.nextInt();
                        scnr.nextLine();

                        if (intUsrEditOptionNumber == 1) {

                            int intIndexValOfName = strArraySongNameTracker.indexOf(strUsrEditOption);
                            System.out.println("-----------------------------------------------------");
                            System.out.println("Enter new song name: ");
                            String strUpdatingSongName = scnr.nextLine();

                            strArraySongNameTracker.set(intIndexValOfName, strUpdatingSongName);
                            System.out.println("\nSuccessfully Updated the Song Name data\n");

                        }

                        else if (intUsrEditOptionNumber == 2) {

                            // Song Artist name update
                            int intIndexValOfArtist = strArraySongNameTracker.indexOf(strUsrEditOption);
                            System.out.println("----------------------------------------------------------");
                            System.out.println("Enter new Artist name: ");
                            String strUpdatingArtistName = scnr.nextLine();

                            strArraySongArtistName.set(intIndexValOfArtist, strUpdatingArtistName);
                            System.out.println("\nSuccessfully Updated the Song Artist data\n");

                        }

                        else if (intUsrEditOptionNumber == 3) {

                            // Song Duration update
                            int intIndexValOfDuration = strArraySongNameTracker.indexOf(strUsrEditOption);
                            System.out.println("----------------------------------------------------------");
                            System.out.println("Enter new song duration in seconds: ");
                            int strUpdatingSongDuration = scnr.nextInt();
                            scnr.nextLine();

                            intArraySongDuration.set(intIndexValOfDuration, strUpdatingSongDuration);
                            System.out.println("\nSuccessfully Updated the Song Duration data\n");

                        }

                        else if (intUsrEditOptionNumber == 4) {

                            // Song genre update
                            int intIndexValOfGenre = strArraySongNameTracker.indexOf(strUsrEditOption);
                            System.out.println("----------------------------------------------------------");
                            System.out.println("Enter new Genre name (eg: Pop, Rock, Rap, Country, etc..): ");
                            String strUpdatingGenreName = scnr.nextLine();

                            strArraySongGenre.set(intIndexValOfGenre, strUpdatingGenreName);
                            System.out.println("\nSuccessfully Updated the Song Genre data");

                        }

                        else {
                            System.out.println("\nInvalid Option Number");
                            break;
                        }
                    }

                    // Needed to Work here
                    System.out.println("\n");
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Playlist Name: " + strUsrPlayListName);
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Final List of Songs data");
                    System.out.println("--------------------------------------------------------");

                    int intTotalSongDurationSec = 0; 

                    // Printing all the data
                    for (int p = 0; p < intUsrPlayListSongCnt; p++) {

                        int intValCount2 = p + 1;
                        System.out.println("\nSong " + intValCount2 + " Details:\n");
                        System.out.print("Song Name: " + strArraySongNameTracker.get(p) + "\n");
                        System.out.print("Song Artist: " + strArraySongArtistName.get(p) + "\n");
                        System.out.print("Song Duration in Seconds: " + intArraySongDuration.get(p) + "\n");
                        intTotalSongDurationSec += intArraySongDuration.get(p);
                        System.out.print("Song Genre: " + strArraySongGenre.get(p) + "\n");

                        System.out.println("-----------------------------------------------------------------------------------------------------------------------");

                    }

                    int intAvgSongDurationSec = intTotalSongDurationSec / intArraySongDuration.size();

                    System.out.println("\nYour Playlist name is " + strUsrPlayListName + ". It has total of " +
                            strArraySongNameTracker.size()
                            + " songs.\nThe Total Amount of time that this playlist would consume if all songs were played would be "
                            +
                            intTotalSongDurationSec + " second(s).\nThe average song duration would be " +
                            intAvgSongDurationSec + " second(s).\n");

                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\n Thank you.");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                    blnMainLoopSwitch = false;

                }

                else {
                    System.out.println(
                            "Sorry! Invalid Number Entered. Minimum of 3 songs needs to be in Playlist and Maximum of 10 songs can be added to playlist.");
                    break;
                }

            } // End of Main Else if statement

            // Invalid entry
            else {
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\nSorry ! Invalid Option");
                break;
            }

        } // End of While loop

        // Closing scanner object
        scnr.close();
    }

}
