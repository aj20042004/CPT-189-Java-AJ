/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week07_GUI_Program_2_CheckerBoard
    Author:		AJ
    Language:	Java
    Date:		2023-10-03
    Purpose:	The purpose of this program is to design JavaFX application that displays an 8 * 8 checkerboard 
                with 64 squares, alternating black and red.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-10-03	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the modules 
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class AJ_Week07_GUI_Program_2_CheckerBoard extends Application{
    
    // Start Method 
    @Override
    public void start(Stage appStage) { 
        
        // Creating a GridPane object
        GridPane gridCheckerBoard = new GridPane();
        
        // Creating 2 "for" loops for checker board
        for(int row = 0; row < 8; row++) {
            for(int col = 0; col < 8; col++){ 

                // Creating Reactangle object
                Rectangle rectangleSquare = new Rectangle();
                rectangleSquare.setWidth(50);
                rectangleSquare.setHeight(50);
                
                // Coloring the box (red and black)
                Color colorSquare;
                if ((row + col) % 2 == 0) { 
                    colorSquare = Color.BLACK;
                } 

                else{
                    colorSquare = Color.RED;
                }
                rectangleSquare.setFill(colorSquare);

                // Adding the rectangle object to the GridPane
                gridCheckerBoard.add(rectangleSquare, col, row);

            }
        }
        
        // Creating a HBox and VBox to center the checker board
        HBox hboxContainer = new HBox(gridCheckerBoard);
        hboxContainer.setAlignment(Pos.CENTER);
        VBox vboxContainer = new VBox(hboxContainer);
        vboxContainer.setAlignment(Pos.CENTER);
        
        // Creating a scene
        Scene scene = new Scene(vboxContainer,800,600);

        // Setting the title and name of the scene
        appStage.setScene(scene);
        appStage.setTitle("Checker Board");
        appStage.show();
   
    }

    // Main Method
    public static void main(String[] args) {
        launch(args);
    }
}
