/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week10_GUI_Program_3_StackPane
    Author:		AJ
    Language:	Java
    Date:		2023-10-24
    Purpose:	The purpose of this program is to create a stackpane to stack 5 different shapes(with decreasing
                size) on top of each other. Also, placing my name as a text object on the top level in 20
                point size.
                
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-10-24	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the modules
import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class AJ_Week10_GUI_Program_3_StackPane extends Application {
    
    // Start method
    @Override
    public void start(Stage stgApp) {
        
        // Creating a Text Node to display the my name "Athul Jaishankar (AJ)"
        Text txtNameDescription = new Text("Athul Jaishankar (AJ)");
        
        // Setting the font size to 20 and font style to Comic Sans MS
        txtNameDescription.setFont(new Font("Comic Sans MS", 20));

        // Setting the font color to "BLACK"
        txtNameDescription.setFill(Color.BLACK);
        
        // Creating the rectangle shape
        Rectangle rectangleShape = new Rectangle(400, 400);

        // Setting the rectangle color to semi-transparent red
        rectangleShape.setFill(Color.rgb(255, 0, 0, 0.5));

        // Setting the solid black border
        rectangleShape.setStroke(Color.BLACK);

        // Setting the border width to 2
        rectangleShape.setStrokeWidth(2);
        
        // Creating the circle shape
        Circle circleShape = new Circle(170);

        // Setting the circle color to semi-transparent green
        circleShape.setFill(Color.rgb(0, 255, 0, 0.5));

        // Setting the solid black border
        circleShape.setStroke(Color.BLACK);

        // Setting the border width to 2
        circleShape.setStrokeWidth(2);
        
        // Creating the ellipse shape
        Ellipse ellipseShape = new Ellipse(110,80);

        // Setting the ellipse color to semi-transparent blue
        ellipseShape.setFill(Color.rgb(0, 0, 255, 0.5));

        // Setting the solid black border
        ellipseShape.setStroke(Color.BLACK);

        // Setting the border width to 2
        ellipseShape.setStrokeWidth(2);
        
        // Creating the polygon shape
        Polygon polygonShape = new Polygon();
        polygonShape.getPoints().addAll(
            1.0, 1.0,
            130.0, 0.0,
            65.0, 100.0
        );

        // Setting the polygon color to semi-transparent orange
        polygonShape.setFill(Color.rgb(255, 165, 0, 0.5));

        // Setting the solid black border
        polygonShape.setStroke(Color.BLACK);

        // Setting the border width to 2
        polygonShape.setStrokeWidth(2);
        
        // Creating the arc shape
        Arc arcShape = new Arc(100,100,30,30,2,180);

        // Setting the arc color to semi-transparent purple
        arcShape.setFill(Color.rgb(128, 0, 128, 0.5));
        
        // Setting the solid black border
        arcShape.setStroke(Color.BLACK);
        arcShape.setStrokeWidth(2);
        
        // Creating a StackPane to add all the shapes on top of each other
        StackPane stackPaneShapes = new StackPane();
        stackPaneShapes.getChildren().addAll(rectangleShape,circleShape,ellipseShape,polygonShape,arcShape);
        
        // Creating a StackPane to add the text object
        StackPane stackPaneText = new StackPane();
        stackPaneText.getChildren().add(txtNameDescription);
        
        // Creating the borderPane
        BorderPane borderPane = new BorderPane();

        // Using borderPane to set the text on the top level
        borderPane.setTop(stackPaneText);

        // Using the borderPane to set the shape in the center
        borderPane.setCenter(stackPaneShapes);
        
        // Creating the scene and adding borderPane in it
        Scene scene = new Scene(borderPane, 800, 600);

        // Setting the scene to stgApp
        stgApp.setScene(scene);

        // Setting the title to stgApp
        stgApp.setTitle("StackPane Project");
        stgApp.show();
    }
    
    // Main method
    public static void main(String[] args) {
        launch(args);
    }

}
