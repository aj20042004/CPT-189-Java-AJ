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
        Circle circleBlue = new Circle(150,150,63,Color.TRANSPARENT);
        circleBlue.getStrokeLineCap();                  
        circleBlue.setStrokeWidth(3);
        circleBlue.setStroke(Color.BLUE);
        Group grpOlympic = new Group(circleBlue); // rename this as grpOlympic

        // Olympic Top Middle Black Circle
        Circle circleBlack = new Circle(287,150,63,Color.TRANSPARENT);
        circleBlack.getStrokeLineCap();                  
        circleBlack.setStrokeWidth(3);
        circleBlack.setStroke(Color.BLACK);
        grpOlympic.getChildren().add(circleBlack);

        // Olympic Top End Red Circle
        Circle circleRed = new Circle(424,150,63,Color.TRANSPARENT);
        circleRed.getStrokeLineCap();              
        circleRed.setStrokeWidth(3);
        circleRed.setStroke(Color.RED);
        grpOlympic.getChildren().add(circleRed);

        // Olympic Bottom front Yellow Circle
        Circle circleYellow = new Circle(219,230,63,Color.TRANSPARENT);
        circleYellow.getStrokeLineCap();                  
        circleYellow.setStrokeWidth(3);
        circleYellow.setStroke(Color.YELLOW);
        grpOlympic.getChildren().add(circleYellow);

        // Olympic Bottom End Green Circle
        Circle circleGreen = new Circle(356,230,63,Color.TRANSPARENT);
        circleGreen.getStrokeLineCap();                  
        circleGreen.setStrokeWidth(3);
        circleGreen.setStroke(Color.GREEN);
        grpOlympic.getChildren().add(circleGreen);
        
        // Creating scene
        Scene scene = new Scene(grpOlympic,600,600);

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

