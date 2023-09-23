/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week05_GUI_Program_3_RandNumBtw1And100
    Author:		AJ
    Language:	Java
    Date:		2023-09-23
    Purpose:	The purpose of this program is to display a button and a number. Every time the button is 
                pushed, we're generating a random value between 1 and 100.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-09-23	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the modules
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;

public class AJ_Week05_GUI_Program_3_RandNumBtw1And100 extends Application {
    
    // Private variables 
    private Text txtInstructions; 
    
    // Start method
    @Override
    public void start(Stage stgAppStage){
        
        // Creating a Text Node to display the random number
        txtInstructions = new Text("Click the Button to Generate a Number between 1 and 100 --> ");
        txtInstructions.setFont(Font.font("Arial", FontWeight.BOLD, 18));
        txtInstructions.setStroke(Color.BLACK);
        
        // Creating a Button
        Button btnGenerateRandNum = new Button("Generate Random Number");
        btnGenerateRandNum.setOnAction(e -> generateRandomNumber());
        
        // Creating a VBox
        VBox vboxParentContainer = new VBox(20);
        vboxParentContainer.getChildren().addAll(txtInstructions,btnGenerateRandNum);
        vboxParentContainer.setAlignment(Pos.CENTER);
        Scene scnMyScene = new Scene(vboxParentContainer,800,700);
        
        // Setting the Title for our app
        stgAppStage.setTitle("Random Values from 1 to 100");
        stgAppStage.setScene(scnMyScene);
        stgAppStage.show();

    }
    
    // Creating a private method generateRandomNumber() for generating numbers between 1 and 100.
    private void generateRandomNumber(){

        Random randGen = new Random();

        // Getting the random values between 1 and 100
        int intRandNum = randGen.nextInt(100) + 1;

        // Printing the updated values
        txtInstructions.setText("Generated Random Number: " + intRandNum);
    }

    // Main method
    public static void main(String[] args) {
        launch(args);
    }
    
}
