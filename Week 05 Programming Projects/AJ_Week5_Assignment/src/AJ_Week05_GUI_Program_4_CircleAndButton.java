/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week05_GUI_Program_4_CircleAndButton
    Author:		AJ
    Language:	Java
    Date:		2023-09-23
    Purpose:	The purpose of this program is to display a button and a circle. Every time the button is 
                pushed, the circle will appear in random location within the window.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-23	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the modules
import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AJ_Week05_GUI_Program_4_CircleAndButton extends Application{
    
    // Private variables 
    private Text txtInstructions;
    private Circle circleRandomPos;
    private Pane pane; 
    
    // Start Method
    @Override
    public void start(Stage stgAppStage){
        
        // Intializing the circle
        circleRandomPos = new Circle(35,Color.YELLOW);
        
        // Creating a pane
        pane = new Pane(circleRandomPos);

        // Creating a text node
        txtInstructions = new Text("Click the Button on the Bottom to Move the circle ->");
        txtInstructions.setFont(Font.font("Arial", FontWeight.BOLD, 18));
        

        // Creating a Button
        Button btnGenerateRandNum = new Button("Move the Circle");

        // Setting the action
        btnGenerateRandNum.setOnAction(e -> generateRandomCoordinates());
        
        // Creating the borderPane for alignment
        BorderPane borderPane = new BorderPane();

        // Setting the text on the top
        borderPane.setTop(txtInstructions);
        BorderPane.setAlignment(txtInstructions, Pos.CENTER);

        borderPane.setCenter(pane);
        BorderPane.setAlignment(pane, Pos.CENTER);

        // Setting the button on the bottom
        borderPane.setBottom(btnGenerateRandNum);
        BorderPane.setAlignment(btnGenerateRandNum, Pos.CENTER);
        BorderPane.setMargin(btnGenerateRandNum, new Insets(15));
        
        // Creating the scene
        Scene scnMyScene = new Scene(borderPane,800,700);
        
        // Setting the Title
        stgAppStage.setTitle("Move the Circle");
        stgAppStage.setScene(scnMyScene);
        stgAppStage.show();

    }
    
    // Creating a private method generateRandomCoordinates() for new co-ordinates
    private void generateRandomCoordinates(){
        
        // Getting the dimensions of the pane
        double paneWidth = pane.getWidth();
        double paneHeight = pane.getHeight();
        
        Random randGen = new Random();

        // Generating random values with the help of randGen
        double dblRandXCoordinate = randGen.nextDouble() * (paneWidth - 2 * circleRandomPos.getRadius()) + circleRandomPos.getRadius();
        double dblRandYCoordinate = randGen.nextDouble() * (paneHeight - 2 * circleRandomPos.getRadius()) + circleRandomPos.getRadius();
       
        // Updating the new co-ordinates for the circle
        circleRandomPos.setCenterX(dblRandXCoordinate);
        circleRandomPos.setCenterY(dblRandYCoordinate);
    }
    
    // Main method
    public static void main(String[] args) {
        launch(args);
    }
    
}
