/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week04_GUI_Program_1_Logo
    Author:		AJ
    Language:	Java
    Date:		2023-09-12
    Purpose:	The purpose of this program is to display the Olympic Logo using JavaFX.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-12	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the modules
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class AJ_Week04_GUI_Program_1_Logo extends Application{
     
    // Start Method
    public void start(Stage appStage) { 
        
        // Olympic Top Front Blue Circle
        Circle blueCircle = new Circle(150,150,63,Color.WHITE);
        blueCircle.getStrokeLineCap();                  
        blueCircle.setStrokeWidth(3);
        blueCircle.setStroke(Color.BLUE);
        Group group = new Group(blueCircle);

        // Olympic Top Middle Black Circle
        Circle blackCircle = new Circle(287,150,63,Color.WHITE);
        blackCircle.getStrokeLineCap();                  
        blackCircle.setStrokeWidth(3);
        blackCircle.setStroke(Color.BLACK);
        group.getChildren().add(blackCircle);

        // Olympic Top End Red Circle
        Circle redCircle = new Circle(424,150,63,Color.WHITE);
        redCircle.getStrokeLineCap();              
        redCircle.setStrokeWidth(3);
        redCircle.setStroke(Color.RED);
        group.getChildren().add(redCircle);

        // Olympic Bottom front Yellow Circle
        Circle yellowCircle = new Circle(219,230,63,Color.WHITE);
        yellowCircle.getStrokeLineCap();                  
        yellowCircle.setStrokeWidth(3);
        yellowCircle.setStroke(Color.YELLOW);
        group.getChildren().add(yellowCircle);

        // Olympic Bottom End Green Circle
        Circle greenCircle = new Circle(356,230,63,Color.WHITE);
        greenCircle.getStrokeLineCap();                  
        greenCircle.setStrokeWidth(3);
        greenCircle.setStroke(Color.GREEN);
        group.getChildren().add(greenCircle);
        
        // Creating scene
        Scene scene = new Scene(group,600,600);

        // Adding scene to the stage
        appStage.setScene(scene);

        // Setting the title 
        appStage.setTitle("Olympic Logo");
        appStage.show();
    }
    
    // Main Method
    public static void main(String [] args) {
         
        launch(args);

    }
} 

