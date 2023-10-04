/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week07_GUI_Program_2_CheckerBoard
    Author:		AJ
    Language:	Java
    Date:		2023-10-03
    Purpose:	The purpose of this program is to 
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-10-03	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

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

    @Override
    public void start(Stage appStage) { 

        GridPane gridCheckerBoard = new GridPane();
   
        for(int row = 0; row < 8; row++) {
            for(int col = 0; col < 8; col++){ 

                Rectangle rectangleSquare = new Rectangle();
                rectangleSquare.setWidth(50);
                rectangleSquare.setHeight(50);
          

                Color colorSquare;
                if ((row + col) % 2 == 0) { 
                    colorSquare = Color.BLACK;
                } 

                else{
                    colorSquare = Color.RED;
                }
                


                rectangleSquare.setFill(colorSquare);
                gridCheckerBoard.add(rectangleSquare, col, row);

            }
        }

        HBox hboxContainer = new HBox(gridCheckerBoard);
        hboxContainer.setAlignment(Pos.CENTER);

        VBox vboxContainer = new VBox(hboxContainer);
        vboxContainer.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vboxContainer,800,600);
        appStage.setScene(scene);
        appStage.setTitle("Checker Board");
        appStage.show();
   
    }


    public static void main(String[] args) {
        launch(args);
    }
}
