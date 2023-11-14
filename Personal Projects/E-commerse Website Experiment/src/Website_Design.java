/*
----------------------------------------------------------------------------------------------------------
    Name:		website_Design
    Author:		AJ
    Language:	Java
    Date:		2023-11-10
    Purpose:	The purpose of this program is to 
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-11-10	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Website_Design extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Create a button
        Button styledButton = new Button("Click me");

        // Apply the CSS style class to the button
        styledButton.getStyleClass().add("button-secondary");

        // Create a scene
        Scene scene = new Scene(styledButton, 300, 200);

        // Link the CSS file to the scene
        scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());

        // Set the scene for the stage
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.setTitle("Styled Button Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
