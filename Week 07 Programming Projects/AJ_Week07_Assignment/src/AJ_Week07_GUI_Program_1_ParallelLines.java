/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week07_Program_1_ParallelLines
    Author:		AJ
    Language:	Java
    Date:		2023-10-03
    Purpose:	The purpose of this program is to design an JavaFX application that draws 20 horizontal, 
                evenly spaced parallel lines of random length
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-10-03	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing modules
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class AJ_Week07_GUI_Program_1_ParallelLines extends Application {
    
    // start method
    public void start(Stage appStage) {
        
        // Creating Pane and Random objects
        Pane pane = new Pane();
        Random randGen = new Random();
        
        // Creating a "For" Loop to print 20 horizontal parallel lines
        for (int i = 0; i < 20; i++) { 

            int length = randGen.nextInt(600);
            Line line = new Line(0,i*20,length,i*20);

            // Adding the Line object to the pane
            pane.getChildren().add(line);
            
        }
        
        // Creating a scene
        Scene scene = new Scene(pane,600,500);

        // Setting the title and scene
        appStage.setTitle("Horizontal Parallel Lines");
        appStage.setScene(scene);
        appStage.show();      
    }
    
    // Main method
    public static void main(String[] args) {
        launch(args);
    }
    
}
