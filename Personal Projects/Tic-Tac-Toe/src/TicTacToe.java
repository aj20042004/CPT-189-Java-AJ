/*
----------------------------------------------------------------------------------------------------------
    Name:		TicTacToe
    Author:		AJ
    Language:	Java
    Date:		2023-09-02
    Purpose: The purpose of this program is to create a Basic Tic Tac Toe game Using main, showGameBoard, checkWinner, PiecePlacement methods. I used List to store all the winning
             combination. Created a separate array to store all the positons played by user and computer. Checked whether the playerPosition and cpuPosition array values matches 
             the winning combination values. Created a separate method to print all the characters of the board. Created a separate function to place the piece of in the board. Used switch
             statement to compare place the values. When new input was received from user, compared the existing playerPosition and cpuPosition array whether the values already existed.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-02	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing all the required modules
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; 

// Creating the main class
public class TicTacToe {

    // Creating the Array List to store all the moves of computer and player. By using the values, we will be able to check the winner by comparing to conditions
    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    // Main method
    public static void main(String[] args) throws Exception {
        
      // By Default, the user is 'X' character
        System.out.println("Welcome to Tic Tac Toe");
        System.out.println("Your the Player : X");
        System.out.println();

        // Creating Tic Tac Toe Board using 2D array
        char [][] gameBoard = { 
          {' ','|',' ','|',' '},
          {'-','+','-','+','-'},
          {' ','|',' ','|',' '},
          {'-','+','-','+','-'},
          {' ','|',' ','|',' '},
        };
        
        // Printing the board here 
        ShowGameBoard(gameBoard);
        
        /* Creating a loop statement to get the input from user and also concurrently 
        checking whether the entered input already exists. If exists, then prompting the user to choose other options */
        while(true) { 
            
          // Intializing the Scanner to get the input
          Scanner scan = new Scanner(System.in);
            System.out.println("Enter your Place (1-9): ");
            int PlayerPos = scan.nextInt();
            
            // Checking whether the entered values already exists
            while(playerPositions.contains(PlayerPos) || cpuPositions.contains(playerPositions) ) { 
                    System.out.println("Position taken !!! Enter a correct position");
                    PlayerPos = scan.nextInt();
            } 
            
            // Placing the character 'X' in the position that user entered
            PiecePlacement(gameBoard, PlayerPos, "player");
            
            // Checking for winner using checkWinner method after the user entered the input
            String result = checkWinner();
            if (result.length() > 0)  { 
              System.out.println(result);
              System.out.println("Game Over");
              break;  
            }
            
            // Continuing game, if there is no winner. Computer uses random module to place characters 
            Random rand = new Random();
            
            // Generating random values from 1 to 9
            int cpuPos = rand.nextInt(9) + 1;

            // Checking whether random genrated value already exists in playerPosition or cpuPosition arrays 
            while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos) ) {                    
                    cpuPos = rand.nextInt(9) + 1;
            }
            
            // Placing the random generated value in the game
            PiecePlacement(gameBoard, cpuPos, "computer");
            
            // Printing the board
            ShowGameBoard(gameBoard);
            
            // Checking for winner after placing the character for computer
            result = checkWinner();
            if (result.length() > 0)  {              
              System.out.println(result);
              System.out.println("Game Over");
              break;                                         
            }
        }
    }

    // Creating a separate method to print the empty board
    public static void ShowGameBoard(char [][] gameBoard) { 

       // Printing the Board using 2 loops
       for(int i = 0; i < gameBoard.length; i++) {
          for (int j = 0; j < gameBoard[i].length; j++) {           
            char c = gameBoard[i][j];
            System.out.print(c);
          }
          System.out.println();
       }
    }

    // Creating a separate method to Place the piece in the board. By using user or computer random generated input, we are placing the characters on the board.
    public static void PiecePlacement(char [][] gameBoard, int pos, String user) {
       
      // Deafult Value
      char symbol = ' '; 
       
      // By default, the user is player 'X' and we are adding the position entered to the game board
      if (user.equals("player")) {
             symbol = 'X';
             playerPositions.add(pos);
      } 
       
      // When it's computer's turn, we placing the random generated position to the board
      else if (user.equals("computer")) { 
             symbol = 'O';
             cpuPositions.add(pos);
      }
      
      // Adding the character in the correct position of the board
      switch(pos) { 

        case 1:
          gameBoard[0][0] = symbol;
          break;

        case 2:
          gameBoard[0][2] = symbol;
          break;

        case 3:
          gameBoard[0][4] = symbol;
          break;

        case 4:
          gameBoard[2][0] = symbol;
          break;

        case 5:
          gameBoard[2][2] = symbol;
          break;

        case 6:
          gameBoard[2][4] = symbol;
          break;

        case 7:
          gameBoard[4][0] = symbol;
          break;

        case 8:
          gameBoard[4][2] = symbol;
          break;

        case 9:
          gameBoard[4][4] = symbol;
          break;

        default:
          break;
      }
    }

    // Creating a separate methods to check the winner
    public static String checkWinner() { 
        
        // Creating all the winning combination
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List bottomRow = Arrays.asList(7,8,9);
        List colOne = Arrays.asList(1,4,7);
        List colTwo = Arrays.asList(2,5,8);
        List colThree = Arrays.asList(3,6,9);
        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(7,5,3);
        
        // Adding all the winning combination in one array
        List<List> winningConditions = new ArrayList<List>();
        winningConditions.add(topRow);
        winningConditions.add(midRow);
        winningConditions.add(bottomRow);
        winningConditions.add(colOne);
        winningConditions.add(colTwo);
        winningConditions.add(colThree);
        winningConditions.add(cross1);
        winningConditions.add(cross2);
        
        // A loop to check if playerPosition contains elements in the pattern in winning combination
        for (List l : winningConditions) { 
           if (playerPositions.containsAll(l)) {
             return "Congratulations you won !!! ";
           } 
           else if (cpuPositions.containsAll(l)) {
            return "Computer wins !!! ";
           }
           else if (playerPositions.size() + cpuPositions.size() == 9) { return "Tie !!";}
        }
        return "";
    }
}
