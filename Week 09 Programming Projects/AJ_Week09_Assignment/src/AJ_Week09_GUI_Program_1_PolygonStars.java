
/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week09_GUI_Program_1_PolygonStars
    Author:		AJ
    Language:	Java
    Date:		2023-10-17
    Purpose:	The purpose of this program is to present 5 stars of different colors and scaled to various sizes.
                We are defining a class caleld Star that extends Polygon and is shaped like five-pointed star.
                The star class constructor uses parameters to specify the color, position and scale of the star.
    
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-10-17	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the modules
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;

public class AJ_Week09_GUI_Program_1_PolygonStars extends Application {
    
    // start method
    @Override
    public void start(Stage appStage) throws Exception {
        
        // Creating the pane object
        Pane pane = new Pane();
        
        // Creating star objects for star class. Initializing the class with parameters
        Star starRed = new Star(Color.RED, 100, 120, 0.9);
        Star starOrange  = new Star(Color.ORANGE, 550, 60, 1.2);
        Star starGreen = new Star(Color.GREEN, 120, 400, 1.9);
        Star starYellow = new Star(Color.YELLOW, 700, 350, 2.7);
        Star starBlue = new Star(Color.BLUE, 350, 200, 0.5);
        
        // Adding all the star objects to the pane
        pane.getChildren().addAll(starRed, starOrange, starGreen, starYellow, starBlue);
        
        // Creating and setting the scene
        Scene scene = new Scene(pane, 1100, 700);
        appStage.setScene(scene);

        // Title for the scene
        appStage.setTitle("Star Polygon");
        appStage.show();

    }
    
    // Star class that extends Polygon
    class Star extends Polygon {
        Star(Color color, double dblX, double dblY, double dblScale) {

            // Adding all the co-ordinate points to create a star
            getPoints().addAll(

                    100.0, 10.0,
                    40.0, 180.0,
                    190.0, 60.0, 
                    10.0, 60.0, 
                    160.0, 180.0 

            );
            
            // Setting the color, position and scale for the star
            setFill(color);
            setScaleX(dblScale);
            setScaleY(dblScale);
            setTranslateX(dblX);
            setTranslateY(dblY);
        }
    }
    
    // Main method
    public static void main(String[] args) {
        launch(args);
    }
}
