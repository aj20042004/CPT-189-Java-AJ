/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week11_GUI_Program_1_ColorPicker
    Author:		AJ
    Language:	Java
    Date:		2023-10-31
    Purpose:	The purpose of this program is to create a JavaFX application that displays a text field, 
                a color picker and a button. When the user presses the button, or presses return while 
                in the text field, we are going to display the text obtained from the text field in the 
                color selected by the color picker.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-10-31	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

// Importing the modules
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AJ_Week11_GUI_Program_1_ColorPicker extends Application {
    
    // Start Method
    public void start(Stage stgApp) {
        
        // Creating a ColorPicker object
        ColorPicker cpColorPicker = new ColorPicker();

        // Setting the default color as BLACK
        cpColorPicker.setValue(Color.BLACK);

        // Setting the height of the cpColorPicker to 30
        cpColorPicker.setMinHeight(30);
        
        // Creating a TextField object
        TextField txtfieldUserInput = new TextField();

        // Setting the width of txtfieldUserInput to 40
        txtfieldUserInput.setMinWidth(40);

        // Setting the prompt text for txtfieldUserInput
        txtfieldUserInput.setPromptText("Enter the text message here ......!");

        // Setting the style for txtfieldUserInput
        txtfieldUserInput.setStyle(
                "-fx-background-radius: 15; -fx-border-radius: 15; -fx-border-color: #ccc; -fx-background-color: #f4f4f4;");

        // Setting the Height for txtfieldUserInput
        txtfieldUserInput.setPrefHeight(40);
        
        // Creating a Text object txtgoogleLogo1 for displaying the Google Logo
        Text txtgoogleLogo1 = new Text("Google");

        // Setting the font style of txtgoogleLogo1 to "Product Sans"
        txtgoogleLogo1.setFont(Font.font("Product Sans", 80));
        
        // Creating a Text object txtMessage for displaying the text that user enter in txtfieldUserInput
        Text txtMessage = new Text();

        // Setting the font style of txtMessage to "Comic Sans MS"
        txtMessage.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, FontPosture.REGULAR, 24));
        
        // Creating the Button object
        Button btnTextDisplay = new Button("Change the color");

        // Setting the width of btnTextDisplay to 100
        btnTextDisplay.setMinWidth(100);

        // Setting the Height of btnTextDisplay to 100
        btnTextDisplay.setMinHeight(30);
        
        // Adding event handling for btnTextDisplay
        btnTextDisplay.setOnAction(e -> {
            
            // Creating a String variable to store the user entered text from txtfieldUserInput
            String strUserInputText = txtfieldUserInput.getText();

            // Creating a Color variable to store the user selected color from colorUserSelected
            Color colorUserSelected = cpColorPicker.getValue();

            // Setting the txtMessage with the user entered text
            txtMessage.setText(strUserInputText);

            // Setting the txtMessage color with the user selected color
            txtMessage.setFill(colorUserSelected);

        });
        
        // Adding event handling for txtfieldUserInput
        txtfieldUserInput.setOnAction(e -> {
            
             // Creating a String variable to store the user entered text from txtfieldUserInput
            String strUserInputText = txtfieldUserInput.getText();

            // Creating a Color variable to store the user selected color from colorUserSelected
            Color colorUserSelected = cpColorPicker.getValue();

            // Setting the txtMessage with the user entered text
            txtMessage.setText(strUserInputText);

            // Setting the txtMessage color with the user selected color
            txtMessage.setFill(colorUserSelected);

        });
        
        // Creating a HBox object and adding the color picker, button.
        HBox hboxContainer = new HBox(cpColorPicker, btnTextDisplay);

        // Setting the spacing for hboxContainer
        hboxContainer.setSpacing(15);

        // Setting the alignment to "CENTER" for hboxContainer
        hboxContainer.setAlignment(Pos.CENTER);
        
        // Creating a VBox object
        VBox vboxContainer = new VBox();

        // Setting the style of vboxContainer to "GHOSTWHITE"
        vboxContainer.setStyle("-fx-background-color: GHOSTWHITE");

        // Setting the spacing for vboxContainer
        vboxContainer.setSpacing(20);

        // Setting the padding for vboxContainer
        vboxContainer.setPadding(new Insets(50));

        // Setting the alignment to "CENTER" for vboxContainer
        vboxContainer.setAlignment(Pos.CENTER);

        // Adding txtgoogleLogo1, hboxContainer, txtfieldUserInput, txtMessage to vboxContainer
        vboxContainer.getChildren().addAll(txtgoogleLogo1, hboxContainer, txtfieldUserInput, txtMessage);
        
        // Creating and setting the scene
        Scene scene = new Scene(vboxContainer, 800, 600);
        stgApp.setScene(scene);

        // Setting the Title
        stgApp.setTitle("Color Picker");
        stgApp.show();

    }
    
    // Main method
    public static void main(String[] args) {
        launch(args);
    }

}
