/*
----------------------------------------------------------------------------------------------------------
    Name:		AJ_Week11_GUI_Program_1_ColorPicker
    Author:		AJ
    Language:	Java
    Date:		2023-10-31
    Purpose:	The purpose of this program is to 
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    AJ		2023-10-31	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

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

    public void start(Stage stgApp) {

        ColorPicker cpColorPicker = new ColorPicker();
        cpColorPicker.setValue(Color.BLACK);
        cpColorPicker.setMinHeight(30);

        TextField txtfieldUserInput = new TextField();
        txtfieldUserInput.setMinWidth(40);
        txtfieldUserInput.setPromptText("Enter the text message here ......!");
        txtfieldUserInput.setStyle(
                "-fx-background-radius: 15; -fx-border-radius: 15; -fx-border-color: #ccc; -fx-background-color: #f4f4f4;");
        txtfieldUserInput.setPrefHeight(40);

        Text txtgoogleLogo1 = new Text("Google");
        txtgoogleLogo1.setFont(Font.font("Product Sans", 80));

        Text txtMessage = new Text();
        txtMessage.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, FontPosture.REGULAR, 24));

        Button btnTextDisplay = new Button("Change the color");
        btnTextDisplay.setMinWidth(100);
        btnTextDisplay.setMinHeight(30);

        btnTextDisplay.setOnAction(e -> {

            String strUserInputText = txtfieldUserInput.getText();
            Color colorUserSelected = cpColorPicker.getValue();
            txtMessage.setText(strUserInputText);
            txtMessage.setFill(colorUserSelected);

        });

        txtfieldUserInput.setOnAction(e -> {

            String strUserInputText = txtfieldUserInput.getText();
            Color colorUserSelected = cpColorPicker.getValue();
            txtMessage.setText(strUserInputText);
            txtMessage.setFill(colorUserSelected);

        });

        HBox hboxContainer = new HBox(cpColorPicker, btnTextDisplay);
        hboxContainer.setSpacing(15);
        hboxContainer.setAlignment(Pos.CENTER);

        VBox vboxContainer = new VBox();
        vboxContainer.setStyle("-fx-background-color: GHOSTWHITE");
        vboxContainer.setSpacing(20);
        vboxContainer.setPadding(new Insets(50));
        vboxContainer.setAlignment(Pos.CENTER);
        vboxContainer.getChildren().addAll(txtgoogleLogo1, hboxContainer, txtfieldUserInput, txtMessage);

        Scene scene = new Scene(vboxContainer, 800, 600);
        stgApp.setScene(scene);
        stgApp.setTitle("Color Picker");
        stgApp.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
