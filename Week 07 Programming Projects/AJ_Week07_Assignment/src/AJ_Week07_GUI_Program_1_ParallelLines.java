/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week07_Program_1_ParallelLines
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

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class AJ_Week07_GUI_Program_1_ParallelLines extends Application {

    public void start(Stage appStage) {

        Pane pane = new Pane();
        Random randGen = new Random();

        for (int i = 0; i < 20; i++) { 

            int length = randGen.nextInt(600);
            Line line = new Line(0,i*20,length,i*20);
            pane.getChildren().add(line);
            
        }

        Scene scene = new Scene(pane,600,500);
        appStage.setTitle("Horizontal Parallel Lines");
        appStage.setScene(scene);
        appStage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
