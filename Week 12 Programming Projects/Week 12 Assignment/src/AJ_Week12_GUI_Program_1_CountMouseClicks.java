/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week12_GUI_Program_1_CountMouseClicks
    Author:		AJ
    Language:	Java
    Date:		2023-11-06
    Purpose:	The purpose of this program is to create a JavaFX application that counts the number of
                times the mouse button has been clicked on the scene. We're displaying the number at the
                top of the window in a message that says "You have clicked the mouse nnn times." We're also
                including a button to reset the counter and informing user that the counter has been reset.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-11-06	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the modules
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

// Creating a CountMouseClicks class
public class AJ_Week12_GUI_Program_1_CountMouseClicks extends Application {
    
    // Creating private variables 
    private int intCounter = 0;
    private Text txtResetTheCounter = new Text();
    private Text txtInstructions = new Text();
    
    // Start Method
    public void start(Stage stgApp) {
        
        // Creating a text node
        txtInstructions.setText("You have clicked the mouse " + intCounter + " times");

        // Setting the Font style to the text node
        txtInstructions.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 28));
        
        // Creating a button for Resetting the counter
        Button btnReset = new Button("Reset the Counter");

        // Setting the Height and Width for the button "btnReset"
        btnReset.setMinHeight(40);
        btnReset.setMinWidth(100);
        
        // When button is clicked, the method resetCounter is going to reset the counter to "0"
        btnReset.setOnAction(e -> resetCounter());
        
        // Creating a BorderPane object "borderPane"
        BorderPane borderPane = new BorderPane();
        
        // Setting the background color to "GHOSTWHITE"
        borderPane.setBackground(new Background(new BackgroundFill(Color.GHOSTWHITE, CornerRadii.EMPTY, Insets.EMPTY)));

        // Setting the alignment for text node "txtInstructions"
        borderPane.setTop(txtInstructions);
        BorderPane.setAlignment(txtInstructions, Pos.CENTER);
        
        // Setting the alignment for button "btnReset"
        borderPane.setCenter(btnReset);
        BorderPane.setAlignment(btnReset, Pos.CENTER);

        // Setting the margin for button "btnReset"
        BorderPane.setMargin(btnReset, new Insets(15));
        
        // Setting the alignment for text node "txtResetTheCounter"
        borderPane.setBottom(txtResetTheCounter);
        BorderPane.setAlignment(txtResetTheCounter, Pos.CENTER);

        // Setting the margin for text node "txtResetTheCounter"
        BorderPane.setMargin(txtResetTheCounter, new Insets(15));
        
        // Creating the scene
        Scene scnMyScene = new Scene(borderPane, 800, 700);

        // Increasing the counter by 1 when mouse button is clicked
        scnMyScene.setOnMouseClicked(this::processMousePress);

        // Setting the scene and title
        stgApp.setScene(scnMyScene);
        stgApp.setTitle("Counter");
        stgApp.show();

    }
     
    // Creating the processMousePress method to increase the count by 1 when mouse button is clicked
    public void processMousePress(MouseEvent event) {

        // Updating the text for the text node "txtResetTheCounter"
        txtResetTheCounter.setText("");

        // Increasing the counter by 1
        intCounter += 1;

        // Updating the text for the text node "txtInstructions"
        txtInstructions.setText("You have clicked the mouse " + intCounter + " times");
        txtInstructions.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 28));
    }
    
    // Creating a resetCounter method to reset the counter to "0" when the button is clicked
    private void resetCounter() {

        // Setting the counter to 0
        intCounter = 0;

        // Updating the text for the text node "txtInstructions"
        txtInstructions.setText("You have clicked the mouse " + intCounter + " times");
        txtInstructions.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 28));

        // Updating the text for the text node "txtResetTheCounter"
        txtResetTheCounter.setText("Your Counter has been reset ! ");
        txtResetTheCounter.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 25));

    }
    
    // Main method
    public static void main(String[] args) {
        launch(args);
    }

}
